<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>bBoardDetail PAGE</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css" />
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css" />
		<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine">
		<link rel="stylesheet" href="css/layouts/blog.css" />
		<script type="text/javascript">
			$(document).on("click", "#goUpdate", function(){
				$("#goUpdateForm").submit();	
			});
			$(document).on("click", "#goList", function(){
				history.back();
			});
			$(document).on("click", "#delete", function(){
				if(confirm("삭제하시겠습니까?") == true) {
					$("#goUpdateForm").attr({action: "deleteB.do"});	
					$("#goUpdateForm").submit();	
				}
			});
		</script>
	</head>
	<body>
		<div id="layout" class="pure-g">
			<jsp:include page="/menu.jsp" />
		    <div class="content pure-u-1 pure-u-md-3-4">
		        <div>
		            <div class="posts">
		            	<form action="goUpdateB.do" method="post" id="goUpdateForm">
		            		<table>
		            			<tr>
		            				<th width="55px">No.</th>
	            					<td width="60px"><input type="hidden" name="bNo" id="bNo" value="${requestScope.result.bNo }"/>${requestScope.result.bNo}</td>
		            				<th width="55px">작성자</th>
	            					<td width="70px">${requestScope.result.bUserId}</td>
		            				<th width="55px">작성일</th>
	            					<td>${requestScope.result.bDate}</td>
		            				<th width="55px">조회수</th>
	            					<td width="55px">${requestScope.result.bCount}</td>
	            				</tr>
	            				<tr>
		            				<th width="55px">제목</th>
	            					<td colspan="7">${requestScope.result.bTitle}</td>
	            				</tr>
		            			<tr>
		            				<th width="55px">사진</th>
	            					<td colspan="7"><img src="image/${requestScope.result.bFilePath}" style="max-width: 100%; height: auto;"/></td>	            					
		            			</tr>
	            				<tr>
		            				<th width="55px">내용</th>
	            					<td colspan="7"><textarea rows="20" cols="98" readonly="readonly" style="border: 0;">${requestScope.result.bBody}</textarea></td>
		            			</tr>
		            		</table>
	            		</form>
	            		<div class ="buttons">
	            			<p>
			            		<c:if test="${sessionScope.loginSession.userId.equals('admin') }">
		            				<input type="button" id="goUpdate" class="button" value="수정"/>
		            				<input type="button" id="delete" class="button" value="삭제"/>
			            		</c:if>
    	        				<input type="button" id="goList" class="button" value="목록"/>
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