<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 26.01.2018
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Bike</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/galleryProduct.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <%--<title>Bike</title>--%>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <h2 class="inform">Model: ${bike.model} ${bike.smodel}   Color: ${bike.color}    Type: ${bike.type}    Cost: ${bike.price}</h2>
    <div class="main">
    <%--<div>${bike.model}</div>--%>
    <%--<div>${bike.smodel}</div>--%>
    <%--<div>${bike.color}</div>--%>
    <%--<div>${bike.price}</div>--%>
    <%--<div>${bike.type}</div>--%>
    <%--<div>${bike.quantity}</div>--%>
        <div class="product"><img class="img" src="${pageContext.request.contextPath}/${bike.path1}"></div>
        <div class="product"><img class="img" src="${pageContext.request.contextPath}/${bike.path2}"></div>
        <div class="product"><img class="img" src="${pageContext.request.contextPath}/${bike.path3}"></div>
    </div>
    <a href="${pageContext.request.contextPath}/buy?id=${bike.id}&model=${bike.model}&smodel=${bike.smodel}&type=bike">Buy</a>

<%@include file="../../../footer/footer.jsp"%>
<%--<jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp" flush="">--%>
</body>
</html>
