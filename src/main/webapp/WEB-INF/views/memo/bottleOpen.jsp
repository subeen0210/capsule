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
<script type="text/javascript" src="/js/jh_memo.js" defer></script>
</head>
<body>
	<div class="main-container">
		<div id="main-text">${user.u_name} 님의 행복 저금통</div>


		<div class="open">
			<c:forEach items="${memoList}" var="memo">
				<div class="img">
					<img class="main-memo" id="${memo.m_no}" alt=""
						src="/img/memo_white.png" onclick="openMemo(this)">
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
						<div class="modal-date">
							<div id="modal-date-input"></div>
						</div>
						<div class="modal-title"></div>
					</div>
					<div id="tape"></div>
					<div class="modal-img-show"></div>
					 <div class="no-image-mark">이미지 없음</div>
					<div class="main-textarea">
						<div class="modal-textarea"></div>
					</div>

				</div>
			</form>
		</div>

		<!-- 모달 배경 -->
		<div class="modal-overlay"></div>


	</div>

</body>
</html>