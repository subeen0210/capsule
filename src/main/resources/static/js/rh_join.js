var checkChar = /[~!@\#$%^&*\()\-=+_'\;<>\/.\`:\"\\,\[\]?|{}]/gi;
var checkKorean = /[ㄱ-ㅎㅏ-ㅣ]/gi;


$(function() {
	let isIdChecked = false;
	let isEmailChecked = false;

	// ID 중복검사
	$("#checkIdBtn").click(function() {
		let u_id = $('#u_id').val();
		$.ajax({
			url: "/happy-capsule/join/checkID",
			data: { u_id: u_id },
			type: "get",
			success: function(data) {
				console.log(data);
				if (data == "") {
					isIdChecked = true;
					$("#checkIdText").text("사용 가능");
					$("#checkIdText").css("color", "blue");
				} else {
					isIdChecked = false;
					$("#checkIdText").text("사용 불가");
					$("#checkIdText").css("color", "red");
					return;
				}
			},
		});
	});

	// 메일 중복검사
	$("#checkMailBtn").click(function() {
		let u_email = $('#u_email').val();
		$.ajax({
			url: "/happy-capsule/join/checkMail",
			data: { u_email: u_email },
			type: "get",
			success: function(data) {
				console.log(data);
				if (data == "") {
					isEmailChecked = true;
					$("#checkMailText").text("사용 가능");
					$("#checkMailText").css("color", "blue");
				} else {
					isEmailChecked = false;
					$("#checkMailText").text("사용 불가");
					$("#checkMailText").css("color", "red");
					$("#u_email").css("border", "2px solid #f03232x").css("background-color", "#ff00000d")
					$("#u_email").focus();

				}

			},
		});
	});

	// email 중복 검사, id 중복 검사에서 문제가 없었을 때 로그인 페이지로 이동하도록
	$("#joinBtn").click(function() {
		if (isIdChecked && isEmailChecked) {
			alert('회원 가입 성공. 로그인 페이지로 이동합니다.');
			$(location).attr('href', '/happy-capsule/login');
		} else {
			alert('회원가입 실패. 다시 실행해 주시기 바랍니다.');
			$("input").val("");
			$("#u_id").focus();
			return;
		}

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