<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>

<script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<meta charset="UTF-8">
<title>통나무 펜션 예약페이지</title>

<style>
	
	#content {
		width: 1000px;
		height: 700px;
		margin: auto;
		
		
	}
	.header-style {
		height : 80px;
		background-color:white;
	}
	
	.nav-style {
		height : 40px;
		background-color:rgb(223, 131, 65);
		font-weight : bold;
		color : white;
			
	}
	
	.head-line {
		text-align:center;
	}
	
	section {
		width: 600px;
		height: 500px;
		margin: auto;
		
	}
	
	footer {
		height: 100px;
	}
	
	.info {
		font-size: 12px;
	}

</style>

</head>
<body>

	<div id="content">
	
		<header class="header-style">
			<div class="text-center">
				<a class="display-4 text-dark" href="">통나무 팬션</a>
			</div>
		</header>
		
		<nav class="nav-style">
			<ul class="nav nav-fill ul-nav">
				<li class="nav-item"><a class="nav-link text-white" href="#">팬션소개</a></li>
				<li class="nav-item"><a class="nav-link text-white" href="#">객실보기</a></li>
				<li class="nav-item"><a class="nav-link text-white" href="#">예약하기</a></li>
				<li class="nav-item"><a class="nav-link text-white" href="#">예약목록</a></li>
			</ul>
		</nav>
		
		<section>
			<h3 class="head-line mt-4 mb-4">예약 하기</h3>
			
			<div>
				<label>이름</label>
				<input type="text" class="form-control" name="name" id="nameInput">
			</div>
			
			<div class="mt-2">
				<label>예약날짜</label>
				<input type="text" class="form-control" name="date" id="testDatepicker">
			</div>
			
			
			<div class="mt-2">
				<label>숙박일수</label>
				<input type="text" class="form-control" name="day" id="dayInput">
			</div>
			
			<div class="mt-2">
				<label>숙박인원</label>
				<input type="text" class="form-control" name="headcount" id="headcountInput">
			</div>
			
			<div class="mt-2">
				<label>전화번호</label>
				<input type="text" class="form-control" name="phoneNumber" id="phoneNumberInput">
			</div>
			
			<button type="button" id="bookingBtn" class="btn btn-warning form-control mt-3 font-weight-bold">예약하기</button>
		</section>
		
		<footer>
			<div class="text-secondary">
				<div class="p-3 info">
					제주특별자치도 제주시 애월읍 <br>
					사업자등록번호 : 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
					Copyright © 2025 tongnamu All Rights reserved
				</div>
			
			</div>
		</footer>
		
	
	</div>

	<script>
	
		$(document).ready(function(){
			
			
			$("#bookingBtn").on("click", function() {
				// 사용자가 입력한 값을 api로 데이터를 저장한다.
				let name = $("#nameInput").val();
				let date = $("#testDatepicker").val(); 
				let day = $("#dayInput").val();
				let headcount = $("#headcountInput").val();
				let phoneNumber = $("#phoneNumberInput").val();
				
				// 유효성 검사
				// 입력 내용이 모두 있는지

				
				//숙박일수, 인원수 숫자가 아닌 값이 있는지
				
				
				
				if(name == ""){
					alert("이름을 입력하세요");
					return;
				}
				
				if(date == ""){
					alert("예약날짜를 입력하세요");
					return;
				}
				
				if(day == ""){
					alert("숙박일수를 입력하세요");
					return;
				}
				
				if(headcount == ""){
					alert("숙박인원을 입력하세요");
					return;
				}
				
				if(phoneNumber == ""){
					alert("전화번호를 입력하세요");
					return;
				}
				
				
				$.ajax({
					type:"get"
					, url:"/mini/add"
					, data:{"name":name, "date":date, "day":day, "headcount":headcount, "phoneNumber":phoneNumber}
					, success:function(data){
						// 성공하면 result:success , 실패하면 result:fail
						if(data.result == "success"){
							location.href = "/mini/tables";
						} else {
							alert("예약 실패");
						}
						}
					, error:function() {
						alert("예약 에러");
					}
				});
				
			});
			

		});
	
	
	</script>


</body>
</html>