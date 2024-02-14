<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/rh_index.css">
<script type="text/javascript" src="/js/rh_index.js" defer></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- slick slider 스크립트 -->
<link rel="stylesheet" type="text/css"
	href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" />
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript"
	src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
</head>
<body>
	<div id="container">
		<div class="container-inner">
			<div class="slick">
				<div>
					<div class="container-div">
						<img alt="" src="/img/memo_white.png">
					</div>
					<div class="container-div" id="index-main">오늘의 행복을 오랫동안</div>
					<div class="container-div" id="index-explain">일상에서의 행복을 남겨보세요</div>
				</div>
				<div><div class="container-div">행복한 일을 저금해 확인할 수 있어요</div></div>
				<div><div class="container-div">일정 기간이 지나면 저금해 둔 행복을 확인할 수 있어요</div></div>
			</div>
			<div id="button-div">
				<div id="index-login">
					<button id="index-button"
						onclick="location.href='/happy-capsule/login'">LOGIN</button>
				</div>
				<div id="index-join">
					<span onclick="location.href='/happy-capsule/join'">회원가입</span>
				</div>
			</div>
		</div>

	</div>
</body>
</html>