<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


<script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<h1>즐겨찾기 추가하기</h1>
		
		<div>
			<label>제목</label>
			<input type="text" class="form-control" name="name" id="nameInput" >
		</div>
		
		<div>
			<label class="mt-2">주소</label>
			<div class="d-flex">
				<input type="text" class="form-control" name="url" id="urlInput">
				<button type="button" id="checkBtn" class="ml-3 btn btn-info">중복확인</button>
			</div>
		</div>
		
		<button type="button" id="saveBtn" class="btn btn-success form-control mt-2">추가</button>
	
	</div>
	
	
	<script>
		$("#document").ready(function() {
			
			// 중복확인버튼 이벤트
			$("#checkBtn").on("click", function(){
				
				let url = $("#urlInput").val();
				
				if(url == ""){
					alert("주소를 입력하세요.");
					return;
				}
				
				$.ajax({
					type:"get"
					, url:"/ajax/favorite/is_duplicate"
					, data:{"url":url}
					, success:function(data){
						if(data.is_duplicate){
							alert("중복되었습니다.");
						} else{
							alert("사용가능합니다.");
						}
					}
					,error:function(){
						alert("중복 확인 에러");
					}
					
				})
				
				
			});
			
			// 세이브버튼 이벤트
			$("#saveBtn").on("click", function(){
				
				let name = $("#nameInput").val();
				let url = $("#urlInput").val();
				
				
				// 유효성 검사 (validation)
				
				if(name == ""){
					alert("제목을 입력하세요.");
					return;
				}
				
				if(url == ""){
					alert("주소를 입력하세요.");
					return;
				}
				
				if(!(url.startsWith("http://") || url.startsWith("https://"))) {
					alert("주소 형식이 잘못되었습니다.");
					return;
				} 
				
				// api 호출
				// ajax 사용
				$.ajax({
					type:"post"
					, url:"/ajax/favorite/add"
					, data:{"name":name, "url":url}
					, success:function(data) {
						if(data.result == "success"){
							location.href="/ajax/favorite/linkTables";
						} else {
							alert("저장 실패");
						}
						
					}
					, error:function() {
						alert("에러 발생")
					}
				})
				
				
				
				
			
			})
			
			
			
		})
	</script>
	
	

</body>
</html>