let currentPage = 1;
let lastPage = '';
let shelfLeft = '';
let shelfRight = '';

document.addEventListener("DOMContentLoaded", function() {

	shelfLeft = document.querySelector('.shelf-paging-1').getBoundingClientRect().left;
	shelfRight = document.querySelector('.shelf-paging-1').getBoundingClientRect().right;
	document.querySelector('.shelf-paging-1').style.left = shelfLeft + 'px';

	if (document.querySelector('.list-content').lastElementChild.classList[1].slice(-1) == 1) {
		document.querySelectorAll('.go-icon').forEach(function(e) {
			e.style.display = 'none';
		})
	} else {
		lastPage = document.querySelector('.list-content').lastElementChild.classList[1].slice(-1);

		if (currentPage == 1) {
			document.querySelectorAll('.go-icon')[0].style.display = 'none';
		}

		document.querySelectorAll('.added-shelf').forEach(function(e) {
			e.style.display = 'none';
		})

		document.querySelectorAll('.go-icon')[0].addEventListener("click", function() {
			document.querySelector('.shelf-paging-' + (currentPage - 1)).style.display = '';
			setTimeout(function() {
				document.querySelector('.shelf-paging-' + currentPage).style.left = '100vw';
				document.querySelector('.shelf-paging-' + (currentPage - 1)).style.left = shelfLeft + 'px';

				document.querySelectorAll('.go-icon')[1].style.display = 'flex';

				if ((currentPage -1) == 1) {
					document.querySelectorAll('.go-icon')[0].style.display = 'none';
					document.querySelectorAll('.go-icon')[1].style.display = 'flex';
				}
				
				setTimeout(function() {
					document.querySelector('.shelf-paging-' + (currentPage)).style.display = 'none';

					currentPage -= 1;
				}, 750);

			}, 100);
		})

		document.querySelectorAll('.go-icon')[1].addEventListener("click", function() {
			document.querySelector('.shelf-paging-' + (currentPage + 1)).style.display = '';

			setTimeout(function() {
				document.querySelector('.shelf-paging-' + currentPage).style.left = '-' + shelfRight + 'px';
				document.querySelector('.shelf-paging-' + (currentPage + 1)).style.left = shelfLeft + 'px';

				currentPage += 1;

				document.querySelectorAll('.go-icon')[0].style.display = 'flex';

				if (currentPage == lastPage) {
					document.querySelectorAll('.go-icon')[1].style.display = 'none';
				}
			}, 100);
		})

	}
});