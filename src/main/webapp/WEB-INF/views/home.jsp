<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복 저금통</title>
<link rel="stylesheet" type="text/css" href="/css/mg_menu.css">
<link rel="stylesheet" type="text/css" href="/css/sb_modal.css">
<script type="text/javascript" src="/js/mg_menu.js" defer></script>
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
		<form>
			<div class="modal-body">
				<div id="modal-cancle">
					<span id="cancle-botton">X</span>
				</div>
				<div class="modal-top">
					<div class="modal-date">
						<div id="modal-date-input"></div>
					</div>
				</div>
				<div class="modal-top2">
					<div class="modal-title">
						오늘의 행복 키워드:<input name="m_keyword" id="modal-title-input"
							placeholder="35자 이내로 입력" maxlength="35">
					</div>
					<div class="modal-img">
						<input name="m_file" type="file" accept="image/*" size="3000000" id="file-upload"
							onchange="preview()">
					</div>

				</div>
				<div class="modal-img-show">
					<img id="modal-img-show" src="" style="display: none;">
				</div>
				<div class="modal-textarea">
					<textarea placeholder="250자 이내로 입력" name="m_text" maxlength="250"></textarea>
				</div>
				<div class="modal-button">
					<button type="button" id="modal-btn">행복 등록</button>
				</div>
			</div>
		</form>
	</div>

	<!-- 모달 배경 -->
	<div class="modal-overlay"></div>

</body>
</html>