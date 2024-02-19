let currentPage = 1;
let lastPage = '';
let shelfLeft = '';
let shelfRight = '';

document.addEventListener("DOMContentLoaded", function() {
	document.querySelectorAll('.shelf').forEach(function(e) {
		e.style.transition = 'all 3s ease-in-out';
	})
	
	shelfLeft = document.querySelector('.shelf-paging-1').getBoundingClientRect().left;
	shelfRight = document.querySelector('.shelf-paging-1').getBoundingClientRect().right;
	shelfTop = document.querySelector('.shelf-paging-1').getBoundingClientRect().top;

	console.log(shelfLeft)
	console.log(shelfRight)


	if (document.querySelector('.list-content').lastElementChild.classList[1].slice(-1) == 1) {
		document.querySelectorAll('.go-icon').forEach(function(e) {
			e.style.display = 'none';
		})
	} else {
		lastPage = document.querySelector('.list-content').lastElementChild.classList[1].slice(-1);

		document.querySelectorAll('.added-shelf').forEach(function(e) {
			e.style.display = 'none';
			e.style.left = '100vw';
		})


		if (currentPage == 1) {
			document.querySelectorAll('.go-icon')[0].style.display = 'none';
		}

		document.querySelectorAll('.go-icon')[0].addEventListener("click", function() {
			document.querySelector('.shelf-paging-' + currentPage).style.left = '100vw';
			document.querySelector('.shelf-paging-' + currentPage).style.display = 'none';
			document.querySelector('.shelf-paging-' + (currentPage - 1)).style.display = '';
			document.querySelector('.shelf-paging-' + (currentPage - 1)).style.left = shelfLeft + 'px';


			currentPage -= 1;

			document.querySelectorAll('.go-icon')[1].style.display = 'flex';


			if (currentPage == 1) {
				document.querySelectorAll('.go-icon')[0].style.display = 'none';
				document.querySelectorAll('.go-icon')[1].style.display = 'flex';
			}
		})

		document.querySelectorAll('.go-icon')[1].addEventListener("click", function() {
			console.log(currentPage)
			document.querySelector('.shelf-paging-' + currentPage).style.right = '100vw';
			document.querySelector('.shelf-paging-' + currentPage).style.display = 'none';
			document.querySelector('.shelf-paging-' + (currentPage + 1)).style.display = '';
			document.querySelector('.shelf-paging-' + (currentPage + 1)).style.left = '';

			currentPage += 1;

			document.querySelectorAll('.go-icon')[0].style.display = 'flex';

			if (currentPage == lastPage) {
				document.querySelectorAll('.go-icon')[1].style.display = 'none';
			}
		})

	}
});