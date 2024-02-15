<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/sb_main.css">
<link rel="stylesheet" type="text/css" href="/css/sb_modal.css">
</head>
<body>


	<div class="main-container">
		<div id="main-text">사용자 이름 님의 행복 저금통</div>
		<div>
			<img id="main-bottle" alt="" src="/img/empty_bottle.png">
		</div>
	</div>


	<!-- 모달창 코드 -->

	<div class="modal-container">
		<div class="modal-body">
			<div id="modal-cancle"> <span id="cancle-botton">X</span> </div>
			<div class="modal-top">
			<div class="modal-title">오늘의 행복 키워드:<input id="modal-title"></div>
			<div class="modal-date">날짜:<input type="date" id="modal-date"></div>
			</div>
			<div class="modal-img-show"><span id="modal-img-show">사진</span></div>
			<div class="modal-img"> <input type="file" id="file-upload"> </div>
			<div class="modal-textarea"> <input> </div>
			<div> <button>행복 등록</button> </div>
			
		</div>
	</div>

</body>
</html>