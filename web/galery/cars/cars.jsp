<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 25.01.2018
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/gallery.css"/>
    <title>Title</title>
    <jsp:include page="../../headers/head.jsp"/>
</head>
<body>
<div class="gallery_bikes">
    <c:forEach items="${requestScope.allcars}" var="car">
        <figure>
            <a href="${pageContext.request.contextPath}/galery/bikes/products/car?id=${car.id}&model=${car.model}&smodel=${car.smodel}">
                <img src="${pageContext.request.contextPath}/${car.path1}">
            </a>
            <figcation>
                <p>${car.model} ${car.smodel}</p>
                <p>${car.price}</p>
            </figcation>
        </figure>
    </c:forEach>
</div>
<%@include file="../../footer/footer.jsp"%>
</body>
</html>
