<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>今彩 539 電腦選號</h1>>
		<h2>
		<%= request.getAttribute("box") %>    <!--拿到的是Object,可能要轉型,只能做J處理,取不到值會回傳null容易報錯 -->
		${ requestScope.box }                 <!--自動處理轉型，直接輸出,比較簡潔,沒有報錯,取不到會輸出空字串  -->
		</h2>>
		
	</body>
</html>