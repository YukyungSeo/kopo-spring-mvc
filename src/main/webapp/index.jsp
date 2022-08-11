<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= request.getContextPath()%> 는  localhost:9990//kopo-spring-mvc/을 의미
<h1><a href="${ pageContext.request.contextPath }/hello/hello.do">Hello</a></h1>
<h1><a href="${ pageContext.request.contextPath }/method/method.do">Method</a></h1>
<h1><a href="${ pageContext.request.contextPath }/form/joinForm.do">Join</a></h1>
<h1><a href="${ pageContext.request.contextPath }/resBody.do">ResBody</a></h1>
<h1><a href="${ pageContext.request.contextPath }/resJsonBody.json">ResJsonBody</a></h1>
<h1><a href="${ pageContext.request.contextPath }/resVOBody.json">ResVOBody</a></h1>
<h1><a href="${ pageContext.request.contextPath }/resVOListBody.json">resVOListBody</a></h1>
</body>
</html>