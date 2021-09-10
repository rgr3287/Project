<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="mMgr" class="ex01.MemberMgr"/>
<%
	request.setCharacterEncoding("EUC-KR");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String msg = "로그인 실패!";
	
	boolean result = mMgr.loginMember(id, pwd);
	if(result){
		session.setAttribute("idKey", id);
		msg = "로그인 성공!";
	}
%>
<script>
	alert("<%=msg%>");
	location.href = "01_login.jsp";
</script>