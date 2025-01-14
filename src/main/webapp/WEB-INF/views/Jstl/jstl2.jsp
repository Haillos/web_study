<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jstl2</h1>

	<c:set var="var1" value="값들어가는곳" />
	${var1}

	<c:url var="jstl1Url" value=/jstl1 />

	<a href="${jstl1Url}">jstl1 curl</a>
	<a href="${jstl1Url}">jstl1 curl</a>
	<a href="${jstl1Url}">jstl1 curl</a>
	<a href="${jstl1Url}">jstl1 curl</a>

	&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;


	<%--  ${msgXml} --%>
	<c:out value="${msgXml}" excapeXml="true" />

	${msg1}
	${msg2}
	
	<c:out value="${msg1}" excapeXml="true" />
	<c:out value="${msg2}" excapeXml="true" />
	<%-- <c:redirect url="/jstl1"/> --%>
	<!-- 	<script> -->
	<!-- // 		location.href = "/jstl1"; -->
	<!-- 	</script> -->
</body>
</html>