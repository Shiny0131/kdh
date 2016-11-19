<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>=DHK=</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="js/kdh.js"></script>
		<link rel="stylesheet" href="css/kdh.css" />
		<link rel="shortcut icon" href="image/DHK/f8910241048545.57972b96986b7.jpg"/>
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
			<span><img src="image/gIVENCHY/10864741048875.57972ed9dc94a.jpg" style="width: 100%; height: 100%;"></span>
			<span><img src="image/gIVENCHY/353c9641048875.57972ed9dc31d.jpg" style="width: 100%; height: 100%;"></span>
			<span><img src="image/gIVENCHY/42ae2f41048875.57972ed9dce06.jpg" style="width: 100%; height: 100%;"></span>
			<span><img src="image/gIVENCHY/back.jpg" style="width: 100%; height: 100%;"></span>
			<span><img src="image/gIVENCHY/front.jpg" style="width: 100%; height: 100%;"></span>
		</div>
		<div class="footer">
			<jsp:include page="../footer.jsp" />
		</div>
	</body>
</html>