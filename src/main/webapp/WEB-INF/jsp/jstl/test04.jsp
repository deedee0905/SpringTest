<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>fn 라이브러리</title>
</head>
<body>

	<div class="container">
		
		<h1>회원정보 리스트</h1>
		<table class="table text-center">
			<thead>
				<tr>
					<th>No</th>
					<th>이름</th>
					<th>전화번호</th>
					<th>국적</th>
					<th>이메일</th>
					<th>자기소개</th>
				</tr>
			</thead>
			
			<tbody>
				<tr>
				<c:forEach var="members" items="${kingdoms }" varStatus="status">
				
					<td>${status.count }</td>
					
					<td>${members.name }</td>
					
					<c:choose>
						<c:when test="${fn:startsWith(members.phoneNumber, '010') }">
							<td>${members.phoneNumber }</td>
						</c:when>
						<c:otherwise>
							<td>유효하지 않은 번호</td>
						</c:otherwise>
					</c:choose>
					
					<td>${fn:replace(members.nationality, "삼국시대", "삼국 -") }</td>
					
					<td><b>${fn:split(members.email, "@")[0] }</b>${fn:split(members.email, "@")[1] }</td>
					
					<c:choose>
						<%-- 자기소개가 15 초과 이면 문자열 자르고, ... 을 붙인다.$ --%>
						<c:when test="${fn:length(members.introduce) > 15 }"> 
							<td>${fn:substring(members.introduce, 0, 15) }...</td>
						</c:when>
						<c:otherwise>
							<td>${members.introduce }</td>
						</c:otherwise>
						
					</c:choose>
					<td>${members.introduce }</td>
				</tr>
				</c:forEach>
			</tbody>
		
		</table>
	
	</div>

</body>
</html>