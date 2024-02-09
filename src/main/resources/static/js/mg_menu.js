window.onload = function() {
	foldingMenu();

	// 보러가기 클릭
	document.querySelector('.go-list-icon').addEventListener("click", function() {
		location.href = '/happy-capsule/shelf';
	})
	
	// 작성하기 클릭
	document.querySelector('.go-write-icon').addEventListener("click", function() {
		console.log(2);
	})
	
	// 로그아웃 클릭
	document.querySelector('.do-logout-icon').addEventListener("click", function() {
		console.log(3);
	})
	
	// 돌아가기 클릭
	document.querySelector('.go-home-icon').addEventListener("click", function() {
		location.href = '/happy-capsule/home';
	})
}

/// 페이지 주소에 따라 메뉴 폴딩
function foldingMenu() {
	if (window.location.pathname == '/happy-capsule/home') {
		document.querySelector('.go-home-icon').style.display = 'none';
	} else if (window.location.pathname == '/happy-capsule/shelf') {
		document.querySelector('.go-list-icon').style.display = 'none';
		document.querySelector('.go-write-icon').style.display = 'none';
		document.querySelector('.do-logout-icon').style.display = 'none';
	}
}