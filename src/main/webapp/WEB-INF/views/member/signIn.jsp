<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>기술블로그 - oh29oh29</title>
<link href="./css/member/signIn.css" rel="stylesheet">
</head>
<body>
	<button id="naverLoginBtn" class="login_btn naver_login_btn"></button>

<script src="./import/jQuery/jquery-3.2.1.min.js"></script>
<script>
	window.onload = function() {
		
		$.ajax({
			url : "getLoginAPIWithNaver",
			success : function(response) {
				document.getElementById('naverLoginBtn').addEventListener('click', function() {
					location.href = response;
				});
			}
		});
	};
</script>
</body>
</html>
