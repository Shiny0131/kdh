<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>bBoardUpdate PAGE</title>
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css" />
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css" />
		<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine">
		<link rel="stylesheet" href="css/layouts/blog.css" />
		<script type="text/javascript">
			function update(){
				document.getElementById("updateForm").submit();
				alert("수정 완료!");
			}
		</script>
	</head>
	<body>
		<div id="layout" class="pure-g">
			<jsp:include page="/menu.jsp" />
		    <div class="content pure-u-1 pure-u-md-3-4">
		        <div>
		            <!-- A wrapper for all the blog posts -->
		            <div class="posts">
		            	<form action="updateB.do" method="post" id="updateForm">
		            		<input type="hidden" name="bNo" id="bNo" value="${requestScope.updateResult.bNo}"/>
		            		<input type="hidden" name="bUserId" id="bUserId" value="${requestScope.updateResult.bUserId}"/>
		            		<table>
		            			<tr>
		            				<th>글번호</th>
		            				<th>제목</th>
		            				<th>내용</th>
		            				<th>작성자</th>
		            				<th>이미지</th>
		            				<th>작성일</th>
		            				<th>비밀 ;)</th>
		            			</tr>
	            				<tr>
	            					<td><c:out value="${requestScope.updateResult.bNo}" /></td>
	            					<td><input type="text" name="bTitle" id="bTitle" value="${requestScope.updateResult.bTitle}"/></td>
	            					<td><textarea id="aBody" name="bBody">${requestScope.updateResult.bBody}</textarea></td>
	            					<td><c:out value="${requestScope.updateResult.bUserId}" /></td>
	            					<td><input type="text" name="bFilePath" id="bFilePath" value="${requestScope.updateResult.bFilePath}" /></td>
	            					<td><c:out value="${requestScope.updateResult.bDate}" /></td>
	            					<td><input type="checkbox" name="bSecret" id="bSecret" value="${requestScope.updateResult.bSecret}"/></td>
	            				</tr>
		            		</table>
		            	</form>
	            		<div class ="buttons">
	            			<p>
	            				<input type="button"  class="button" value="수정" onclick="update()"/>
	            			</p>
	            		</div>
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