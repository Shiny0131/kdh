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
		<script type="text/javascript">
			function goDetailMenu(menuId) {
				document.getElementById("menuId").value = menuId;
				document.getElementById("menuForm").submit();
			}
		</script>
	</head>
	<body>
		<div class="header">
			<a href="index.jsp"><img alt="main" src="image/DHK/DHK.png" draggable="false" style="width: 300px; height: 150px;"></a>
			<div class="topmenu-project">
				<span id="about"><a href="about.jsp">ABOUT</a></span>
				<span id="project"><a href="getMenu.do">PROJECT</a></span>
				<span id="collection"><a href="#">COLLECTION</a></span>
				<!-- <span id="shop"><a href="#">SHOP</a></span> -->
				<!-- <span id="cart"><a href="#">CART</a></span> -->
				<c:choose>
					<c:when test="${null eq loginSession }" >
						<span id="login"><a href="login.jsp">LOGIN</a></span>
					</c:when>
					<c:otherwise>
						<form action="logout.do" id="logoutForm" method="get" style="display: none;"></form>
						<span id="logout"><a href="#" onclick="document.getElementById('logoutForm').submit();">LOGOUT</a></span>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<div class="main">
			<div id="n">
				<div class="project-img" align="center">
					<img src="image/DHK/83642141048545.57972b969919d.jpg" style="max-width: 80%; max-height: 80%;"/>
				</div>
				<div class="project-menu"  style="max-width: 80%; max-height: 80%;">
					<form action="getDetailProject.do" id="menuForm" method="post">
						<input type="hidden" id="menuId" name="menuId" value=""/>
						<c:forEach items="${requestScope.menuList}"  var="result">
							<ul onclick="goDetailMenu('${result.menuId}')"><c:out value="${result.menuName }"/></ul>
						</c:forEach>
					</form>
				</div>
			</div>
		</div>
		<div class="footer">
			<jsp:include page="footer.jsp" />
		</div>
	</body>
</html>