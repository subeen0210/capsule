<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복 저금통</title>
<link rel="stylesheet" type="text/css" href="/css/mg_menu.css">
<link rel="stylesheet" type="text/css" href="/css/jh_memo.css">
<link rel="stylesheet" type="text/css" href="/css/sb_modal.css">
<script type="text/javascript" src="/js/jh_memo.js" defer></script>
</head>
<body>
	<div class="main-container">
		<div id="main-text">사용자 이름 님의 행복 저금통</div>


		<div class="open">
			<c:forEach items="${memoList}" var="memo">
				<div class="img">
					<img class="main-memo" id="${memo.m_no}" alt="" src="/img/memo_white.png" onclick="openMemo(this)">
				</div>
			</c:forEach>
		</div>

		<!-- 모달창 코드 -->

	<div class="modal-container">
		<form action="/happy-capsule/write">
			<div class="modal-body">
				<div id="modal-cancle">
					<span id="cancle-botton">X</span>
				</div>
				<div class="modal-top">
					<div class="modal-title">
						오늘의 행복 키워드:<input id="modal-title-input">
					</div>
					<div class="modal-date">
						<div id="modal-date-input"></div>
					</div>
				</div>
				<c:choose>
					<c:when test="">
						<div class="modal-img-show">
							<img id="modal-img-show" src="">
						</div>
					</c:when>
					<c:otherwise>
						
					</c:otherwise>
				</c:choose>
				<div class="modal-img">
					<input type="file" id="file-upload">
				</div>
				<div class="modal-textarea">
					<textarea></textarea>
				</div>
				
			</div>
		</form>
	</div>

	<!-- 모달 배경 -->
	<div class="modal-overlay"></div>


	</div>

</body>
</html>