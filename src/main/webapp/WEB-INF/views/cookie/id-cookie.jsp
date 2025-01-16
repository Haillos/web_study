<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> id cookie </h1>
<form action="" method="post">
아이디 : <input type="text" name="id"value="${remember}"><br>
비밀번호 : <input type="text" name="password"><br>
로그인 아이디 기억 : <input type="checkbox" name="remember" value="true" checked="false"><br>
<button type="submit">로그인</button>
</form>
</body>
</html>