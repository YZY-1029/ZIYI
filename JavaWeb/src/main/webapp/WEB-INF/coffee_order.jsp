<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<fieldset>
				<legend>Coffee Order</legend>
				咖啡:${ coffeeOrder.type }<br />
				容量:${ coffeeOrder.size }<br />
				含糖:${ coffeeOrder.sugar }<br />
				價格:${ coffeeOrder.info }<br />
			</fieldset>
		</div>
	</body>
</html>