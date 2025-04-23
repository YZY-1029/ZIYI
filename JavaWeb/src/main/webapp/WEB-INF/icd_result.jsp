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
	</head>
	
	<body style = "padding:20px">
		<div class = "pure-form">
			<h2>冰果店的訂單結果</h2>
			<fieldset>
				<legend>訂單列表</legend>
				<c:set var="totalPriceSum" value="0" />
				<table class="pure-table pure-tacle-bordered">
					<thead>
						<tr>
							<th>no</th>
							<th>主餐</th>
							<th>配料</th>
							<th>價格</th>
							<th>刪除</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach varStatus="i" var="iceOrder" items="${ iceOrders }">
						
							<tr>
								<td>${i.index +1} </td>
								<td>${iceOrder.mainDish.name}</td>
								<td>${iceOrder.topping.toppings}</td>
								<td>
									<fmt:formatNumber value="${iceOrder.totalPrice}" type="currency" maxFractionDigits="0"/>
								</td>
								<td class="del" onclick="deleteiceOrder(${i.index})" title="按我一下刪除" style="cursor:pointer; background:none; border:none; color:red;">
									<form name="box" type="hidden" method="post" action="/JavaWeb/ice" > 
										<input type="hidden" name="_method" value="delete">
										<input name="box" type="hidden" value="${i.index}" ><p />
										<button type="submit" class="pure-button pure-botton-primary">x</button>
									</form>
								</td>
								
							</tr>
							<!-- 累加金額 -->
							<c:set var="totalPriceSum" value="${totalPriceSum + iceOrder.totalPrice}"/>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr style="background-color:#DDDDDD">
							<td colspan="3" style="text-align: right;">總金額</td>
							<td>
								<fmt:formatNumber  value="${ totalPriceSum }" type="currency" maxFractionDigits="0" />
							</td>
						</tr>
					</tfoot>
				</table>
				<a href="/JavaWeb/ice" class="pure-button pure-button-primary">繼續購買</a>
				<button type="submit" class="pure-button pure-botton-primary">結帳</button>
			</fieldset>
		</div>	
	</body>
</html>