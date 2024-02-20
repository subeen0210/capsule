
//모달 내 오늘 날짜
window.addEventListener('DOMContentLoaded', (event) => {
	// 현재 날짜를 가져와서 표시
	const today = new Date();
	const year = today.getFullYear();
	const month = String(today.getMonth() + 1).padStart(2, '0');
	const day = String(today.getDate()).padStart(2, '0');
	const formattedDate = `${year}년 ${month}월 ${day}일`;

	// 오늘의 날짜를 표시할 요소를 가져와서 내용을 설정
	const todaysDateElement = document.getElementById('modal-date-input');
	todaysDateElement.textContent = formattedDate;
});

// 모달창 띄우기와 끄기 
document.addEventListener("DOMContentLoaded", function() {
	// 작성하기 아이콘과 텍스트 요소를 가져옴
	//	console.log(11);
	let modalOverlay = document.querySelector('.modal-overlay');
	let writeIcon = document.querySelector(".go-write-icon");
	let writeText = document.querySelector(".menu-txt");
	let closeModal = document.querySelector("#cancle-botton");

	// 모달 요소를 가져옴
	let modal = document.querySelector(".modal-container");

	// 작성하기 아이콘 또는 텍스트를 클릭했을 때 모달을 보여주는 함수
	function showModal() {
		console.log(11);
		modal.style.display = "block";
		modalOverlay.style.display = 'block';
	}

	// 작성하기 아이콘 클릭 이벤트 리스너 추가
	writeIcon.addEventListener("click", showModal);

	// 작성하기 텍스트 클릭 이벤트 리스너 추가
	writeText.addEventListener("click", showModal);

	closeModal.addEventListener("click", () => {
		modal.style.display = 'none';
		modalOverlay.style.display = 'none';
	})

});
