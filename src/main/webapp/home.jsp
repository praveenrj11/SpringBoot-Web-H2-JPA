<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "addTech">
<label>ID   </label>
<input type = "text" name = "id"><br>
<label>Name    </label>
<input type = "text" name = "name"><br>
<label>Subject </label>
<input type = "text" name = "sub"><br>
<button  type = "submit">Add </button></form>
<br><br>
<form action = "getTech">
<input type = "text" name = "id"><br>
<button  type = "submit">Get</button>
</form>
<br><br>

<form action = "deleteallTech">
<button  type = "submit">Delete all</button>
</form>


</body>
</html>