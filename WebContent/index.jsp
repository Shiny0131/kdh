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
				<span id="project"><a href="project.jsp">PROJECT</a></span>
				<span id="collection"><a href="#">COLLECTION</a></span>
				<!-- <span id="shop"><a href="#">SHOP</a></span> -->
				<!-- <span id="cart"><a href="#">CART</a></span> -->
				<!-- <span id="login"><a href="goLogin.do">LOGIN</a></span> -->
				<span id="login"><a href="login.jsp">LOGIN</a></span>
			</div>
		</div>
		<div class="main">
			<span><img src="image/DHK/vete.jpg" style="width: 100%; height: 100%;"></span>
		</div>
		<div class="footer">
			<jsp:include page="footer.jsp" />
		</div>
	</body>
</html>