var checkChar = /[~!@\#$%^&*\()\-=+_'\;<>\/.\`:\"\\,\[\]?|{}]/gi;
var checkKorean = /[ㄱ-ㅎㅏ-ㅣ]/gi;


function checkEmail(u_email) {
	let pattern_email = /^[a-zA-Z0-9._-]{4,20}@(naver|ruu|hanmail|kakao|hot|gmail|outlook|nate|daum|icloud|mac|me)\.[a-zA-Z]{2,4}$/i;
	if (pattern_email.test(u_email)) {
		// 이메일 패턴이 일치하면 true
		return true;
	} else {
		return false;
		// 일치하지 않으면 false
	}
}


$(function() {
	let isIdChecked = false;
	let isEmailChecked = false;

	// ID 중복검사
	$("#checkIdBtn").click(function(e) {
		let u_id = $('#u_id').val();
		$.ajax({
			url: "/happy-capsule/join/checkID",
			data: { u_id: u_id },
			type: "get",
			success: function(data) {
				console.log(data);
				if (data == "") {
					isIdChecked = true;
					$("#checkIdText").text("사용 가능한 ID");
					$("#checkIdText").css("color", "blue");
					$("#u_id").css("border", "1px solid rgb(108, 76, 28)").css("background-color", "white")
					e.target.value = 1;
				} else {
					isIdChecked = false;
					$("#checkIdText").text("사용 불가한 ID");
					$("#checkIdText").css("color", "red");
					$("#u_id").css("border", "2px solid #f03232").css("background-color", "#ff00000d")
					return;
				}
			},
		});
	});

	// 메일 중복검사
	$("#checkMailBtn").click(function(e) {
		let u_email = $('#u_email').val();
		$.ajax({
			url: "/happy-capsule/join/checkMail",
			data: { u_email: u_email },
			type: "get",
			success: function(data) {
				console.log(data);
				if (data == "") {
					isEmailChecked = true;
					$("#checkMailText").text("사용 가능한 이메일 주소");
					$("#checkMailText").css("color", "blue");
					$("#u_email").css("border", "1px solid rgb(108, 76, 28)").css("background-color", "white")
					e.target.value = 1;

				} else {
					isEmailChecked = false;
					$("#checkMailText").text("유효하지 않은 이메일 주소");
					$("#checkMailText").css("color", "red");
					$("#u_email").css("border", "2px solid #f03232").css("background-color", "#ff00000d")
					$("#u_email").focus();

				}

			},
		});
	});

	// email 중복 검사, id 중복 검사에서 문제가 없었을 때 로그인 페이지로 이동하도록
	$("#joinBtn").click(function(e) {
		let u_id = $('#u_id').val();
		let u_pw = $('#u_pw').val();
		let u_email = $('#u_email').val();
		let u_name = $('#u_name').val();

		e.preventDefault();
		if (u_id === "" || u_pw === "" || u_email === "" || u_name === "") {
			console.log(u_id, u_email, u_name, u_pw)
			alert("필수 입력 정보를 모두 작성해 주시기 바랍니다.")
			return;
		}
		if ($("#checkIdBtn").val() == 0) {
			alert('ID 중복검사 오류');
			return;
		}
		if ($("#checkMailBtn").val() == 0) {
			alert('E-mail 중복검사 오류');
			return;
		}

		alert("회원가입 성공! 로그인 페이지로 이동합니다.")
		document.querySelector("#join-form").submit();

	});

	// ID 특수문자, 한글 입력 불가하게
	$("#u_id").keyup(function() {
		let u_id = $(this).val();
		if (u_id.match(checkChar) || u_id.match(checkKorean)) {
			alert('한글 및 특수문자는 입력 불가합니다');
			$("#u_id").focus();
		}
	});
	// 이메일 한글 입력 불가하게
	$("#u_email").keyup(function() {
		let u_email = $(this).val();
		if (u_email.match(checkKorean)) {
			alert('한글 입력 불가합니다');
			$("#u_email").focus();
		}
	});






});