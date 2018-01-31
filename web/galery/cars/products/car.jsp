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
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/gallery.css"/>
    <title>Title</title>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <div>${car.model}</div>
    <div>${car.smodel}</div>
    <div>${car.color}</div>
    <div>${car.price}</div>
    <div>${car.type}</div>
    <div>${car.quantity}</div>
    <div>${car.path1}</div>
    <div>${car.path2}</div>
    <div>${car.path3}</div>

    <a href="${pageContext.request.contextPath}/buy?id=${bike.id}&model=${bike.model}&smodel=${bike.smodel}&type=car">Купить</a>

<%@include file="../../../footer/footer.jsp"%>
</body>
</html>
