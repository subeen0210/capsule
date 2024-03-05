$(function() {
	$('.slick').slick({
		slide: 'div',		//슬라이드 되어야 할 태그 ex) div, li 
		infinite: true, 	//무한 반복 옵션	 ~~~
		slidesToShow: 1,		// 한 화면에 보여질 컨텐츠 개수
		slidesToScroll: 1,		//스크롤 한번에 움직일 컨텐츠 개수
		speed: 800,	 // 다음 버튼 누르고 다음 화면 뜨는데까지 걸리는 시간(ms)
		arrows: true, 		// 옆으로 이동하는 화살표 표시 여부
		prevArrow: "<button type='button' class='slick-prev slider-arrow'> <img alt='' src='/img/left-arrow.png' width='100%'> </button>",		// 이전 화살표 모양 설정
		nextArrow: "<button type='button' class='slick-next slider-arrow'> <img alt='' src='/img/right-arrow.png' width='100%'></button>",		// 다음 화살표 모양 설정
	});

});