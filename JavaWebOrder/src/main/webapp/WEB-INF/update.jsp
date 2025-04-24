<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<link rel="stylesheet" href="/JavaWebOrder/css/buttons.css">
	</head>
	<body style="padding: 20px">
		
		<form class="pure-form" method="post" action="/JavaWebOrder/order/update">
			<fieldset>
				<legend>修改訂單</legend>
				index:
				<input type="number" name="index" value="${ index }"readonly /><p />
				品名
				<select name="item">
					<option value="牛肉麵">牛肉麵-150元</option>
					<option value="陽春麵">陽春麵-60元</option>
					<option value="番茄麵">番茄麵-100元</option>
					<option value="義大利麵">義大利麵-120元</option>
					<option value="炒泡麵">炒泡麵-90元</option>
				</select>
				<p />
				<button type="submit" class="button-success pure-button">修改訂單</button>
			</fieldset>
		</form>	
	</body>
</html>