<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Registrations</title>
</head>
<body>
	<h2>All Registrations</h2>
	<table>
		<tr>
			<th>Name<th/>
			<th>Course<th/>
			<th>Email<th/>
			<th>Mobile<th/>
			<th>Delete<th/>
			<th>Update<th/>
		<tr/>
		<%
			ResultSet result = (ResultSet)request.getAttribute("result");
			while(result.next()){
		%>
		<tr>
			<td><%=result.getString(1) %><td/>
			<td><%=result.getString(2) %><td/>
			<td><%=result.getString(3) %><td/>
			<td><%=result.getString(4) %><td/>
			<td><a href="deleteRegistration?emailId=<%=result.getString(3)%>">delete</a></td>
			<td><a href="updateRegistration?emailId=<%=result.getString(3)%>&mobile=<%=result.getString(4)%>">update</a></td>
		<tr/>
		<%} %>
	</table>
</body>
</html>