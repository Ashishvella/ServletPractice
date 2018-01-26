<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./ServletInpOutStream">Click Here to see the image</a>
<form action="Servlet" method="GET">
<center><B>Welcome to Webapp Get Method</B></center>
<input type="text" name="first_name"><br>
<input type="text" name="last_name"><br>
<input type="submit">
</form>

<form action="Servlet" method="POST">
<center><B>Welcome to Webapp POST Method</B></center>
blood group<br>
A<input type="radio" name="bg" value="A"><br>
O<input type="radio" name="bg" value="O"><br>
Qualification<br>
B.com<input type="checkbox" name="qual" value="B.com"><br>
BCA<input type="checkbox" name="qual" value="BCA"><br>
<input type="text" name="last_name"><br>
<input type="submit">
</form>
</body>
</html>