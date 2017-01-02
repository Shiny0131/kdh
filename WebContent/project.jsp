<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=yes" />
		<title>=DHK=PROJECT</title>
		<link rel="shortcut icon" href="image/DHK/f8910241048545.57972b96986b7.jpg"/>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="js/kdh.js"></script>
		<link rel="stylesheet" href="css/kdh.css" />
		<link rel="stylesheet" href="dist/css/swiper.min.css">
		<script type="text/javascript">
		    function goDetailMenu(menuId){
				$.ajax({
					url:"getProjectDetail.do",
					method: "GET",
					contentType: "application/json",
					data: "menuId="+menuId,
					dataType: "json",
					success: function(data){						
						document.getElementById("mainImage").style.display = "none";
						var inner = "";
						for(var i = 0; i < data.urls.length; i++) {
							inner += "<div class='swiper-slide'><img src='"+ data.urls[i].url +"'/></div>";
						}
						//inner += "<div class='swiper-button-next'></div><div class='swiper-button-prev'></div>";
						document.getElementById("imageSlide").innerHTML = inner;
						document.getElementById("changeImage").style.display = "block";
					}
				});
			}
		</script>
	</head>
	<body>
		<div class="header">
			<a href="index.jsp"><img alt="main" src="image/DHK/DHK.png" draggable="false" style="width: 300px; height: 150px;"></a>
			<div class="topmenu-main">
				<span id="about"><a href="about.jsp">ABOUT</a></span>
				<span id="project"><a href="getMenu.do">PROJECT</a></span>
				<span id="collection"><a href="#">COLLECTION</a></span>
				<!-- <span id="shop"><a href="#">SHOP</a></span> -->
				<!-- <span id="cart"><a href="#">CART</a></span> -->
				<!-- <span id="login"><a href="goLogin.do">LOGIN</a></span> -->
				<c:choose>
					<c:when test="${null eq loginSession }" >
						<span id="login"><a href="login.jsp">LOGIN</a></span>
					</c:when>
					<c:otherwise>
						<form action="logout.do" id="logoutForm" method="post" style="display: none;"></form>
						<span id="logout"><a href="#" onclick="document.getElementById('logoutForm').submit();">LOGOUT</a></span>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<div class="main">
			<div id="n">
				<div class="project-menu">
					<form action="getProjectDetail.do" id="menuForm" method="post">
						<input type="hidden" id="menuId" name="menuId" value=""/>
						<c:forEach items="${requestScope.menuList}"  var="result">
							<ul onclick="goDetailMenu('${result.menuId}')"><c:out value="${result.menuName }"/></ul>
						</c:forEach>
					</form>
				</div>
				<div id="mainImage" style="display: blcok;">
					<div class="swiper-container">
						<div class="swiper-wrapper">
							<div class="swiper-slide"><img src="image/DHK/83642141048545.57972b969919d.jpg"/></div>
							<div class="swiper-slide"><img src="image/DHK/b41b9c41048545.57972b9698b4f.jpg"/></div>
							<div class="swiper-slide"><img src="image/DHK/baf82f41048545.57972b9698045.jpg"/></div>
							<div class="swiper-slide"><img src="image/DHK/DHK.png"/></div>
							<div class="swiper-slide"><img src="image/DHK/f8910241048545.57972b96986b7.jpg"/></div>
							<div class="swiper-slide"><img src="image/DHK/profile.jpg"/></div>
							<div class="swiper-slide"><img src="image/DHK/vete.jpg"/></div>
						</div>
						<!-- Add Pagination -->
						<!-- <div class="swiper-pagination"></div> -->
						<!-- Add Arrows -->
						<div class="swiper-button-next"></div>
						<div class="swiper-button-prev"></div>
					</div>
				</div>
				<div id="changeImage" style="display: none;">
					<div class="swiper-container">
						<div id="imageSlide" class="swiper-wrapper">
						</div>
						<div class="swiper-button-next"></div>
						<div class="swiper-button-prev"></div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer">
			<p>
				<span><a href="https://www.instagram.com/kimdhyup/" target="_blank">INSTAGRAM</a></span>
				<span><a href="contact.jsp">CONTACT</a></span>
			</p>
			<p>Copyright © KIMDONGHYUP, All Rights Reserved. Site By Seyoon</p>
		</div>
		<script src="dist/js/swiper.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				var swiper = new Swiper('.swiper-container', {
		        nextButton: '.swiper-button-next',
		        prevButton: '.swiper-button-prev',
		        slidesPerView: 1,
		        spaceBetween: 30,
		        loop: true
			    });
				console.log("test");
				
			});
			
		</script>
	</body>
</html>