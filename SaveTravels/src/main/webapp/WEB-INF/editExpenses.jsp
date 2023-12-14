<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Edit an expense:</h2>
	<form:form action="/expenses/post/edit/${expenseEdit.id}" method="post" modelAttribute="expenseEdit">
	<input type="hidden" name="_method" value="PATCH">
	<p>Expense Name:
		<form:input type="text" path="expense"/>
		<form:errors path="expense"/>
	</p>
	<p>Vendor:
		<form:input type="text" path="vendor"/>
		<form:errors path="vendor"/>
	</p>
	<p>Amount:
		<form:input type="number" path="amount"/>
		<form:errors path="amount"/>
	
	</p>
	<p>Description:
		<form:textarea path="description" rows="4" cols ="50"></form:textarea>
	</p>
	<input type="submit" value="Edit Expense" class="btn btn-primary" />
	</form:form>
</body>
</html>