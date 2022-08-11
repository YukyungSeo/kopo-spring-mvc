<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello.jsp</title>
</head>
<body>
<h2>hello.jsp 입니다</h2>
서버에서 받은 MESSAGE : ${msg}

=============
HelloController.java 에서 작성
mav.addObject("msg","hello spring")

</body>
</html>