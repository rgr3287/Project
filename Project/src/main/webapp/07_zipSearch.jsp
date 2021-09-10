<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="ex01.ZipcodeBean"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="mMgr" class="ex01.MemberMgr" />
<%
    request.setCharacterEncoding("EUC-KR");
    String search = request.getParameter("search");
    String area3 = null;
    ArrayList<ZipcodeBean> list = null;
    if (search.equals("y")) {
      area3 = request.getParameter("area3");
      list = mMgr.zipcodeRead(area3);
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�����ȣ �˻�</title>
<script type="text/javascript" src="script.js"></script>
</head>
<body>
   <div align="center">
      <br />
      <form name="zipFrm" method="post">
         <table>
            <tr>
               <td><br/>���θ� �Է� : <input name="area3" 
               onkeypress="if(window.event.keyCode == 13) {loadSearch()}">
                <input type="button" value="�˻�" onclick="loadSearch()">
                </td>
            </tr>
            <!-- �˻���� ���� -->
            <%
               if (search.equals("y")) {
                     if (list.isEmpty()) {
            %>
            <tr>
               <td align="center"><br/>�˻��� ����� �����ϴ�.</td>
            </tr>
            <%
               } else {
            %>
            <tr>
               <td align="center"><br/>�ذ˻� ��, �Ʒ� �����ȣ�� Ŭ���ϸ� �ڵ����� �Էµ˴ϴ�.</td>
            </tr>
            <%
               for (int i = 0; i < list.size(); i++) {
                     ZipcodeBean bean = list.get(i);
                     String rZipcode = bean.getZipcode();
                     String rArea1 = bean.getArea1().trim();
                     String rArea2 = bean.getArea2().trim();
                     String rArea3 = bean.getArea3().trim();
                     String adds = rArea1 + " " + rArea2 + " " + rArea3 + " ";
            %>
            <tr>
               <td><a href="#"
                  onclick="javascript:sendAdd('<%=rZipcode%>','<%=adds%>')">
                     <%=rZipcode%> <%=adds%></a></td>
            </tr>
            <%
               }//for
                  }//if
               }//if
            %>
            <!-- �˻���� �� -->
            <tr>
               <td align="center"><br/>
               <a href="#" onClick="self.close()">�ݱ�</a></td>
            </tr>
         </table>
         <input type="hidden" name="search" value="y">
      </form>
   </div>
</body>
</html>