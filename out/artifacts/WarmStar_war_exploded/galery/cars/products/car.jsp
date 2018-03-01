<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 26.01.2018
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Car</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/galleryProduct.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <h2 class="inform">Model: ${car.model} ${car.smodel}   Color: ${car.color}    Type: ${car.type}    Cost: ${car.price}</h2>
    <div class="main">
        <%--<h2 class="inform">Model: ${car.model} ${car.smodel}   Color: ${car.color}    Type: ${car.type}    Cost: ${car.price}</h2>--%>
        <%--<div>${car.model}</div>--%>
        <%--<div>${car.smodel}</div>--%>
        <%--<div>${car.color}</div>--%>
        <%--<div>${car.price}</div>--%>
        <%--<div>${car.type}</div>--%>
        <%--<div>${car.quantity}</div>--%>
        <div class="product"><img class="img" src="${pageContext.request.contextPath}/${car.path1}"/></div>
        <div class="product"><img class="img" src="${pageContext.request.contextPath}/${car.path2}"/></div>
        <div class="product"><img class="img" src="${pageContext.request.contextPath}/${car.path3}"/></div>
    </div>
    <a href="${pageContext.request.contextPath}/buy?id=${car.id}&model=${car.model}&smodel=${car.smodel}&type=car">Buy</a>

<%@include file="../../../footer/footer.jsp"%>
</body>
</html>
