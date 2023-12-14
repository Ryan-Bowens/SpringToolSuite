<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
	<h1>New Dojo</h1>
	<form:form action="/dojos/post/new" modelAttribute="dojo">
		<p>Name: 
			<form:input type="text" path="dojoName" />
			<form:errors path="dojoName"/>
		</p>
		<button type="submit" value="Create Dojo">Create</button>
	</form:form>
</body>
</html>