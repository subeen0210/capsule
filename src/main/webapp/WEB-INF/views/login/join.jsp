<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복 저금통</title>
<link rel="stylesheet" type="text/css" href="/css/rh_login.css">
<script type="text/javascript" src="/js/rh_join.js" defer></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="container-inner">
			<div class="loginBox">
				<img class="homeImg" onclick="location.href='/happy-capsule'" alt=""
					src="/img/home.png">
				<div class="login-input-line" id="join-text">회원가입</div>
				<form id="join-form" action="/happy-capsule/join" method="post"
					class="login-input-line">
					<div id="join-input-box">
						<div class="login-input-box">
							<input id="u_id" name="u_id" class="login-input"
								placeholder="아이디(영문 및 숫자, 최대 20자)" maxlength="20"
								pattern="[A-Za-z0-9]+">
							<button type="button" id="checkIdBtn" class="checkBtn" value="0">중복
								검사</button>
							<div class="checkText" id="checkIdText"></div>
						</div>
						<div class="login-input-box">
							<input type="password" id="u_pw" name="u_pw" class="login-input"
								placeholder="비밀번호(최대 20자)" maxlength="20" pattern="[A-Za-z0-9]+">
						</div>
						<div class="login-input-box">
							<input type="email" id="u_email" name="u_email"
								class="login-input" placeholder="이메일">
							<button type="button" id="checkMailBtn" class="checkBtn"
								value="0">중복 검사</button>
							<div class="checkText" id="checkMailText"></div>
						</div>
						<div class="login-input-box">
							<input id="u_name" name="u_name" class="login-input"
								placeholder="닉네임" maxlength="20">
						</div>
					</div>
					<div class="login-input-line">
						<button id="joinBtn" class="login-button">JOIN</button>
					</div>
				</form>
			</div>




		</div>
	</div>



</body>
</html>