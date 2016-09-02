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
	<h2 align="center"> 프로젝트 리스트 </h2>
	
	<table border="1" align="center">
		
		<tr>
			<td width="60"> 번호 </td>
			<td width="120">프로젝트이름 </td>
			<td>참여 인원 </td>
			<td width="60">시작일 </td>
			<td width="60">종료일 </td>
			<td width="150">프로젝트 설명 </td>
		</tr>
		<c:forEach items="${requestScope.plist}" var="projects">
		<tr>
			<td><a href="proInfo.do?proCode=${projects.proCode}"> ${projects.proCode} </a></td>
			<td> ${projects.proName} </td>
			<td> ${projects.proNumber} </td>
			<td> ${projects.sDate} </td>
			<td> ${projects.dDate} </td>
			<td> ${projects.description} </td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>