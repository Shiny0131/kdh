<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>=DHK=PROJECT</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="js/kdh.js"></script>
		<link rel="stylesheet" href="css/kdh.css" />
	</head>
	<body>
		<div class="header">
			<a href="index.jsp"><img alt="main" src="image/DHK/DHK.png" draggable="false" style="width: 300px; height: 150px;"></a>
			<div class="topmenu-project">
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
			<div class="project-img" align="center">
				<img src="image/DHK/83642141048545.57972b969919d.jpg" style="max-width: 80%; max-height: 80%;"/>
			</div>
			<div class="project-menu">
				<!-- c:forEach태그로 db에서 불러오게 수정 -->
				<ul><a href="#">DHK</a></ul>
				<ul><a href="#">DIOR</a></ul>
				<ul><a href="#">GIVENCHY</a></ul>
				<ul><a href="#">LumpeN</a></ul>
				<ul><a href="#">MARGIELA</a></ul>
				<ul><a href="#">SEOUL</a></ul>
			</div>
		</div>
		<div class="footer">
			<jsp:include page="footer.jsp" />
		</div>
	</body>
</html>