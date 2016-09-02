<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>=DHK=LOGIN</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="js/kdh.js"></script>
		<link rel="stylesheet" href="css/kdh.css" />
	</head>
	<body>
		<div class="header" >
			<a href="index.jsp"><img alt="main" src="image/DHK/DHK.png" draggable="false" style="width: 300px; height: 150px;"></a>
			<div class="topmenu-login">
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
			<div class="login">
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="id" name="id"/></p>
				<p>PASSWORD<input type="password" id="password" name="password"/></p>
				<p><input type="button" id="in" name="in" value="LOGIN"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" id="join" name="join" value="JOIN"/></p>
			</div>
		</div>
		<div class="footer">
			<jsp:include page="footer.jsp" />
		</div>
	</body>
</html>