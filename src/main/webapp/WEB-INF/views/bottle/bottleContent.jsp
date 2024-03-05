<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복 저금통</title>
<link rel="stylesheet" type="text/css" href="/css/mg_menu.css">
<link rel="stylesheet" type="text/css" href="/css/sb_main.css">
</head>
<body>
	<div class="main-container">
		<div id="main-text">${user.u_name} 님의 행복 저금통</div>
		<div> <c:choose>
            <%-- If memos exist and memoCount is greater than 0 --%>
            <c:when test="${not empty memoList && memoCount > 5 && memoCount < 15}">
                <img id="main-bottle" alt="" src="/img/bottle_10.png">
            </c:when>
			<c:when test="${not empty memoList && memoCount > 14 && memoCount < 20}">
                <img id="main-bottle" alt="" src="/img/bottle_15.png">
            </c:when>
            
            <c:when test="${not empty memoList && memoCount > 19}">
                <img id="main-bottle" alt="" src="/img/bottle_20.png">
            </c:when>
            
            <c:otherwise>
                <img id="main-bottle" alt="" src="/img/bottle_5.png">
            </c:otherwise>
        </c:choose>
	</div>

</body>
</html>