<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form{
 text-transform: uppercase;
}
</style>
</head>
<body >
<h3>Add student</h3>

<form action="addNewStudent" method="get">
<pre>
id              : <input type="text" name="id"><br>
name            : <input type="text" name="name"><br>
age             : <input type="text" name="age"><br>
physics Marks   : <input type="text" name="phyMarks"><br>
chemestry Marks : <input type="text" name="chemMarks"><br>
maths Marks     : <input type="text" name="mathsMarks"><br>
                  <input type="submit" value="ADD">
</pre>
</form>

</body>
</html>