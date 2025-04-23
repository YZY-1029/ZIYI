<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet">
	</head>
	<body>
		<div class="pure-form">
			<h2>使用者資料結果</h2>
			<fieldset>
				<legend>User Result</legend>
				類型: ${user.userName}<p />
				性別: ${user.gender}<p />
				年齡: ${user.age}<p />
				
				<a herf="/JavaWeb/coffee" class="pure-buttom pure-buttom-primary">返回</a>
			
			</fieldset>
		</div>
	</body>
</html>