<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
	<h1>Send an Omikuji</h1>
	<form action="/omikuji/form" method="post">
		<p>Pick any number from 5 to 25</p>
			<input type="number" name="number"/>
			<p class="text-danger"><c:out value="${error}"/></p>
		<p>Enter the name of any city.</p>
			<input type="text" name="city"/>
		<p>Enter the name of any real person</p>
			<input type="text" name="person"/>
		<p>Enter professional endeavor or hobby:</p>
			<input type="text" name="hobby"/>
		<p>Enter any type of living thing.</p>
			<input type="text" name="thing" placeholder="playing... selling..."/>
		<p>Say something nice to someone</p>
			<textarea name="nice" rows="4" cols ="50"></textarea>
		<p>Send and show a friend</p>
			<input class="btn btn-outline-primary" type="submit" value="Send"/>
	</form>
</body>
</html>