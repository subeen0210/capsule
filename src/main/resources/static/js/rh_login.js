$(function() {

	// ID 중복검사
	$("#checkIdBtn").click(function(){
		let u_id = $('#u_id').val();
          $.ajax({
            url: "/happy-capsule/join/checkID",
            data: { u_id: u_id },
            type: "get",
            success: function (data) {
		console.log(data);
              if (data == "") {
                $("#checkIdText").text("사용 가능");
                $("#checkIdText").css("color", "blue");
              } else {
                $("#checkIdText").text("사용 불가");
                $("#checkIdText").css("color", "red");
              }
            },
          });
	});
	$("#checkMailBtn").click(function(){
		let u_email = $('#u_email').val();
          $.ajax({
            url: "/happy-capsule/join/checkMail",
            data: { u_email: u_email },
            type: "get",
            success: function (data) {
		console.log(data);
              if (data == "") {
                $("#checkMailText").text("사용 가능");
                $("#checkMailText").css("color", "blue");
              } else {
                $("#checkMailText").text("사용 불가");
                $("#checkMailText").css("color", "red");
                $("#u_email").css("border", "2px solid #f03232x").css("background-color", "#ff00000d")
              	$("#u_email").focus();
              }
              
            },
          });
	});
	
	$("#joinBtn").click(function() {
	

		alert('회원 가입 성공. 로그인 페이지로 이동합니다.');
		$(location).attr('href', '/happy-capsule/login');
	});


});