<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복 저금통</title>
<link rel="stylesheet" type="text/css" href="/css/rh_login.css">
<script type="text/javascript" src="/js/rh_find.js" defer></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="container-inner">
			<div class="loginBox">
				<div class="login-input-line" id="login-text">ID/PW 찾기</div>
				<div class="login-input-line" id="find-form">
					<span>회원가입 시 등록한 이메일 주소를 입력해 주세요</span>
					<div class="find-input-box">
						<input id="u_email" name="u_email" class="login-input"
							placeholder="이메일">
					</div>
				</div>
				<div id="find-result" class="login-input-line">
			<div id="find-text">입력하신 정보로 찾은 회원 내역입니다</div>
					<div class="find-input-box">
						<span class="find-bold">ID</span> <span id="find-id"></span>
					</div>
					<div class="find-input-box">
						<span class="find-bold">PW</span> <span id="find-pw"></span>
					</div>
					<div class="find-input-box">
						<span class="find-bold">닉네임</span> <span id="find-name"></span>
					</div>
				</div>
				<div class="login-input-line">
					<button type="submit" id="findBtn" class="login-button">CHECK</button>
					<div id="backLogin" onclick="location.href='/happy-capsule/login'">로그인으로 돌아가기</div>
				</div>

			</div>
		</div>
	</div>



</body>
</html>