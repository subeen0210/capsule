document.addEventListener("DOMContentLoaded", function() {
	foldingMenu();

	// 리스트 클릭
	document.querySelector('.go-list-icon').addEventListener("click", function() {
		location.href = '/happy-capsule/shelf';
	})

	// 로그아웃 클릭
	document.querySelector('.do-logout-icon').addEventListener("click", function() {
		console.log(3);
		location.href = '/happy-capsule';
	})

	// 돌아가기 클릭
	document.querySelector('.go-home-icon').addEventListener("click", function() {
		location.href = '/happy-capsule/shelf';
	})

	// 저금통 만들기 클릭
	document.querySelector('.go-home-icon').addEventListener("click", function() {
		location.href = '/happy-capsule/main';
	})


	// 저금통 열기 클릭
	if (document.querySelector('.go-open-icon') != null) {
		document.querySelector('.go-open-icon').addEventListener("click", function() {
			var pathSegments = window.location.pathname.split('/');
			var no = pathSegments[pathSegments.length - 1];
			location.href = '/happy-capsule/open/' + no;
		})
	}

});

// 페이지 주소에 따라 메뉴 폴딩
function foldingMenu() {
	if (window.location.pathname.includes('/main')) {
		document.querySelector('.go-home-icon').style.display = 'none';
//		document.querySelector('.go-open-icon').style.display = 'none';
	} else if (window.location.pathname.includes('/home')) {
		document.querySelector('.go-list-icon').style.display = 'none';
		document.querySelector('.do-write').style.display = 'none';
		document.querySelector('.do-logout').style.display = 'none';
	} else if (window.location.pathname.includes('/shelf')) {
		document.querySelector('.go-list-icon').style.display = 'none';
		document.querySelector('.do-write').style.display = 'none';
		//		document.querySelector('.go-open-icon').style.display = 'none';
//		document.querySelector('.do-logout').style.display = 'none';
	} else if (window.location.pathname.includes('/bottle')) {
		document.querySelector('.go-home-icon').style.display = 'none';
		//		document.querySelector('.go-write-icon').style.display = 'none';
	} else if (window.location.pathname.includes('/open')) {
		document.querySelector('.go-home-icon').style.display = 'none';
		document.querySelector('.do-write').style.display = 'none';
	}
}