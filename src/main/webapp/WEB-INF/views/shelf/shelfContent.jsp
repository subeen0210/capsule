<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복 저금통</title>
<link rel="stylesheet" type="text/css" href="/css/mg_shelf.css">
<script type="text/javascript" src="/js/mg_shelf.js"></script>
</head>
<body>
	<div class="list-container">
		<div class="go-prev go-div">
			<div class="go-icon">
				<div class="click-prev-icon click-icon"></div>
			</div>
		</div>
		<div class="list-content">
			<div class="list-header">
				<div class="user-title">
<!-- 					<button onclick="shelfList(this)" value="ran">ran</button> -->
<!-- 					<button onclick="shelfList(this)" value="jh">jh</button> -->
<!-- 					<button onclick="shelfList(this)" value="sb">sb</button> -->
<!-- 					<button onclick="shelfList(this)" value="rh">rh</button> -->
<!-- 					<button onclick="shelfListJson(this)" value="mg">mg.json</button> -->
<!-- 					<button onclick="shelfListJson(this)" value="jh">jh.json</button> -->
<!-- 					<button onclick="shelfListJson(this)" value="sb">sb.json</button> -->
<!-- 					<button onclick="shelfListJson(this)" value="rh">rh.json</button> -->
					<!-- 					<div class="title-txt">ㅇㅇㅇ님의 행복 저금통</div> -->
					<div class="title-txt">${bottleList[0].u_id }님의행복저금통</div>
				</div>
			</div>
			<div class="shelf shelf-paging-1">
				<div class="shelf-top">
					<div class="glass-line">
						<c:forEach items="${bottleList}" var="bottle" begin="0" end="3">
							<div class="bottle-space"
								onclick="location.href='/happy-capsule/bottle/${bottle.b_no}'">
								<img class="bottle-img" src="/img/bottle.png">
								<div class="bottle-inform inform-txt">${bottle.b_date }~<br>????-??-??</div>
								<img class="bottle-inform infrom-img" src="/img/label.png">
							</div>
						</c:forEach>
					</div>
					<img class="wood-bracket" src="/img/shelf11.png">
				</div>
				<div class="shelf-bottom">
					<div class="glass-line">
						<c:forEach items="${bottleList}" var="bottle" begin="4" end="7">
							<div class="bottle-space">
								<img class="bottle-img" src="/img/bottle.png">
								<div class="bottle-inform inform-txt">${bottle.b_date }~<br>????-??-??</div>
								<img class="bottle-inform infrom-img" src="/img/label.png">
							</div>
						</c:forEach>
					</div>
					<img class="wood-bracket" src="/img/shelf11.png">
				</div>
			</div>
			<c:if test="${bottleList.size() / 8 > 1}">
				<c:forEach begin="1" end="${bottleList.size() / 8}"
					varStatus="status">
					<div class="shelf shelf-paging-${status.index + 1} added-shelf">
						<div class="shelf-top">
							<div class="glass-line">
								<c:forEach items="${bottleList}" var="bottle"
									begin="${status.index * 8}" end="${status.index * 8 + 3}">
									<div class="bottle-space">
										<img class="bottle-img" src="/img/bottle.png">
										<div class="bottle-inform inform-txt">${bottle.b_date }~<br>????-??-??</div>
										<img class="bottle-inform infrom-img" src="/img/label.png">
									</div>
								</c:forEach>
							</div>
							<img class="wood-bracket" src="/img/shelf11.png">
						</div>
						<div class="shelf-bottom">
							<div class="glass-line">
								<c:forEach items="${bottleList}" var="bottle"
									begin="${status.index * 8 + 4}" end="${status.index * 8 + 7}">
									<div class="bottle-space">
										<img class="bottle-img" src="/img/bottle.png">
										<div class="bottle-inform inform-txt">${bottle.b_date }~<br>????-??-??</div>
										<img class="bottle-inform infrom-img" src="/img/label.png">
									</div>
								</c:forEach>
							</div>
							<img class="wood-bracket" src="/img/shelf11.png">
						</div>
					</div>
				</c:forEach>
			</c:if>
		</div>
		<div class="go-next go-div">
			<div class="go-icon">
				<div class="click-next-icon click-icon"></div>
			</div>
		</div>
	</div>
</body>
</html>