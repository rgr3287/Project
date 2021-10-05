package com.psc.sample.q101.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.ResolvableType;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BaseContoroller {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	private static final String authorizationRequestBaseUri = "oauth2/authorization";
	Map<String, String> oauth2AuthenticationUrls = new HashMap<>();
	private final ClientRegistrationRepository clientRegistrationRepository;
	
	@GetMapping("/login")
	public String getLoginPage(Model model) throws Exception {
		Iterable<ClientRegistration> clientRegistrations = null;
		ResolvableType type = ResolvableType.forInstance(clientRegistrationRepository)
				.as(Iterable.class);
		if(type != ResolvableType.NONE &&
				ClientRegistration.class.isAssignableFrom(type.resolveGenerics()[0])) {
			clientRegistrations = (Iterable<ClientRegistration>) clientRegistrationRepository;
		}
		assert clientRegistrations != null;
		clientRegistrations.forEach(registration ->
				oauth2AuthenticationUrls.put(registration.getClientName(),
						authorizationRequestBaseUri + "/" + registration.getRegistrationId()));
		model.addAttribute("urls", oauth2AuthenticationUrls);
		
		return "login";
			
	}
	@GetMapping("/login/{oauth2}")
	public String loginGoogle(@PathVariable String oauth2, HttpServletResponse httpServletResponse) {
		return "redirect:/oauth2/authorization/" + oauth2;
	}
	
	@RequestMapping("/accessDenied")
	public String accessDenied() {return "acesssDenied"; }
}
