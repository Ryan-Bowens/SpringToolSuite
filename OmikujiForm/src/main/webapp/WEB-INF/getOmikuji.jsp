<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
	<h1>Here's Your Omikuji!</h1>
	<h3>
		In <c:out value="${number}"/> years, you will live in <c:out value="${city}"/>
		with <c:out value="${person}"/> as your roommate, <c:out value="${hobby}"/>
		The next time you see a <c:out value="${thing}"/>, you will have good luck.
		Also, <c:out value="${nice}"/>
	</h3>
</body>
</html>