<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center"> 프로젝트 정보 </h2>
	<form action="proUpdate.do" method="post" id="detailForm">
	<table border="1" align="center">
		<tr>
			<td>프로젝트 코드 </td>
			<td><input type="text" name="proCode" value="${requestScope.list.proCode}" readonly="readonly"> </td>
		</tr>
		<tr>
			<td>프로젝트 이름 </td>
			<td><input type="text" name="proName" value="${requestScope.list.proName}">  </td>
		</tr>
		<tr>
			<td>인원 수 </td>
			<td><input type="text" name="proNumber" value="${requestScope.list.proNumber}"> </td>
		</tr>
		<tr>
			<td>시작일 </td>
			<td><input type="text" name="sDate" value="${requestScope.list.sDate}"> </td>
		</tr>
		<tr>
			<td>종료일 </td>
			<td><input type="text" name="dDate" value="${requestScope.list.dDate}"> </td>
		</tr>
		<tr>
			<td>프로젝트 설명 </td>
			<td> <textarea rows="6" cols="50" name="description">${requestScope.list.description}</textarea> </td>
			<%-- <td><input type="text" name="description" value="${requestScope.list.description}"> </td> --%>
		</tr>
		<tr>
			<td colspan="2" align="center"> 
				<input type="button" value="업데이트" onclick="updatePro()">
				<input type="button" value="삭제" onclick="location.href='proDelete.do?code=${requestScope.list.proCode}'">
			</td> 
		</tr>
		
	</table>
	</form>
	<script type="text/javascript">
		function updatePro(){
			document.getElementById("detailForm").submit();
		}
	</script>
</body>
</html>