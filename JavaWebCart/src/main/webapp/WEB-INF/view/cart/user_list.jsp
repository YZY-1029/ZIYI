<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>使用者列表</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
	</head>
	<body>
		<!-- menu bar -->
		<%@ include file="/WEB-INF/view/cart/menu.jsp"  %>
		<!-- content -->
		<div style="padding: 15px" class="pure-form">
			<fieldset>
				<legend>使用者列表</legend>
				<table class="pure-table">
					<thead>
						<tr>
							<th>序號</th><th>帳號</th><th>Email</th><th>Email 驗證</th>	
						</tr>
					</thead>
					<tbody>
						<!-- 使用者列表紀錄 -->
						<c:forEach var="userDTO" items="${userDTOs}">
						<tr>
							<td>${userDTO.id}</td>
							<td>${userDTO.username}</td>
							<td>${userDTO.email}</td>
							<td>${userDTO.completed}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</fieldset>
		</div>
	</body>
</html>