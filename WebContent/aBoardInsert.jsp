<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>aBoardInsert PAGE</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css" />
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css" />
		<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine">
		<link rel="stylesheet" href="css/layouts/blog.css" />
		<script type="text/javascript">
			$(document).on("click", "#save", function(){
				$("#InsertForm").submit();
			});
		</script>
	</head>
	<body>
		<div id="layout" class="pure-g">
			<jsp:include page="/menu.jsp" />
		    <div class="content pure-u-1 pure-u-md-3-4">
		        <div>
		            <div class="posts">
		            	<form id="InsertForm" method="post" action="insertA.do">
		            		<input type="hidden" id="aUserId" name="aUserId"value="${sessionScope.loginSession.userId }"/>
		            		<table border="1">
		            			<tr>
		            				<th width="55px">작성일</th>
		            				<td><input type="time" readonly="readonly"></td>
		            				<th width="55px">비밀글</th>
		            				<td><input type="checkbox" id="aSecret" name="aSecret" checked="checked" value="Y"/></td>
		            			</tr>
		            			<tr>
		            				<th width="90px">제목</th>
		            				<td colspan="3"><input type="text" name="aTitle" id="aTitle" placeholder="제목입력"/></td>
		            			</tr>
		            			<tr>
		            				<th>내용</th>
		            				<td colspan="3"><textarea rows="20" cols="98" id="aBody" name="aBody" style="border: 0;"></textarea></td>
		            			</tr>
		            		</table>
		            		<p><input type="button" id="save" class="button" value="저장"/></p>
		            	</form>
		            </div>
		            <div class="footer">
		                <div class="pure-menu pure-menu-horizontal pure-menu-open">
		                    <ul>
		                        <li><a href="#">About</a></li>
		                        <li><a href="http://twitter.com/rlatpdbskr">Twitter</a></li>
		                        <li><a href="https://github.com/Shiny0131/MyHome">GitHub</a></li>
		                    </ul>
		                </div>
		            </div>
		        </div>
		    </div>
		</div>
	</body>
</html>
