<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Save Travels</title>
</head>
<body>
	<h1>Save Travels</h1>
	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">Expense</th>
				<th scope="col">Vendor</th>
				<th scope="col">Amount</th>
			</tr>
		</thead>
			<c:forEach items="${allExpenses}" var="expense">
			<tbody>
				<td> <c:out value="${expense.expense}"/></td>
				<td> <c:out value="${expense.vendor}"/></td>
				<td> <c:out value="${expense.amount}"/></td>
         	   	<td><a class="btn btn-outline-warning" href="/expenses/edit/${expense.id}">Edit</a>
         	   	<form action="/expenses/delete/${expense.id}" method="post">
         	   		<input type="hidden" value="delete" name="_method"/>
            		<input type="submit" value="Delete" class="btn btn-outline-danger"/>
            	</form>
            	</td>
			</tbody>
			</c:forEach>
	</table>
	<h2>Add an expense:</h2>
	<form:form action="/expenses/post/new" method="post" modelAttribute="expenseForm">
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
	<input type="submit" value="Add Expense" class="btn btn-primary" />
	</form:form>
</body>
</html>