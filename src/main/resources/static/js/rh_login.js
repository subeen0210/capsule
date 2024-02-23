$(function() {
    // input에서 키보드 눌림 감지
    $('input[name=u_id], input[name=u_pw]').keydown(function(e) {
        if (e.which === 13) { // e.which를 사용해 눌린 키의 keyCode 확인
            e.preventDefault(); // 기본 이벤트 방지
            $('#loginBtn').click(); // 로그인 버튼 클릭 이벤트 실행
        }
    });

    // 로그인 버튼을 클릭했을 때
    $('#loginBtn').click(function(e) {
        e.preventDefault(); // 기본 이벤트 방지
        
        var u_id = $('input[name=u_id]').val(); // 아이디 값 가져오기
        var u_pw = $('input[name=u_pw]').val(); // 비밀번호 값 가져오기
        $.ajax({
            type: 'POST',
            url: '/happy-capsule/login', // 로그인 요청 URL
            data: { u_id: u_id, u_pw: u_pw }, // 아이디와 비밀번호 데이터 전송
            success: function(response) {
                if (response === '1') {
                    // 로그인 성공 시 shelf 페이지로 리다이렉트
alert("┌─────────────────────┐\n         로그인 성공! 오늘의 행복을 저금해 보세요 ♥\n└─────────────────────┘\n　　ᕱ ᕱ ||\n　 ( ･ω･ ||\n　 /　つΦ");

                    window.location.href = '/happy-capsule/shelf';
                } else {
                    // 로그인 실패 시 alert 창 표시
                    alert('로그인에 실패했습니다. 다시 시도해주세요.');
                }
            }
        });
    });
});
