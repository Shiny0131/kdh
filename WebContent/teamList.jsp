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
	<h2 align="center"> 팀원 리스트 </h2>
	
	<table border="1" align="center">
		
		<tr>
			<td width="60"> 아이디 </td>
			<td width="80">비밀번호 </td>
			<td width="80">이름 </td>
			<td width="120">주소 </td>
			<td width="120">코드 </td>
		</tr>
		<c:forEach items="${requestScope.teamList}" var="team">
		<tr>
			<td width="60"> ${team.id} </td>
			<td width="80"> ${team.pw} </td>
			<td width="80"> ${team.name} </td>
			<td width="120"> ${team.addr} </td>
			<td width="120"> ${team.proCode} </td>
			<c:if test="${team.id != 'admin' && team.confirm != 1}">
				<td colspan="2"> <input type="button" value="승인" onclick="location.href='teamConfirm.do?id=${team.id}'"></td>
			</c:if>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>