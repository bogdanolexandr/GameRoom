<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center" style="padding-top: 100px;">
		<label>Order by :</label>
		<form action="" onclick="submit()">
			<input type="hidden" name="color" value="${color}" /> 
			<input type="hidden" name="roomid" value="${roomid}" /> 
			<label>price:</label>
			<input type="radio" name="orderby" value="price" /> 
			<label>size:</label>
			<input type="radio" name="orderby" value="size" />
		</form>
		<br>
		<table border="2" width="600">
			<tr>
				<th>Title</th>
				<th>Color</th>
				<th>Gender</th>
				<th>Price</th>
				<th>Size</th>
			<tr />
			<c:forEach items="${toys}" var="item">
				<tr>
					<td>${item.title}</td>
					<td>${item.color}</td>
					<td>${item.gender}</td>
					<td>${item.price}</td>
					<td>${item.size}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>