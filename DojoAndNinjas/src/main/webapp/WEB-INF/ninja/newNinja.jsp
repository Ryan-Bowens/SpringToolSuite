<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/ninjas/post/new" modelAttribute="ninja">
		<p>Dojo:
			<form:select path="ninjaDojo">
				<c:forEach var="dojo" items="${allDojos}">
					<form:option value="${dojo.id}">
						<c:out value="${dojo.dojoName}"/>
					</form:option>
				</c:forEach>
			</form:select>
		</p>
		<p>First Name: 
			<form:input type="text" path="firstName"/>
			<form:errors path="firstName"/>
		</p>
		<p>Last Name: 
			<form:input type="text" path="lastName"/>
			<form:errors path="lastName"/>
		</p>
		<p>Age: 
			<form:input type="number" path="age"/>
			<form:errors path="age"/>
		</p>
		<button type="submit" value="Create Ninja">Create</button>
	</form:form>
</body>
</html>