$(function() {
    $('.login-button').click(function(e) {
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
                    window.location.href = '/happy-capsule/shelf';
                } else {
                    // 로그인 실패 시 alert 창 표시
                    alert('로그인에 실패했습니다. 다시 시도해주세요.');
                }
            }
        });
    });
});


