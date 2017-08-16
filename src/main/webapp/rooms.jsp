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
		<c:forEach items="${rooms}" var="item">
			<label> room : </label>
			<label>${item.title}</label>
			<br>
			<label> price : </label>
			<label>${item.price}</label>
			<br>
			<a href="roomDetails/${item.id}">choose this room</a>
			<br>
			<table border="2" width="600">
				<tr>
					<th>Title</th>
					<th>Color</th>
					<th>Gender</th>
					<th>Price</th>
					<th>Size</th>
				<tr />
				<tr>
					<c:forEach items="${item.toys}" var="item">
						<tr>
							<td>${item.title}</td>
							<td>${item.color}</td>
							<td>${item.gender}</td>
							<td>${item.price}</td>
							<td>${item.size}</td>
						</tr>
					</c:forEach>
				</tr>
			</table>
			<br>
		</c:forEach>
	</div>
</body>
</html>