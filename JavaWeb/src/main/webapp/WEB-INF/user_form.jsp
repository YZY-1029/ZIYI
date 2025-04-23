<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" > <!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" -->
	</head>
	<body>
		<div>
			<h2>使用者資料表單</h2>>
			<form class="pure-for, pure-form-stacked" method="post" action="/JavaWeb/user">>  <!-- 告訴他說用送出之後會連結到http://localhost:8080/JavaWeb/user的dopost -->
				<fieldset>
					<legend>User Form</legend>
					<label>姓名:</label>
					<input name = "userName" type="text" required />
					
					<label>姓名:</label>
					<label class="pure-radio">
						<input name="gender" type="radio" value="male" checked>&nbsp;男 <!-- nbsp是一個空白的意思 -->
					</label>
					<label class="pure-radio">
						<input name="gender" type="radio" value="female">&nbsp;女
					</label>
					
					<label>年齡:</label>
					<input name="age" type="number" min="1" max="150" required />
					
					<label>身高(cm):</label>
					<input name="height" type="number" min="1" max="300" step="0.1" required />
					
					<label>體重(kg):</label>
					<input name="weight" type="number" min="0.1" max="1000" step="0.1" required />
					
					<button type="submit" class="pure-buttom pure-buttom-primary">送出</button>
				</fieldset>				
				
			</form>
		</div>
	</body>
</html>