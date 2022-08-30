<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List User</title>
</head>
<body>
	<h1>All Users</h1>
	<ul>
		<c:forEach items="${userlist}" var="user">
			<li>${user.id}|${user.name} | ${user.email} |
				${user.password}</li>
		</c:forEach>
	</ul>
</body>
</html>