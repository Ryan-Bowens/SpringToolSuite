<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>displaying from form</h1>
	<h2>Movie Title: <c:out value="${movie}"/></h2>
	<h2>Movie Rating: <c:out value="${rating}"/></h2>
	<h2>Movie Comment: <c:out value="${comment}"/></h2>
	<h2>Reviewer Name: <c:out value="${name}"/></h2>
</body>
</html>