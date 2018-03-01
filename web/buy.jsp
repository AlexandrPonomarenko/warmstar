<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 29.01.2018
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Buy</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/buy.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <p>${error}</p>

    <p>${sessionScope.firstname} Your Chose</p>
    <div>${product.model}</div>
    <div>${product.smodel}</div>
    <div>${product.color}</div>
    <div>${product.price}</div>
    <div>${product.type}</div>
    <div>${product.quantity}</div>
    <div>${product.path1}</div>
    <div>${product.path2}</div>
    <div>${product.path3}</div>

<form method="post" action="buy" >

    <p>
        <label for="city">City</label>
        <input type="text" name="city" id="city">
    </p>

    <p>
        <label for="address">Address</label>
        <input type="text" name="address" id="address">
    </p>

    <p>
        <button type="submit">Checkout</button>
    </p>
</form>
    
<jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
