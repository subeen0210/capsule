<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
					<button onclick="shelfList(this)" value="mg">mg</button>
					<button onclick="shelfList(this)" value="jh">jh</button>
					<button onclick="shelfList(this)" value="sb">sb</button>
					<button onclick="shelfList(this)" value="rh">rh</button>
					<!-- 					<div class="title-txt">ㅇㅇㅇ님의 행복 저금통</div> -->
					<div class="title-txt">${bottleList[0].u_id }님의행복저금통</div>
				</div>
			</div>
			<div class="shelf shelf-paging-1">
				<div class="shelf-top">
					<div class="glass-line">
						<c:forEach items="${bottleList}" var="bottle" begin="0" end="3">
							<div class="bottle-space">
								<img class="bottle-img" src="/img/bottle.png">
								<div class="bottle-inform">${bottle.b_date }~????-??-??</div>
							</div>
						</c:forEach>
					</div>
					<div class="wood-bracket"></div>
				</div>
				<div class="shelf-bottom">
					<div class="glass-line">
						<c:forEach items="${bottleList}" var="bottle" begin="4" end="7">
							<div class="bottle-space">
								<img class="bottle-img" src="/img/bottle.png">
								<div class="bottle-inform">${bottle.b_date }~????-??-??</div>
							</div>
						</c:forEach>
					</div>
					<div class="wood-bracket"></div>
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
										<div class="bottle-inform">${bottle.b_date }~????-??-??</div>
									</div>
								</c:forEach>
							</div>
							<div class="wood-bracket"></div>
						</div>
						<div class="shelf-bottom">
							<div class="glass-line">
								<c:forEach items="${bottleList}" var="bottle"
									begin="${status.index * 8 + 4}" end="${status.index * 8 + 7}">
									<div class="bottle-space">
										<img class="bottle-img" src="/img/bottle.png">
										<div class="bottle-inform">${bottle.b_date }~????-??-??</div>
									</div>
								</c:forEach>
							</div>
							<div class="wood-bracket"></div>
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