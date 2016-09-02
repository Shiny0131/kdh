<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>회원정보 수정</title>
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css" />
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css" />
		<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine">
		<link rel="stylesheet" href="css/layouts/blog.css" />
		<script type="text/javascript">
			function updateMember(){
				document.updateForm.submit();
			}
		</script>
	</head>
	<body>
		<div id="layout" class="pure-g">
			<jsp:include page="/menu.jsp" />
			<div class="content pure-u-1 pure-u-md-3-4">
				<div>
					<div class="posts">
						<h1 class="content-subhead">Update</h1>
						<form action="updateMember.do" method="POST" id="updateForm" name="updateForm">						
							<p><span>아이디</span>&nbsp;${sessionScope.loginSession.userId}</p>
							<p><span>&nbsp;&nbsp;이름&nbsp;</span>&nbsp;<input type="text" id="name" name="name" value="${sessionScope.loginSession.name }" required="required" /></p>
							<p><input type="button" class="button" value="저장" onclick="updateMember()"/></p>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>