document.addEventListener("DOMContentLoaded", function() {









});

function openMemo(e){
    console.log(e.id)
    fetch("/happy-capsule/open/memo/"+e.id)
  .then(response => {
    return response.json(); // JSON 형식으로 파싱된 응답 데이터를 반환합니다.
  })
  .then(data => {
    // 처리된 데이터를 사용합니다.
    console.log(data);
  })
  .catch(error => {
    // 에러 처리를 합니다.
    console.error('Fetch Error:', error);
  });
}