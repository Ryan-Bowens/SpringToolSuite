<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Fruit Store</h1>
	<table>
	<thead>
		<tr>
			<td>Name</td>
			<td>Price</td>
		</tr>
	</thead>
  	<c:forEach items="${fruits}" var="fruits">
  	<tbody>
  		<td><c:out value="${fruits.name}"/></td>
  		<td><c:out value="${fruits.price}"/></td>
  	</tbody>
  	</c:forEach>
  	</table>
</body>
</html>