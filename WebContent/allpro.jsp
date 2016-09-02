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
	<h2 align="center">	제품 전체 목록 </h2>
	
	<table border="1" align="center">
		
		<tr >
			<td>프로젝트 코드 </td>
			<td>프로젝트 이름 </td>
			<td>인원 수 </td>
			<td>시작 일 </td>
			<td>종료 일 </td>
		</tr>
		<c:forEach items="${requestScope.plist}" var="projects">
		<tr>
			<c:if test="${sessionScope.loginSession.id == 'admin'}">
				<td><a href="proInfo.do?proCode=${projects.proCode}">${projects.proCode}</a></td>
			</c:if>
			<c:if test="${sessionScope.loginSession.id != 'admin'}">
				<td>${projects.proCode}</td>
			</c:if>
			<td>${projects.proName} </td>
			<td>${projects.proNumber} </td>
			<td>${projects.sDate} </td>
			<td>${projects.dDate} </td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>