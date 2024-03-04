

// 모달창 띄우기와 끄기 
document.addEventListener("DOMContentLoaded", function() {
   // 모달 요소들을 가져옴
   let modalOverlay = document.querySelector('.modal-overlay');
   let modal = document.querySelector(".modal-container");
   let cancelButton = document.querySelector("#cancel-button");
	
  function openMemo(e){
    let memoId = e.target.id;
    console.log(memoId)
    fetch("/happy-capsule/open/memo/"+memoId)
  .then(response => {
    return response.json(); // JSON 형식으로 파싱된 응답 데이터를 반환합니다.
  })
  .then(data => {
    console.log(data);
    document.querySelector('.modal-img-show').innerHTML = '';
    let modalTitleInput = document.querySelector('.modal-title');
    let modalDateInput = document.getElementById('modal-date-input');
    let modalTextarea = document.querySelector('.modal-textarea');
    let modalImgShow = document.querySelector('.modal-img-show');
    var noImageMark = document.querySelector(".no-image-mark");

    console.log(modalTitleInput);
    console.log(modalImgShow);
    console.log(modalDateInput);
    console.log(modalTextarea);
    modalTitleInput.innerText = '오늘의 행복 키워드: ' + data.m_keyword;
    modalImgShow.innerHTML += "<img id='modal-img-show' src='"+data.m_pic+"'>"
    modalDateInput.textContent = data.m_date;
    modalTextarea.innerText = data.m_text;

    console.log(data.m_pic); 

    if (data.m_pic == null) {
      modalImgShow.innerHTML = '';
      document.querySelector(".no-image-mark").style.display = 'block';
    } else {
      document.querySelector(".no-image-mark").style.display = 'none';
    }

    // 모달 열기
    modal.style.display = "block";
    modalOverlay.style.display = 'block';
    
  })
  .catch(error => {
    // 에러 처리를 합니다.
    console.error('Fetch Error:', error);
  });
}
// 이미지 클릭 이벤트 리스너 추가
let memoImages = document.querySelectorAll('.main-memo');
memoImages.forEach(image => {
    image.addEventListener('click', openMemo);
});



// Esc 키를 눌렀을 때 모달 닫기
document.addEventListener("keydown", (event) => {
  if (event.key === "Escape" && modal.style.display === "block") {
    closeModal();
  }
});

function closeModal() {
  modal.style.display = 'none';
  modalOverlay.style.display = 'none';
}

});

