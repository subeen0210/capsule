let currentPage = 1;
let lastPage = '';
let shelfLeft = '';
let shelfRight = '';

document.addEventListener("DOMContentLoaded", function() {
	shelfLeft = document.querySelector('.shelf-paging-1').getBoundingClientRect().left;
	shelfRight = document.querySelector('.shelf-paging-1').getBoundingClientRect().right;
	
	document.querySelector('.shelf-paging-1').style.left = shelfLeft +'px';

	if (document.querySelector('.list-content').lastElementChild.classList[1].slice(-1) == 1) {
		document.querySelectorAll('.go-icon').forEach(function(e) {
			e.style.display = 'none';
		})
		
	} else {
		document.querySelectorAll('.added-shelf').forEach(function(e){
			e.style.left = '100vw';
		})
		
		lastPage = document.querySelector('.list-content').lastElementChild.classList[1].slice(-1);

		if (currentPage == 1) {
			document.querySelectorAll('.go-icon')[0].style.display = 'none';
		}

		document.querySelectorAll('.go-icon')[0].addEventListener("click", function() {
			document.querySelector('.shelf-paging-' + currentPage).style.left = '100vw';
			document.querySelector('.shelf-paging-' + (currentPage - 1)).style.left = shelfLeft + 'px';
			document.querySelectorAll('.go-icon')[1].style.display = 'flex';
			
			currentPage -= 1;

			if (currentPage == 1) {
				document.querySelectorAll('.go-icon')[0].style.display = 'none';
				document.querySelectorAll('.go-icon')[1].style.display = 'flex';
			}
		})

		document.querySelectorAll('.go-icon')[1].addEventListener("click", function() {
			console.log(currentPage)
			document.querySelector('.shelf-paging-' + currentPage).style.left = '-' + (shelfRight - shelfLeft ) + 'px' ;
			document.querySelector('.shelf-paging-' + (currentPage + 1)).style.left = shelfLeft + 'px';

			currentPage += 1;

			document.querySelectorAll('.go-icon')[0].style.display = 'flex';

			if (currentPage == lastPage) {
				document.querySelectorAll('.go-icon')[1].style.display = 'none';
			}
		})
	}
});

function shelfList(id) {
	console.log(id.value)

	var form = document.createElement('form');
	form.method = 'post'; // POST 방식 설정
	form.action = '/happy-capsule/shelf/list'; // 서블릿의 URL로 설정

	// 입력 필드 생성 및 설정
	var input1 = document.createElement('input');
	input1.name = 'id'; // 서블릿에서 읽을 파라미터 이름
	input1.value = id.value; // 전송할 값

	// 폼에 입력 필드 추가
	form.appendChild(input1);

	// 폼을 body에 추가하고 자동으로 제출
	document.body.appendChild(form);
	form.submit();
}