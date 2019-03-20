<%@page import="pl.brenna.model.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% Book book = (Book)request.getAttribute("book"); %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Wynik operacji</title>
</head>
<body>
	<h1>Wynik zapytania <%= request.getAttribute("option") %></h1>
	<p>W wyniku Twojego zapytania otrzymano następujacy wynik:</p>
	<p>Tytuł: <%= book.getTitle() %><br>
	ISBN: <%= book.getIsbn() %><br>
	Opis: <%= book.getDescription() %></p>
</body>
</html>