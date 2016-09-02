<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>회원가입</title>
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css" />
		<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css" />
		<link rel="stylesheet" href="css/layouts/blog.css" />
		<script src="//code.jquery.com/jquery-1.7.1.min.js"></script>
		<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
		<script type="text/javascript">
			function checkId(userId){
				var userId = document.getElementById("userId").value;
				$.ajax({
					url:"checkId.do",
					method: "GET",
					contentType: "application/json",
					data: "userId="+document.getElementById("userId").value,
					dataType: "json",
					success: function(data){
						if(data != "[object Object]" ) {	//null일때
							$("#userId").attr("readonly", true);
							document.getElementById("noComment").style.display = "none";	
							document.getElementById("comment").style.display = "block";
						}else{
							document.getElementById("comment").style.display = "none";
							document.getElementById("noComment").style.display = "block";	
							$("#userId").focus();
						}
					}
				});
			}
			function join(){
				if(document.getElementById("pw").value != "" && document.getElementById("name").value != ""){
					document.joinForm.submit();
				}else{
					alert("비어있는 항목이 있습니다.");
					return;
				}
			}
		</script>
	</head>
	<body>
		<div id="layout" class="pure-g">
			<jsp:include page="/menu.jsp" />
			<div class="content pure-u-1 pure-u-md-3-4">
				<div>
					<div class="posts">
						<h1 class="content-subhead">JOIN</h1>
						<form action="insertMember.do" method="post" id="joinForm" name="joinForm">
							<p>
								<span>아이디</span><input type="text" id="userId" name="userId" />
								<span><input type="button" value="중복체크" onclick="checkId('userId')" class =" button"/></span>
								<span id = "comment" style="display: none">사용할 수 있습니다.</span>
								<span id = "noComment" style="display: none">사용할 수 없습니다.</span>
							</p>
							<p><span>비밀번호</span><input type="password" id="pw" name="pw" /></p>
							<p><span>이름</span><input type="text" id="name" name="name" /></p>
							<p><span><input type="button" value="가입하기" onclick="join()" class =" button" /></span></p>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>