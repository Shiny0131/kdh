<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>팀원 등록 페이지</title>
</head>
<body>
<form action="addTeam.do" name="formtag" id="formtag" method="post">
  <table width="600" border="1" cellspacing="0" cellpadding="3" align="center" >
    <tr>
    	<th colspan="2" height="39" align="center" > 회원가입 </th>
    </tr>
    <tr>
      <td width="150"> 프로젝트번호 </td> 
      <td width="400"> 
      	<input type="text" id="proCode" name="proCode" onblur="sendRequest()"> 
      </td>
    </tr>
    <tr>
      <td width="150"> 아이디 </td>
      <td width="400"> <input type="text" id="id" name="id" onblur="sendRequestId()"> </td>
    </tr>
    <tr>
      <td width="150"> 비밀번호</td>
      <td width="400" >
        <input type="password" id="passwd" name="pw" >
      </td>
    <tr> 
      <td width="150">비밀번호 확인</td>
      <td width="400">
        <input type="password" id="passwd2" onblur="checkPw()">
        <input type="hidden" id="confirm">
      </td>
    </tr> 
    <tr>
      <td width="150">이름</td>
      <td width="400">
        <input type="text" id="name" name="name">
      </td>
    </tr>
    <tr>
       <td>주소</td>
       <td><input type="text" id="address" name="addr" size="70"></td>
    </tr>
    <tr>
      <td colspan="2" align="center" >
          <input type="button" id=confirm name="confirm" value="등   록"  onclick="sub()">
          <input type="reset" name="reset" value="다시입력">
      </td>
    </tr>
  </table>
</form>
<script type="text/javascript">

	function checkPw(){
		if(document.getElementById("passwd").value != document.getElementById("passwd2").value){
			alert("비밀번호가 일치하지 않습니다");
		} 
	}
	function sub(){
		document.getElementById("formtag").submit();
	}
	var httpRequest = null;
    
    function getXMLHttpRequest() {
		if (window.ActiveXObject) {
			try {
				return new ActiveXObject("Msxml2.XMLHTTP");
			} catch(e) {
				try {
					return new ActiveXObject("Microsoft.XMLHTTP");
				} catch(e1) { 
					return null; 
				}
			}
		} else if (window.XMLHttpRequest) {
			return new XMLHttpRequest();
		} else {
			return null;
		}
	}
    function sendRequestId() { 	
 		var data = document.getElementById("id").value;
 		if(data != ""){
	 		httpRequest = getXMLHttpRequest();		
			httpRequest.onreadystatechange = viewTable;
			httpRequest.open("GET", "checkId.do?id="+data, true);
			httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded'); 		
			httpRequest.send(null);
 		}
    }
	
 	function sendRequest() { 	
 		var data = document.getElementById("proCode").value;
 		httpRequest = getXMLHttpRequest();		
		httpRequest.onreadystatechange = viewTable;
		httpRequest.open("GET", "dupProject.do?proCode="+data, true);
		httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded'); 		
		httpRequest.send(null);		
    }
 	
 	function viewTable(){
        if(httpRequest.readyState == 4){   
            if(httpRequest.status == 200){ 
                 alert(httpRequest.responseText); 
            }
        }
      }
 	
</script>
</body>
</html>