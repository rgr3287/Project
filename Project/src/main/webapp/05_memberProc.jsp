<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<jsp:useBean id="mgr" class="ex01.MemberMgr"/>
<jsp:useBean id="bean" class="ex01.MemberBean"/>
<jsp:setProperty property="*" name="bean"/>
<%-- 4�� ���������� ������ �Ķ���͵�� bean set�ϰڴ�!
	setId(id (4�� ���������� ���޵� �Ķ����), 
	setPwd(pwd (4�� ���������� ���޵� �Ķ����)), .... 

--%>
<%
	boolean result = mgr.insertMember(bean);
	String msg ="ȸ������ ����!";
	String location = "04_member.jsp";

	if(result){
		msg="ȸ������ ����!";
		location = "01_login.jsp";
	}
%>
<script>
	alert("<%=msg%>");
	location.href = "<%=location%>";
</script>