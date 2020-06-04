<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
text-transform: uppercase;
font-weight: 600;
}

</style>
</head>
<body>
<h3>Search student</h3>
<form action="searchStudent" method="get">
<pre>
id   : <input type="text" name="id"><br><br>
name : <input type="text" name="name"><br><br>
age  : <input type="text" name="age"><br><br>
<input type="submit" value="search">
</pre>
</form>
</body>
</html>