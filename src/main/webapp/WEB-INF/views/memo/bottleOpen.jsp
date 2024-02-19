<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복 저금통</title>
<link rel="stylesheet" type="text/css" href="/css/mg_menu.css">
<link rel="stylesheet" type="text/css" href="/css/jh_memo.css">
</head>
<body>
	<div class="main-container">
		<div id="main-text">사용자 이름 님의 행복 저금통</div>


		<div class="open">
			<c:forEach items="${memoList}" var="memo">
				<div class="img">
					<img id="main-memo" alt="" src="/img/memo_white.png">
				</div>
			</c:forEach>
		</div>


	</div>

</body>
</html>