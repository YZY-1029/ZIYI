<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>冰果店點餐系統</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		
	</head>
	<body style="padding: 20px">
		<div>
			<h2>冰果店點餐技統</h2>
			<form class="pure-form" method="POST" action="/JavaWeb/ice">
				<fieldset>
					<legend>選擇主餐</legend>
					<!-- 單選的 所以後台Servlit使用req.getParamter("mainDish") 會得到String -->
					<input type="radio" name="mainDish" value="剉冰" checked>剉冰(50元)<p />
					<input type="radio" name="mainDish" value="豆花" >豆花(40元)<p />
					
				</fieldset>
				<fieldset>
					<legend>選擇加料每樣10元</legend>
					<!-- 多選的 所以後台Servlit使用req.getParamterValues("toppings") 會得到String[] -->
					<input type="checkbox" name="toppings" value="花生" >花生<p />
					<input type="checkbox" name="toppings" value="綠豆" >綠豆<p />
					<input type="checkbox" name="toppings" value="紅豆" >紅豆<p />
					<input type="checkbox" name="toppings" value="芋頭" >芋頭<p />
					<input type="checkbox" name="toppings" value="粉圓" >粉圓<p />
					<input type="checkbox" name="toppings" value="煉乳" checked>煉乳<p />
				</fieldset>
				<button type="submit" class="pure-button pure-botton-primary">加入購物車</button>
			</form>
		</div>
	</body>
</html>