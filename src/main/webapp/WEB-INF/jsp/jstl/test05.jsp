<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>날씨 정보 페이지</title>
</head>
<body>


<div class="container">

    <div class="d-flex">
	      <nav class="bg-primary col-2">
	
	        <ul class="nav flex-column">
	          <li class="nav-item">
	            <a class="nav-link  text-white active" href="#"><img width="120" src="https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F5669%2F2022%2F07%2F05%2F0000044371_001_20220705041004029.jpg&type=sc960_832"></a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link text-white" href="#">날씨</a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link text-white" href="#">날씨입력</a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link text-white" href="#">테마날씨</a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link disabled text-white" href="#">관측기후</a>
	          </li>
	        </ul>
	
	      </nav>
	
	      <section class="p-1 ml-1">
	        <div>
	          <h3>과거날씨</h2>
	
	            <table class="table text-center">
	              <thead>
	                <tr>
	                  <th>날짜</th>
	                  <th>날씨</th>
	                  <th>기온</th>
	                  <th>강수량</th>
	                  <th>미세먼지</th>
	                  <th>풍속</th>
	                </tr>
	              </thead>
	
	              <tbody>
	                <tr>
	               	<c:forEach var="weather" items="${pastWeatherList }">
	                  <td>${weather.date } </td>
	                  <td>${weather.weather } </td>
	                  <td>${weather.temperatures } </td>
	                  <td> ${weather.precipitation } </td>
	                  <td>${weather.microDust } </td>
	                  <td>${weather.windSpeed } </td>
	                </tr>
	                </c:forEach>
	
	              </tbody>
	
	            </table>
	
	        </div>
	      </section>
	    </div>
	
	    <footer class="d-flex">
	      <div class="m-3"><img  width="180" src="https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F5669%2F2022%2F07%2F05%2F0000044371_001_20220705041004029.jpg&type=sc960_832"></div>
	      <div>
	        <h5 class="p-2 mt-3 text-secondary"> (07062)서울시 동작구 여의대방로 16길 61</h5>
	        <h5 class="p-2 text-secondary"> Copyright © KMA. ALL Rights RESERVED  2021 </h5>
	      </div>
	    </footer>

  </div>
	

</body>
</html>