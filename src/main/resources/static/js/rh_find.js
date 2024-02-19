// 이메일로 id/pw 찾고 일부 마킹 처리해서 보여주기

// 마킹 처리하는 로직
function maskString(str) {
    if (str.length <= 3) {
		// 문자열의 길이가 3보다 작거나 같을 때 0번째는 글자, 1번째 2번째는 **, 3번째는 글자 
        return str.charAt(0) + '**' + str.slice(-1);
        
    } else {
		// 그게 아니라면 0번째는 글자, 그 뒤로는 * 반복(글자 길이-3만큼), 마지막엔 글자
        return str.charAt(0) + '*' + '*'.repeat(str.length - 3) + str.slice(-1);
    }
}


$(function() {

	$("#findBtn").click(function() {
		let u_email = $('#u_email').val();
		//email 찾기
		$.ajax({
			type: 'POST',
			url: '/happy-capsule/login/find', // 로그인 요청 URL
			data: { u_email: u_email }, // 아이디와 비밀번호 데이터 전송
			success: function(data) {
				if (data == "") {
					alert("일치하는 정보가 없습니다")
				} else {
					let maskID = 
					
					$("#find-form").css("display", "none");
					$(".find-input-box").css("justify-content","space-between");
					$("#find-result").css("display", "flex");
					console.log(data.u_id);
					
					
					$("#find-id").text(data.u_id);
					$("#find-pw").text(data.u_pw);
					$("#find-name").text(data.u_name);
					$("#findBtn").text("LOGIN");

				}
			}
		});
	})

});
