<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${id == null}">
<h1> 현재 로그인 한 사용자가 없습니다</h1>
</c:if>

<c:if test="${id != null}">
<h1> 현재 로그인 한 사용자 : ${loginId}</h1>
<h3> 접속 횟수 : ${count}</h3>
</c:if>

</body>
</html>