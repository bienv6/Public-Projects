<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html" isELIgnored="false" pageEncoding="UTF-8"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Food Cart Home</title>
</head>
<body>
<c:out value="${2==2 }"></c:out>

<c:forEach var="a" items="${foodItems}">
   <p>${a}</p>
   </c:forEach>
</body>
</html>