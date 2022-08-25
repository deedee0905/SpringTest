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

<meta charset="UTF-8">
<title>통통나무 팬션</title>

<style>

	.whole {
		width : 800px;
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
	
	.main-img {
	 	height : 300px;
	}
	
	.box1 {
		
		height: 170px;
		background-color:saddlebrown;
		text-align : center;
	}
	
	.reservationLink {
		font-size: 30px;
	}
	
	.box2 {
		background-color:chocolate;
	}
	
	.box3 {
		background-color:saddlebrown;
	}
	
	.hp {
		font-size: 31px;
	}
	
	.hp-call {
		font-size: 20px;
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

	<div class="whole container">
		
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
			<div>
				<img class="main-img w-100" src="https://cdn.pixabay.com/photo/2015/08/25/14/16/small-wooden-house-906912_960_720.jpg">
			</div>
			
			<div class="d-flex">
			
				<div class="box1 col-4">
					<div class="mt-4">
						<a class="text-white reservationLink" href="#">실시간<br>예약하기</a>
					</div>
				</div>
				
				<div class="box2 col-5">
					<div class="text-white p-1">예약 확인</div>
					<div class="d-flex">
						<label class="text-white ml-3 mt-2 mr-3">이름</label> <input type="text" class="form-control col-8" id="naemInput">
					</div>
					<div class="d-flex mt-2">
						<label class="text-white ml-3 mt-2 mr-2">전화번호</label> <input type="text" class="form-control col-7" id="phoneNumberInput">
					</div>
					
					<button id="lookupBtn" type="button" class="btn btn-success btn-sm mt-2 " style="float: right;" >조회하기</button>
					
				</div>
				
				<div class="box3 col-3">
					<label class="text-white hp-call mt-3 ml-2">예약문의:</label>
					<label class="text-white hp ml-2">010-0000-1111</label>
				</div>
			
			</div>
		
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
	
	$(document).ready(function() {
		
		$("#lookupBtn").on("click", function() {
			
			let name = $("#naemInput").val();
			let phoneNumber = $("#phoneNumberInput").val();
			
			if(name == ""){
				alert("이름을 입력하세요");
				return;
			}
			
			if(phoneNumber == ""){
				alert("전화번호를 입력하세요");
				return;
			}
			
			$.ajax({
				type:"post"
				, url:"/mini/find"
				, data:{"name":name, "phoneNumber":phoneNumber}
				, success:function(data) {
					
					if(data.result == "fail"){
						alert(" 조회된 결과가 없습니다.");
					} else{
						alert("이름 : " + data.data.name + "\n"
								+ "날짜 : " + data.data.date.slice(0, 10) + "\n"
								+ "숙박일수 : " + data.data.day + "\n"
								+ "숙박인원 : " + data.data.headcount
								+ "상태 : " + data.data.state);
					} 
					, error:function(){
						alert("오류!");
					}
					}
					
					
			});

			
		});
		
	});
	
	
	</script>


</body>
</html>