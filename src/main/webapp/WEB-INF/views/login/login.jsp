<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복 저금통</title>
<link rel="stylesheet" type="text/css" href="/css/rh_login.css">
<script type="text/javascript" src="/js/rh_login.js" defer></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="container-inner">
			<div class="loginBox">
				<img class="homeImg" onclick="location.href='/happy-capsule'" alt=""
					src="/img/home.png">
				<div class="login-input-line" id="login-text">오늘의 행복은 무엇인가요?</div>
				<form action="login" method="post" class="login-input-line">
					<div id="login-input-container">
						<div class="login-input-box">
							<input name="u_id" class="login-input" placeholder="아이디">
						</div>
						<div class="login-input-box">
							<input type="password" name="u_pw" class="login-input"
								placeholder="비밀번호">
						</div>
					</div>
					<div class="login-input-line">
						<button type="button" id="loginBtn" class="login-button">LOGIN</button>
					</div>
				</form>
				<div onclick="location.href='/happy-capsule/login/find'"
					id="find-user">아이디/비밀번호 찾기</div>
			</div>
		</div>
	</div>
</body>
</html>