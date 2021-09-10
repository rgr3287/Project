<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	String id = (String)session.getAttribute("idKey");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="EUC-KR">
    <title>회원가입 폼</title>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/53a8c415f1.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="./login.css">
    <script type="text/javascript" src="script.js"></script>
</head>
<body>
    <div class="wrap">
        <div class="login">
            <h2>FOR u</h2>
            <%if (id != null) {%>
     	 <b><%=id%></b>님 환영 합니다.
         <a href="03_logout.jsp">로그아웃</a>
         <%} else {%>
            <form name="loginFrm" method="post" action="02_loginProc.jsp">
            <div class="login_id">
                <h4>id</h4>
                <input name="id" placeholder="id">
            </div>
            <div class="login_pw">
                <h4>Password</h4>
                <input type="password" name="pwd" placeholder="Password">
            </div>
            <div class="login_etc">
                <div class="checkbox">
                <input type="checkbox" name="" id=""> Remember Me?
                </div>
                <div class="forgot_pw">
                
                <a href="">Forgot Password?</a>
            </div>
            </div>
            <div class="submit">
                <input type="button" value="로그인" onclick="loginCheck()">
            </div>
            <div class="submit">
              <input type="button" value="회원가입" onclick="javascript:location.href='04_member.jsp'">
            </div>
            </form>
    		<%}%>
        </div>
    </div>
</body>
</html>