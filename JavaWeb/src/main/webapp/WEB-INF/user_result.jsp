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
				姓名: ${user.userName}<p />
				性別: ${user.gender}<p />
				年齡: ${user.age}<p />
				身高(cm): ${user.height}<p />
				體重(kg): ${user.weight}<p />
				BMI值: ${user.bmiValue}<p />
				診斷: ${user.determine}<p />
				<a herf="/JavaWeb/user" class="pure-buttom pure-buttom-primary">返回</a>
			
			</fieldset>
		</div>
	</body>
</html>