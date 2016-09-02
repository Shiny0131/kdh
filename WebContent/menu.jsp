<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title>Insert title here</title>
	</head>
	<body>
		<div class="sidebar pure-u-1 pure-u-md-1-4">
		        <div class="header">
		            <h1 class="brand-title"><a href="getLatelyA.do">Seyoon</a></h1>
		            <h2 class="brand-tagline">rlatpdbs@gmail.com</h2>		
		            <nav class="nav">
		                <ul class="nav-list">
		                    <li class="nav-item">
		                        <a class="pure-button" href="aList.do">글 게시판</a>
		                    </li>
		                    <li class="nav-item">
		                        <a class="pure-button" href="bList.do">사진 게시판</a>
		                    </li>
		                </ul>
		            </nav>
		            <div>
			            <c:if test="${!empty sessionScope.loginSession}">		            
			            	${sessionScope.loginSession.name} :)
			            </c:if>
					</div>
		        </div>
		    </div>
	</body>
</html>