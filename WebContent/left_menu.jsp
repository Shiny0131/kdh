<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${sessionScope.loginSession.id == 'admin'}">
		<p><a href="teamInfo.do">회원정보</a></p>
		<p><a href="teamList.do">회원리스트보기</a></p>
		
		<br><hr><br>
		<p><a href="index.jsp?content=addProject.jsp">프로젝트 등록</a></p>
		<p><a href="proList.do"> 프로젝트 조회</a>	</p>
		
	</c:if>	
	<c:if test="${sessionScope.loginSession.id != 'admin'}">
		<p><a href="teamInfo.do">회원정보</a></p>
		<p><a href="proList.do"> 프로젝트 조회</a>	</p>
	</c:if>	
</body>
</html>