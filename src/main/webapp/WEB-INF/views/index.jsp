<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복 저금통</title>
<link rel="stylesheet" type="text/css" href="/css/rh_index.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
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
				<div class="slider-container">
					<div class="container-div">
						<img
							style="width: 150px; transform: rotate(15deg); margin: 5% 0% 2% 0%;"
							 class="tossing"id="index-memo" alt="" src="/img/memo_white.png">
					</div>
					<div  class="container-div" id="index-main"
						style="font-size: 70pt; font-family: 'YeongdeokSea';">오늘의
						행복을 오랫동안</div>
					<div class="container-div index-explain">행복 저금통으로 일상에서의 행복을
						남겨보세요</div>
				</div>
				<div class="slider-container">
					<div class="container-div">
						<img alt="" src="/img/index_bottle.png" width="300px">
					</div>
					<div class="container-div index-explain">오늘 하루 있었던 행복한 일을 작성해
						보관해요</div>
				</div>
				<div class="slider-container">
				<div class="container-div">
						<img alt="" src="/img/index_memo.png" width="40%">
					</div>
					<div class="container-div index-explain">일정 기간이 지나면 저금해 둔 행복
						저금을 확인할 수 있어요</div>
				</div>
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