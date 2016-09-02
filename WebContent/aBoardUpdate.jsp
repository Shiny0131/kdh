<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>aBoardUpdate PAGE</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css" />
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css" />
		<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine">
		<link rel="stylesheet" href="css/layouts/blog.css" />
		<script type="text/javascript">
			$(document).on("click", "#update", function(){
				$("#updateForm").submit();
			});
			$(document).on("click", "#goBack", function(){
				history.back();
			});
		</script>
	</head>
	<body>
		<div id="layout" class="pure-g">
			<jsp:include page="/menu.jsp" />
		    <div class="content pure-u-1 pure-u-md-3-4">
		        <div>
		            <div class="posts">
		            	<h2>게시글 수정</h2>
		            	<form action="updateA.do" method="post" id="updateForm">
		            		<input type="hidden" name="aNo" id="aNo" value="${requestScope.updateResult.aNo}"/>
		            		<input type="hidden" name="aUserId" id="aUserId" value="${requestScope.updateResult.aUserId}"/>
		            		<table>
	            				<tr>
	            					<th width="55px">No.</th>
	            					<td width="90px">${requestScope.updateResult.aNo}</td>
	            					<th>작성자</th>
	            					<td width="100px">${requestScope.updateResult.aUserId}</td>
	            					<th>비밀글</th>
	            					<c:if test="${requestScope.updateResult.aSecret eq 'Y' }">
		            					<td width="45px"><input type="checkbox" value="Y" name="aSecret" id="aSecret" checked="checked"/></td>
	            					</c:if>
	            					<c:if test="${requestScope.updateResult.aSecret eq 'N' }">
	            						<td width="45px"><input type="checkbox" value="Y" name="aSecret" id="aSecret"/></td>
	            					</c:if>
	            				</tr>
	            				<tr>
	            					<th>제목</th>
	            					<td colspan="5"><input type="text" name="aTitle" id="aTitle" style="width: 806px;" value="${requestScope.updateResult.aTitle}"/></td>
	            				</tr>
	            				<tr>
	            					<th>내용</th>
	            					<td colspan="5"><textarea id="aBody" name="aBody" cols="98" rows="20">${requestScope.updateResult.aBody}</textarea></td>
	            				</tr>
		            		</table>
		            	</form>
	            		<div class ="buttons">
	            			<p>
		            			<input type="button" id="goBack" class="button" value="돌아가기"/>
		            			<input type="button" id="update" class="button" style="float: right;" value="수정"/>
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