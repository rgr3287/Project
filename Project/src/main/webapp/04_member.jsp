<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>회원가입 폼</title>
    <link rel="stylesheet" href="./reigster.css">
    <script type="text/javascript" src="script.js"></script>
</head>
<body onLoad="regFrm.id.focus()">
    <div class="main">
        <form name="regFrm" method="post" action="05_memberProc.jsp">
            <h1>FOR u</h1>
            <br>
            <div class="id">
            <label for="name">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp이름</label>
            <br>
            <input type="text" name="name" placeholder="이름"/>
             </div>
            <br>
            <div class="id">
            <label for="name">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspID</label>
            <br>
            <input type="text" name="id" placeholder="id"/>
            <br>
            <input type="button" value="ID중복확인" onClick="idCheck(this.form.id.value)">
             </div>
            <br>
            <div class="pwd">
                <label for="pwd">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp비밀번호</label>
                <br>
                <input type="password" id="pwd" name="pwd" placeholder="비밀번호"/>
                 </div>
                <br>
                <div class="pwdCheck">
                    <label for="pwdCheck">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp비밀번호 확인</label>
                    <br>
                    <input type="password" id="pwdCheck" name="repwd" placeholder="비밀번호 확인"/>
                     </div>
                    <br>

            <div class="date">
                <label for="choseDate">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp생년월일</label>
                    <br>
                    <input type="text" id="choseDate" name="birthday">
            </div>
            <br>
            <div class="hash">
            
                <label for="hash">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp관심분야</label>
                    <br>
                    <input type="checkbox" id="hash" name="hobby" value="여행">여행</input>
                    <input type="checkbox" id="hash" name="hobby" value="음식">음식</input>
                    <input type="checkbox" id="hash" name="hobby" value="사진">사진</input>
                    <input type="checkbox" id="hash" name="hobby" value="장소">장소</input>
                    
            </div>
            <br><br>
            <div class="mail">
                <label for="e_mail">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp이메일</label>
                <br>
                <input type="text" name="email" id="email1" placeholder="이메일"/>@<input type="text" id="email2" name="email2"/>
                <select name="email_select" class="box" id="email_select" onChange="checkemailaddy();">
                    <option value="" selected>선택하세요</option>
                    <option value="naver.com">naver.com</option>
                    <option value="hotmail.com">hotmail.com</option>
                    <option value="hanmail.com">hanmail.com</option>
                    <option value="yahoo.co.kr">yahoo.co.kr</option>
                    <option value="1">직접입력</option>
                </select>
                 </div>
                 <div class="mail2">
                <label for="mail2">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp이메일 인증</label>
                <input type="text" value="" placeholder="인증번호"><br><input type="button" value="인증받기">
                </div>
                <br>
            <div class="pwd">
            <label for="choseDate">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp우편번호</label>
            <input name="zipcode" size="5" readonly>
            <br>
            <input name="address" size="45" placeholder="주소란">
            <br>
            <input type="button" value="우편번호찾기" onClick="zipSearch()">
            </div>
             
            <br>
            <center>
            	<div class="submit">
           			<input type="button" value="회원가입" onclick="inputCheck()">
                </div>
                <div class="submit">
                    <input type="reset" value="다시쓰기">
                </div>
                <div class="submit">
                     <input type="button" value="로그인" onclick="javascript:location.href='01_login.jsp'">
				</div>
				</center>
        </form>
    </div>
    
</body>
</html>