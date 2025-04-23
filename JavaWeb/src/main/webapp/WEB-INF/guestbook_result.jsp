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
	</head>
	
	<body style = "padding: 20px">
		<div class="pure-form">
			<fieldset>
				<legend>留言區</legend>		
				${message}<br>
				${guestbooks}<br>
				<ol>
					<c:forEach var="gb" items="${ guestbooks }">
						<li> ${ gb.message } ${ gb.data } </li>
					</c:forEach>
				</ol>
				<p />
				<!-- 目前留言比數: ${fn:length(guestbooks)} -->
				<table class="pure-table pure-table-borderes">
					<thead>	
						<tr>
							<th>No</th>
							<th>留言內容</th>
							<th>留言時間</th>			
						</tr>
					</thead>
					<tbody>
						<c:forEach varStatus="i" var="gb" items="${ guestbooks }">
							<tr>
								<td>${ i.index + 1 }</td>
								<td>${ gb.message }</td>
								<td>
									<!-- 格式化時間 -->
									<fmt:formaDate value="${ gb.date }" pattern="yyyy-MM-dd a hh:mm:ss E" />
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<a href="/JavaWeb/guestbook" class="pure-button pure-button-primary">返回</a>
			</fieldset>
		</div>
	</body>
</html>