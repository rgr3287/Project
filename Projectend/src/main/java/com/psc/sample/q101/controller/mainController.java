package com.psc.sample.q101.controller;
import com.psc.sample.q101.domain.upload;
import com.psc.sample.q101.dto.uploadForm;
import com.psc.sample.q101.domain.uploadRepository;
import com.psc.sample.q101.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Paths;
import java.util.Locale;

@Controller
@Slf4j
public class mainController {

    @Autowired
    uploadRepository ULRepos;

    @Autowired
    UploadService uploadService;


    @GetMapping("foryou/main")
    public String mainPage() {
        return "foryou/main";
    }

    @GetMapping("foryou/myPage")
    public String myPage() {
        return "foryou/myPage";
    }

//    @RequestMapping("/fileUpload")
//    public String fileupload(HttpServletRequest request, @RequestParam("fileName")MultipartFile mFile){
//        try {
//            mFile.transferTo(new File("/Users/yuhangyeol/Desktop/here/" + mFile.getOriginalFilename()));
//                                               // 파일 저장할 절대 경로
//            log.info(mFile.getOriginalFilename());// 로그 확인
//
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return "/forYou/fileUpload";
//    }


    @RequestMapping("foryou/fileUpload")
    public String fileinsert(HttpServletRequest request, @RequestPart MultipartFile files) throws Exception {

        upload file = new upload();

        String sourceFileName = files.getOriginalFilename();
        String sourceFileNameExtension = FilenameUtils.getExtension(sourceFileName).toLowerCase(Locale.ROOT);
        //여기까지함 저거 라이브러리 추가해야함
        File destinationFile;
        String destinationFileName;
        String fileUrl = "/Users/gwaghyungeun/downloads";
        //파일 저장할 위치

        do {
            destinationFileName = RandomStringUtils.randomAlphabetic(32) + "." + sourceFileNameExtension;
            destinationFile = new File(fileUrl + destinationFileName);
        } while (destinationFile.exists());

        destinationFile.getParentFile().mkdirs();
        files.transferTo(destinationFile);

        file.setFileName(destinationFileName);
        file.setFileOrName(sourceFileName);
        file.setFileUrl(fileUrl);
        uploadService.save(file);

        return "forYou/fileUpload";
    }
}
