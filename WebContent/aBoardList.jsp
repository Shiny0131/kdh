<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>aBoardList PAGE</title>
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css" />
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css" />
		<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine">
		<link rel="stylesheet" href="css/layouts/blog.css" />
		<script type="text/javascript">
			function insert() {
				location.replace("aBoardInsert.jsp");
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
		            	<c:if test="${sessionScope.loginSession.userId.equals('admin')}">
		            		<table>
		            			<tr>
		            				<th>글번호</th>
		            				<th>제목</th>
		            				<th>작성자</th>
		            				<th>작성일</th>
		            				<th>조회수</th>
		            			</tr>
		            			<c:forEach items="${requestScope.aBoard}"  var="result">
		            				<tr>
		            					<td><c:out value="${result.aNo}" /></td>
		            					<td><a href="aDetail.do?aNo=${result.aNo}"><c:out value="${result.aTitle}" /></a></td>
		            					<td><c:out value="${result.aUserId}" /></td>
		            					<td><c:out value="${result.aDate}" /></td>
		            					<td><c:out value="${result.aCount}" /></td>
		            				</tr>
		            			</c:forEach>
		            		</table>
		            		<div class = "buttons">
		            			<p>
		            				<input type="button" class = "button" value="등록" onclick="insert()"/>
		            			</p>
		            		</div>
		            	</c:if>
		            	<c:if test="${!sessionScope.loginSession.userId.equals('admin')}">
		            		<table>
		            			<tr>
		            				<th>글번호</th>
		            				<th>제목</th>
		            				<th>작성자</th>
		            				<th>작성일</th>
		            				<th>조회수</th>
		            			</tr>
		            			<c:forEach items="${requestScope.aBoard}"  var="result">
		            				<c:if test="${result.aSecret.equals('N') }">
			            				<tr>
			            					<td><c:out value="${result.aNo}" /></td>
			            					<td><a href="aDetail.do?aNo=${result.aNo}"><c:out value="${result.aTitle}" /></a></td>
			            					<td><c:out value="${result.aUserId}" /></td>
			            					<td><c:out value="${result.aDate}" /></td>
			            					<td><c:out value="${result.aCount}" /></td>
			            				</tr>
			            			</c:if>
		            			</c:forEach>
		            		</table>
		            	</c:if>
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