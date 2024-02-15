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
			<form action="/happy-capsule/join" method="post">
				<div class="loginBox">
					<div class="login-input-line" id="join-text">회원가입</div>
					<div id="join-input-box">
						<div class="login-input-box">
							<input name="u_id" class="login-input" placeholder="아이디">
							<div>ㅇㅇ</div>
						</div>
						<div class="login-input-box">
							<input name="u_pw" class="login-input" placeholder="비밀번호">
						</div>
						<div class="login-input-box">
							<input name="u_email" class="login-input" placeholder="이메일">
						</div>
						<div class="login-input-box">
							<input name="u_name" class="login-input" placeholder="닉네임">
						</div>
					</div>
					<div class="login-input-line">
						<button class="login-button">JOIN</button>
					</div>
				</div>
			</form>




		</div>
	</div>



</body>
</html>