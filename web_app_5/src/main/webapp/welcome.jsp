<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Numbers</title>
</head>
<body>
	<h2>Add Numbers:</h2>
	<form action="addController" method="post">
	
		Number1<input type="text" name="num1" />
		Number2<input type="text" name="num2" />
		<input type="submit" value="add"/>
	</form>
	<%
		if(request.getAttribute("res")!=null){
			out.println(request.getAttribute("res"));
		}
		
	%>
</body>
</html>