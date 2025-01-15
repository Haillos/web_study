<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>listTest</h1>

	<c:if test="${type == 'str'}">
		<c:forEach var="item" items="${msgList}">
			<p>${item}</p>
		</c:forEach>
	</c:if>

	<c:if test="${type == 'member'}">
		<c:forEach var="name" items="${memberList}">
			<p>${member.id}${member.pw}${member.name}</p>
		</c:forEach>
	</c:if>
</body>
</html>