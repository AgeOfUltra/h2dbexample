<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Student</title>
</head>
<body>
	<h2>Find Student By Their Id</h2>
	<hr>
	<form action="getStudent">
		Enter the Id : <input type="text" name="id"/>
		<br>
		<input type="submit" value="fetch"/>
	</form>
	
	<hr>
	<h3>Result will be shown here :</h3>
	<p>Student Name : ${student.branch}, Student Id : ${student.getId()}, Branch : ${student.name} </p>
</body>
</html>