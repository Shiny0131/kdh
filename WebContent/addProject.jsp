<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center"> ������Ʈ ��� </h3>
	
	<form action="addProject.do" method="post">
	<table border="1" align="center">
		<tr>
			<td> ��ȣ </td>
			<td> <input type="text" name="proCode"> </td>
		</tr>
		<tr>
			<td> �̸� </td>
			<td> <input type="text" name="proName"> </td>
		</tr>
		<tr>
			<td> �ο� </td>
			<td> <input type="text" name="proNumber"> </td>
		</tr>
		<tr>
			<td> ������ </td>
			<td> <input type="text" name="sDate1" size="2">/<input type="text" name="sDate2" size="2">/<input type="text" name="sDate3" size="2"> </td>
		</tr>
		<tr>
			<td> ������ </td>
			<td> <input type="text" name="dDate1" size="2">/<input type="text" name="dDate2" size="2">/<input type="text" name="dDate3" size="2"> </td>
		</tr>
		<tr>
			<td> ������Ʈ���� </td>
			<td> <input type="text" name="description"> </td>
		</tr>
		<tr>
			<td colspan="2" align="center"> 
				<input type="submit" value="����ϱ�">
				<input type="reset" value="���"> 
			</td>
		</tr>
	</table>
	</form>
</body>
</html>