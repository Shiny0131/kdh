<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ������ �Դϴ�.</title>
</head>
<body>

	<div id="wrap" style="width: 800px; margin: auto;">
		<div id="header" style="height: 50px">
			<h2 align="center"> ������Ʈ ���� ������ </h2>
		</div>
		
		<div id="header_login" align="right">
			<br>
			<c:if test="${empty sessionScope.loginSession}">
				<a href="index.jsp?content=login.html">�α���</a>/
				<a href="index.jsp?content=addTeam.jsp">ȸ������</a>
			</c:if>
			<c:if test="${not empty sessionScope.loginSession}">
				<a href="logout.do">�α׾ƿ�</a>		
			</c:if>
		</div>
		<hr size="2">
		
		<div id="main_menu" style="margin-top: 10px; width : 130px; height: 600px; float:left;" >
			<c:if test="${empty sessionScope.loginSession}">
				�α����� �ϼž� ����ϽǼ� �ֽ��ϴ�.
			</c:if>
			<c:if test="${not empty sessionScope.loginSession}">
				<jsp:include page="left_menu.jsp" /> 
			</c:if>
		</div>
			
		<div id="main" style="margin-top: 10px; height: 600px">
			<p align="center">  
				<c:if test="${not empty param.content}"> 
					<jsp:include page="${param.content}" /> 
				</c:if>
				<c:if test="${empty param.content}"> 
					<jsp:include page="${requestScope.content}" /> 
				</c:if>
			</p> 
		</div>

		<div id="footer"	style="height: 50px; margin-top: 10px">
			<hr size="2">
			<p align="right">UCAMP19A015_��ȣ��</p>
		</div>

	</div>
</body>
</html>