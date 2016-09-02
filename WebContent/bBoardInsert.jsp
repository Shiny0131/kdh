<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>aBoardInsert PAGE</title>
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css" />
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css" />
		<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine">
		<link rel="stylesheet" href="css/layouts/blog.css" />
		<script type="text/javascript">
			function submit(){
				document.getElementById("InsertForm").submit();
			}
		</script>
	</head>
	<body>
		<div id="layout" class="pure-g">
			<jsp:include page="/menu.jsp" />
		    <div class="content pure-u-1 pure-u-md-3-4">
		        <div>
		            <div class="posts">
	            		<form id="InsertForm" method="post" action="insertB.do" enctype="multipart/form-data">
		            		<input type="hidden" id="bUserId" name="bUserId"value="${sessionScope.loginSession.userId }"/>
		            		<table border="1">
		            			<tr>
		            				<th>제목</th>
		            				<td><input type="text" name="bTitle" id="bTitle" placeholder="제목입력"/></td>
		            				<th>비밀글</th>
		            				<td><input type="checkbox" id="bSecret" name="bSecret" checked="checked" value="Y"/></td>
		            			</tr>
		            			<tr>
		            				<th>파일</th>
		            				<td colspan="3"><input type="file" id="bFile" name="bFile"/></td>
		            			</tr>
		            			<tr>
		            				<th>내용</th>
		            				<td colspan="3"><textarea id="bBody" name="bBody"></textarea></td>
		            			</tr>
		            		</table>
		            		<p><input type="button" class="button" value="저장" onclick="submit()"/></p>
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