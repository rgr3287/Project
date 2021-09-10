<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<jsp:useBean id="mgr" class="ex01.MemberMgr"/>
<jsp:useBean id="bean" class="ex01.MemberBean"/>
<jsp:setProperty property="*" name="bean"/>
<%-- 4번 페이지에서 전달한 파라미터들로 bean set하겠다!
	setId(id (4번 페이지에서 전달된 파라미터), 
	setPwd(pwd (4번 페이지에서 전달된 파라미터)), .... 

--%>
<%
	boolean result = mgr.insertMember(bean);
	String msg ="회원가입 실패!";
	String location = "04_member.jsp";

	if(result){
		msg="회원가입 성공!";
		location = "01_login.jsp";
	}
%>
<script>
	alert("<%=msg%>");
	location.href = "<%=location%>";
</script>