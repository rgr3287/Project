<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="mMgr" class="ex01.MemberMgr" />
<%
   request.setCharacterEncoding("EUC-KR");
   String id = request.getParameter("id");
   boolean result = mMgr.checkId(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ID �ߺ�üũ</title>
</head>
<body>
   <div align="center">
      <br/><b><%=id%></b>
      <%
         if (result) {
            out.println("�� �̹� �����ϴ� ID�Դϴ�.<p/>");
         } else {
            out.println("�� ��� ���� �մϴ�.<p/>");
         }
      %>
      <a href="#" onClick="self.close()">�ݱ�</a>
   </div>
</body>
</html>