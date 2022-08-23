<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
<title>예약 리스트</title>

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
			<h3 class="head-line mt-2 mb-2">예약 목록 보기</h3>
			<table class="table text-center">
				<thead>
					<tr>
						<th>이름</th>
						<th>예약날짜</th>
						<th>숙박일수</th>
						<th>숙박인원</th>
						<th>전화번호</th>
						<th>예약상태</th>
						<th></th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach var="reservation" items="${booking }">
					<tr>
						<td>${reservation.name }</td>
						<td><fmt:formatDate value="${reservation.date }" pattern="yyyy년 MM월 dd일" /></td>
						<td>${reservation.day }</td>
						<td>${reservation.headcount }</td>
						<td>${reservation.phoneNumber }</td>
						
						<c:choose>
							<c:when test="${reservation.state eq '대기중' }">
								<td class="text-info">${reservation.state }</td>
							</c:when>
							
							<c:when test="${reservation.state eq '확정' }">
								<td class="text-success">${reservation.state }</td>
							</c:when>
						</c:choose>
					
						<td><button type="button" class="btn btn-danger btn-sm">삭제</button></td>
						
					</tr>
					</c:forEach>
				</tbody>
			</table>
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
	


</body>
</html>