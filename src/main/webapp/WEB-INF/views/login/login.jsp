<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/rh_login.css">
</head>
<body>
	<div class="container">
		<div class="container-inner">
			<div class="loginBox">
				<div class="login-img">
					 <img onclick="location.href='/happy-capsule'" alt="" src="/img/clover.png">
				</div>
				<div class="login-input-line" id="login-text">오늘의 행복은 무엇인가요?</div>
				<div class="login-input-line">
					<div class="login-input-box">
						<input class="login-input" placeholder="아이디">
					</div>
					<div>
						<input class="login-input" placeholder="비밀번호">
					</div>
				</div>
				<div class="login-input-line">
					<button class="login-button">LOGIN</button>
				</div>
				<div id="find-user">
					<span onclick="location.href='/happy-capsule/login/find'">아이디/비밀번호 찾기</span>
				</div>

			</div>
		</div>
	</div>



</body>
</html>