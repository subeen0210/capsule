<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/mg_menu.css">
<link rel="stylesheet" type="text/css" href="/css/sb_modal.css">
<script type="text/javascript" src="/js/mg_menu.js"></script>
<script type="text/javascript" src="/js/sb_modal.js" defer></script>
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
					<div class="menu-txt">선반으로가기</div>
				</div>
				<div class="go-home-icon">
					<img class="menu-icon" src="/img/clover.png">
					<div class="menu-txt">저금통만들기</div>
				</div>
			</div>
			<div class="do-write menu-list">
				<div class="go-write-icon">
					<img class="menu-icon" src="/img/pen.png">
					<div class="menu-txt">작성하기</div>
				</div>
				<div class="go-open-icon">
					<img class="menu-icon" src="/img/memo_white.png">
					<div class="menu-txt">저금통열기</div>
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
	
	<!-- 모달창 코드 -->

	<div class="modal-container">
		<form action="/happy-capsule/write">
		<div class="modal-body">
			<div id="modal-cancle"> <span id="cancle-botton">X</span> </div>
			<div class="modal-top">
			<div class="modal-title">오늘의 행복 키워드:<input id="modal-title-input" placeholder="100자 이내로 입력"></div>
			<div class="modal-date"><div id="modal-date-input"></div></div>
			</div>
			<div class="modal-img-show"><span id="modal-img-show">사진</span></div>
			<div class="modal-img"> <input type="file" id="file-upload"> </div>
			<div class="modal-textarea"> <textarea placeholder="250자 이내로 입력"></textarea> </div>
			<div class="modal-button"> <button id="modal-btn">행복 등록</button> </div>
		</div>
		</form>
	</div>
	
	<!-- 모달 배경 -->
	<div class="modal-overlay"></div>
	
</body>
</html>