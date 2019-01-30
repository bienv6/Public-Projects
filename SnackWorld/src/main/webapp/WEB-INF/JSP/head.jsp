<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>
<%@ page import="org.springframework.web.servlet.ModelAndView"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>${param.title}</title>
<link rel ="icon"       href='<c:url value="/images/snack.png"/>'    type="image/png">
<link rel ="stylesheet" href='<c:url value="/css/SnackWorld.css"/>'  type="text/css">
<meta name="viewport"   content="width=device-width, initial-scale=1">
</head>