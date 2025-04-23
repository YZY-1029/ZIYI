<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>咖啡牛奶分配機</h1>
		<form class="pure-form, pure-form-stacked" method="post" action="/JavaWeb/coffeemilk">>
		<fieldset>
			<legend>coffee vs milk (ml)</legend>
			<label>請輸入牛奶毫升數(ml):</label>
					<input name = "milk" type="number" min="1" max="999" required />
			<label>請輸入咖啡毫升數(ml):</label>
					<input name = "coffee" type="number" min="1" max="999" required />
		<button type="submit" class="pure-buttom pure-buttom-primary">送出</button>
		</fieldset>
	</body>
</html>