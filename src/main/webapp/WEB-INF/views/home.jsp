<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/mg_menu.css">
<script type="text/javascript" src="/js/mg_menu.js"></script>
</head>
<body>
	<div class="container">
		<!-- 콘텐츠 인클루드 -->
		<div class="content">
					<jsp:include page="${content }"></jsp:include>
		</div>

		<!-- 메뉴바 -->
		<div class="menu">
			<div class="go-list menu-list">
				<div class="go-list-icon">
					<img class="menu-icon" src="/img/clover.png">
					<div class="menu-txt">선반으로 가기</div>
				</div>
				<div class="go-home-icon">
					<img class="menu-icon" src="/img/clover.png">
					<div class="menu-txt">저금통<br>만들기</div>
				</div>
			</div>
			<div class="do-write menu-list">
				<div class="go-write-icon">
					<img class="menu-icon" src="/img/pen.png">
					<div class="menu-txt">작성하기</div>
				</div>
				<div class="go-open-icon">
					<img class="menu-icon" src="/img/clover.png">
					<div class="menu-txt">저금통<br>열기</div>
				</div>
			</div>
			<div class="do-logout menu-list">
				<div class="do-logout-icon">
					<img class="menu-icon" src="/img/door.png">
					<div class="menu-txt">로그아웃</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>