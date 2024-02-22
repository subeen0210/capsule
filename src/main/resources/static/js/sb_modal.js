
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
	
	
	document.querySelector('#modal-btn').addEventListener("click", (e)=>{
		const form = e.target.closest('form');		
		console.log(form);

		 const formData = new FormData(form);
		 for(const val of formData.values()){
			 console.log(val);
		 }
		 
		 fetch("/happy-capsule/write", {
			 method : 'POST',
			 body : formData
		 })
		 .then(response => {
			 console.log(response);
		 })
		
	});
	
	
	
});


document.addEventListener("DOMContentLoaded", function() {
	document.querySelector("#modal-btn").addEventListener("click", (e) => {
		const form = e.target.closest('form');
		console.log(form)
		// FormData 객체 생성
		const formData = new FormData(form);

		// FormData 객체를 이용하여 입력된 값들을 가져옴
		for (let [key, value] of formData.entries()) {
			console.log(key + ': ' + value);
		}
		try {
			const response = fetch('/happy-capsule/write/0', {
				method: 'POST',
				body: formData
			});

			if (!response.ok) {
				throw new Error('서버 응답이 실패했습니다.');
			}

			console.log('데이터가 성공적으로 서버로 전송되었습니다.');
		} catch (error) {
			console.error('오류가 발생했습니다:', error.message);
		}

	})
});