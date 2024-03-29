
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
    let modalOverlay = document.querySelector('.modal-overlay');
    let writeIcon = document.querySelector(".go-write-icon");
    let writeText = document.querySelector(".menu-txt");
    let closeModal = document.querySelector("#cancle-botton");
    let modal = document.querySelector(".modal-container");

    function showModal() {
        modal.style.display = "block";
        modalOverlay.style.display = 'block';
    }

    function hideModal() {
        modal.style.display = 'none';
        modalOverlay.style.display = 'none';
    }

    writeIcon.addEventListener("click", showModal);
    writeText.addEventListener("click", showModal);
    closeModal.addEventListener("click", hideModal);

    // ESC 키를 눌렀을 때 모달 창 닫기
    document.addEventListener("keydown", function(event) {
        if (event.key === "Escape") {
            hideModal();
        }
    });
});




document.addEventListener("DOMContentLoaded", function() {
	document.querySelector("#modal-btn").addEventListener("click", function() {
		console.log('잘들어왔니??');
		let keyword = document.getElementById("modal-title-input").value.trim();
		let text = document.querySelector("textarea[name=m_text]").value.trim();
		let file = document.getElementById("file-upload").files[0];
		let maxSizeInBytes = 3 * 1024 * 1024;

		let currentUrl = window.location.href;
		let bottlePk = currentUrl.match(/\d+/);
		if (bottlePk != null) {
			document.querySelector("#b_no").value = bottlePk;
			console.log(bottlePk)
		}

		var message = "╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡◜◝╮\n" +
			"♡  오늘의 행복 키워드를 ♡\n" +
			"♡  입력해주세용♡\n" +
			"  ╰ ◟◞ ͜ ◟ ͜ ◟◞ ͜ ◟ ͜ ◟ ͜ ◟◞ ͜ ◟ ͜ ◟ ╯\n" +
			"                 O °\n" +
			"  〃∩　∧＿∧\n" +
			"⊂⌒（ ´・ω・）\n" +
			"            ヽ_っ＿/￣￣￣/\n" +
			"          　 　 ＼/＿＿＿/";

		var message2 = "╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡◜◝╮\n" +
			"♡  오늘의 행복했던 하루를 ♡\n" +
			"♡  입력해주세용♡\n" +
			"  ╰ ◟◞ ͜ ◟ ͜ ◟◞ ͜ ◟ ͜ ◟ ͜ ◟◞ ͜ ◟ ͜ ◟ ╯\n" +
			"                 O °\n" +
			"  〃∩　∧＿∧\n" +
			"⊂⌒（ ´・ω・）\n" +
			"            ヽ_っ＿/￣￣￣/\n" +
			"          　 　 ＼/＿＿＿/";

		var message3 = "╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡◜◝╮\n" +
			"♡  3MB 이하의 파일을 ♡\n" +
			"♡  선택해주세용♡\n" +
			"  ╰ ◟◞ ͜ ◟ ͜ ◟◞ ͜ ◟ ͜ ◟ ͜ ◟◞ ͜ ◟ ͜ ◟ ╯\n" +
			"                 O °\n" +
			"  〃∩　∧＿∧\n" +
			"⊂⌒（ ´・ω・）\n" +
			"            ヽ_っ＿/￣￣￣/\n" +
			"          　 　 ＼/＿＿＿/";

		if (keyword === "") {
			alert(message);
			return;
		}

		if (text === "") {
			alert(message2);
			return;
		}



		const formData = new FormData(document.querySelector('form'));
		if (file != null) {
			if (file.size > maxSizeInBytes) {
				console.log(file.size);
				alert("message3");
				return;
			} 
		} 

		for (let [key, value] of formData.entries()) {
			console.log(key + ': ' + value);
		}

		try {
			fetch('/happy-capsule/write', {
				method: 'POST',
				body: formData
			})
				.then(response => response.json())
				.then(data => {
					console.log("--------");
					console.log(data); // 응답 데이터 출력
					location.href = '/happy-capsule/bottle/' + data;
				});
		} catch (error) {
			console.error('오류가 발생했습니다:', error.message);
		}

	});
});





function preview() {
	let fileImg = document.querySelector("input[name=m_file]");
	let imgTag = document.getElementById("modal-img-show");

	if (fileImg.files && fileImg.files[0]) {
		let reader = new FileReader();
		reader.onload = function(event) {
			console.log(event);
			imgTag.src = event.target.result;
			imgTag.style.display = "block";
			imgTag.height = 300;
		}
		reader.readAsDataURL(fileImg.files[0]);
	} else {
		imgTag.src = "";
	}
}


//document.getElementById("modal-btn").addEventListener("click", function() {
//
//	console.log('잘들어왔니??');
//	let keyword = document.getElementById("modal-title-input").value.trim();
//	let text = document.querySelector("textarea[name=m_text]").value.trim();
//
//
//	if (keyword === "") {
//		alert('오늘의 행복 키워드를 입력해주세요');
//		return;
//	}
//
//	if (text === "") {
//		alert('오늘의 행복을 입력해주세요')
//		return;
//	}
//
//	const file = document.getElementById("file-upload").files[0];
//	const maxSizeInBytes = 5 * 1024 * 1024; // 5MB를 넘는지 확인
//
//	if (file && file.size > maxSizeInBytes) {
//		alert("파일의 크기가 너무 큽니다. 5MB 이하의 파일을 선택해주세요.");
//		return; // 파일 크기가 너무 큰 경우 함수 종료
//	}
//
//
//});