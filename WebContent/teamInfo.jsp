<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="teamUpdate.do" name="formtag" id="formtag" method="post">
	  <table width="600" border="1" cellspacing="0" cellpadding="3" align="center" >
	    <tr>
	    	<th colspan="2" height="39" align="center" > ���� ���� </th>
	    </tr>
	    <tr>
	       <td>�Ҽ� ������Ʈ �ڵ�</td>
	       <td><input type="text" id="proCode" name="proCode" size="70" value="${requestScope.teamInfo.proCode }"></td>
	    </tr>
	    <tr>
	      <td width="120"> ���̵� </td>
	      <td width="400">
	        <input type="text" id="id" name="id" value="${requestScope.teamInfo.id }">
	      </td>
	    </tr>
	    <tr>
	      <td width="120">�̸�</td>
	      <td width="400">
	        <input type="text" id="name" name="name" value="${requestScope.teamInfo.name }">
	      </td>
	    </tr>
	    <tr>
	       <td>�ּ�</td>
	       <td><input type="text" id="addr" name="addr" size="70" value="${requestScope.teamInfo.addr }"></td>
	    </tr>
	    <tr>
	    	<td colspan="2" align="center">
				<input type="submit" value="����">
				<input type="button" value="Ż��" onclick="location.href='deleteTeam.do'">
			</td>
		</tr>    
	  </table>
	</form>
</body>
</html>