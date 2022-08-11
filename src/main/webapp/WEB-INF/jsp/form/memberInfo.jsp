<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>memberInfo.jsp 입니다.</h1>

<h2>member</h2>
ID는 ${ member.id } 입니다. <br>
Password는 ${ member.password } 입니다. <br>
Name는 ${ member.name } 입니다. <br>

<h2>memberVO</h2>
ID는 ${ memberVO.id } 입니다. <br>
Password는 ${ memberVO.password } 입니다. <br>
Name는 ${ memberVO.name } 입니다. <br>
</body>
</html>