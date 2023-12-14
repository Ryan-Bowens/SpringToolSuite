<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Page</title>
</head>
<body>
<table>
	<h1> <c:out value="${dojo.dojoName}" /> Location Ninjas</h1>
	<thead>
		<tr>
			<th scope="col">FirstName</th>
			<th scope="col">LastName</th>
			<th scope="col">Age</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${dojo.ninjas}" var="ninja">
			<tr>
				<td><c:out value="${ninja.firstName}"/></td>
				<td><c:out value="${ninja.lastName}"/></td>
				<td><c:out value="${ninja.age}"/></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>