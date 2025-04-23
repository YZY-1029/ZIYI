<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>留言板</title>
		<link rel="stylesheet" > <!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" -->
	</head>
	<body>
		<h1>留言板</h1>
		<form class="pure-for, pure-form-stacked" method="POST" action="/JavaWeb/guestbook">> 
		<fieldset>
			<legend>留言區</legend>		
			<label>輸入留言</label>
					<input name="message"  required />
			${message}<br>
			${guestbooks}<br>
		
		
		
		
		</fieldset>
	</body>
</html>