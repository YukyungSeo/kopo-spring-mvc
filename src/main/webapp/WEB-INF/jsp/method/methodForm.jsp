<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>methodForm.jsp 입니다.</h1>

<form action="${ pageContext.request.contextPath }/method/methodProcess.do"
		method="post">
	<input type="submit" value="호출" />	
</form>
</body>
</html>