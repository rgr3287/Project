<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>ȸ������ ��</title>
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
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp�̸�</label>
            <br>
            <input type="text" name="name" placeholder="�̸�"/>
             </div>
            <br>
            <div class="id">
            <label for="name">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspID</label>
            <br>
            <input type="text" name="id" placeholder="id"/>
            <br>
            <input type="button" value="ID�ߺ�Ȯ��" onClick="idCheck(this.form.id.value)">
             </div>
            <br>
            <div class="pwd">
                <label for="pwd">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp��й�ȣ</label>
                <br>
                <input type="password" id="pwd" name="pwd" placeholder="��й�ȣ"/>
                 </div>
                <br>
                <div class="pwdCheck">
                    <label for="pwdCheck">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp��й�ȣ Ȯ��</label>
                    <br>
                    <input type="password" id="pwdCheck" name="repwd" placeholder="��й�ȣ Ȯ��"/>
                     </div>
                    <br>

            <div class="date">
                <label for="choseDate">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp�������</label>
                    <br>
                    <input type="text" id="choseDate" name="birthday">
            </div>
            <br>
            <div class="hash">
            
                <label for="hash">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp���ɺо�</label>
                    <br>
                    <input type="checkbox" id="hash" name="hobby" value="����">����</input>
                    <input type="checkbox" id="hash" name="hobby" value="����">����</input>
                    <input type="checkbox" id="hash" name="hobby" value="����">����</input>
                    <input type="checkbox" id="hash" name="hobby" value="���">���</input>
                    
            </div>
            <br><br>
            <div class="mail">
                <label for="e_mail">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp�̸���</label>
                <br>
                <input type="text" name="email" id="email1" placeholder="�̸���"/>@<input type="text" id="email2" name="email2"/>
                <select name="email_select" class="box" id="email_select" onChange="checkemailaddy();">
                    <option value="" selected>�����ϼ���</option>
                    <option value="naver.com">naver.com</option>
                    <option value="hotmail.com">hotmail.com</option>
                    <option value="hanmail.com">hanmail.com</option>
                    <option value="yahoo.co.kr">yahoo.co.kr</option>
                    <option value="1">�����Է�</option>
                </select>
                 </div>
                 <div class="mail2">
                <label for="mail2">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp�̸��� ����</label>
                <input type="text" value="" placeholder="������ȣ"><br><input type="button" value="�����ޱ�">
                </div>
                <br>
            <div class="pwd">
            <label for="choseDate">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp�����ȣ</label>
            <input name="zipcode" size="5" readonly>
            <br>
            <input name="address" size="45" placeholder="�ּҶ�">
            <br>
            <input type="button" value="�����ȣã��" onClick="zipSearch()">
            </div>
             
            <br>
            <center>
            	<div class="submit">
           			<input type="button" value="ȸ������" onclick="inputCheck()">
                </div>
                <div class="submit">
                    <input type="reset" value="�ٽþ���">
                </div>
                <div class="submit">
                     <input type="button" value="�α���" onclick="javascript:location.href='01_login.jsp'">
				</div>
				</center>
        </form>
    </div>
    
</body>
</html>