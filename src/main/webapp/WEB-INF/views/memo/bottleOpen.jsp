<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>ﾟ
<link rel="stylesheet" type="text/css" href="/css/mg_menu.css">
<link rel="stylesheet" type="text/css" href="/css/sb_main.css">
</head>
<body>
	<div class="main-container">
		<div id="main-text">사용자 이름 님의 행복 저금통</div>
		
		
		
		<c:forEach items="${memoList}" var="memo">
			<div> <img id="main-bottle" alt="" src="/img/memo_white.png"> </div>
		</c:forEach>

		
	</div>

</body>
</html>