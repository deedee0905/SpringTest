<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container">
		<h1>즐겨찾기 목록</h1>
		
		<table class="table ">
			<thead class="text-left">
				<tr>
					<th>No.</th>
					<th>이름</th>
					<th>주소</th>
					<th></th>
				</tr>
			</thead>
			
			<tbody>
			<c:forEach var="linkList" items="${links }" varStatus="status" >
				<tr>
					<td>${status.count }</td>
					<td>${linkList.name }</td>
					<td>${linkList.url }</td>
					<td><button class="btn btn-danger btn-sm deleteBtn" value="${linkList.id }">삭제</button></td>
				</tr>
				</c:forEach>
				
			</tbody>
		
		</table>
	</div>


<script>

	$(document).ready(function() {
		
		// 삭제 버튼 눌렀을 때 이벤트
		$(".deleteBtn").on("click",function() {
			let idNumber = $(this).val();
			
			$.ajax({
				type:"get"
				, url:"/ajax/favorite/delete"
				, data:{"id":id}
				, success:function(data){
					if(data.result == "success" && idNumber = id){
						location.href="/ajax/favorite/linkTables";
					} else{
						alert("삭제 실패");
					}
				}
				, error:function(){
					alert("에러 발생");
				}
				
			});
				
			
		
			
			
			
		});
		
	});

</script>

</body>
</html>