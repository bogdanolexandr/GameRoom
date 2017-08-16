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
	<div align="center" style="padding-top: 150px;">
		<form action="room">
			<c:forEach items="${gender}" var="item">
				<label>${item}</label>
				<input type="radio" name="gender" value="${item}" checked="checked" />
			</c:forEach>
			<br>
			<br> <label>price:</label> <input type="text" name="price"
				style="width: 40px;"> <input type="submit" value="find">
		</form>
	</div>
</body>
</html>