<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<form action="addStudent" method="post">
		Enter Id: <input type="text" name="id"/>
		<br/>
		Enter Name : <input type="text" name="name"/>
		<br/>
		Enter Branch : <input type="text" name="branch">
		<br>
		<input  type="submit" value="save"/>
	</form>
	<hr>
	<a href="/student-view.jsp">Find Students</a>
</body>
</html>