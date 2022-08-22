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
		height : 600px;
		background-color:darkblue;
	
	}
	
	.header-style {
		
		height : 80px;
		background-color:white;
		
	}
	
	.nav-style {
		height : 40px;
		background-color:deeppink;
		font-weight : bold;
		color : white;
			
	}
	
	.main-img {
	 	height : 300px;
	}
	
	.box1 {
		
		height: 150px;
		background-color: antiquewhite;
	}
	
	.box2 {
		
		
		background-color: aqua;
	}
	
	.box3 {
		
		background-color: antiquewhite;
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
				<li class="nav-item"><a>팬션소개</a></li>
				<li class="nav-item"><a>객실보기</a></li>
				<li class="nav-item"><a>예약하기</a></li>
				<li class="nav-item"><a>예약목록</a></li>
			</ul>
		</nav>
		
		<section>
			<div>
				<img class="main-img w-100" src="https://cdn.pixabay.com/photo/2015/08/25/14/16/small-wooden-house-906912_960_720.jpg">
			</div>
			
			<div class="d-flex">
				<div class="box1 col-4"></div>
				<div class="box2 col-5"></div>
				<div class="box3 col-3"></div>
			
			</div>
		
		</section>
		
		<footer></footer>
	
	
	</div>

</body>
</html>