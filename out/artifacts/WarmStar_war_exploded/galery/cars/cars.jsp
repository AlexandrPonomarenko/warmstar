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
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsLibrary/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ajaxQjueryCar.js"></script>
    <title>Gallery Cars</title>
    <jsp:include page="../../headers/head.jsp"/>
</head>
<body>
<p>1</p>
<p>2</p>
<p>3</p>
<p>4</p>
<div class="gallery_bikes">
    <c:forEach items="${requestScope.allcars}" var="car">
        <figure>
            <a href="${pageContext.request.contextPath}/galery/bikes/products/car?id=${car.id}&model=${car.model}&smodel=${car.smodel}">
                <img src="${pageContext.request.contextPath}/${car.path1}">
            </a>
            <figcation>
                <p>${car.model} ${car.smodel}</p>
                <p>${car.price}</p>
                <p>${car.color}</p>
            </figcation>
            <span id="${car.id}"></span>
        </figure>

        <form product="${car.id}">
            <input type="hidden" name="model" value="${car.model}"/>
            <input type="hidden" name="smodel" value="${car.smodel}"/>
            <input type="hidden" name="idproduct" value="${car.id}"/>
            <input type="hidden" name="cost" value="${car.price}"/>
            <input type="hidden" name="type" value="car"/>
        </form>
        <button product="${car.id}" type="button" class="btn_add">Добавить в корзину</button>
    </c:forEach>
</div>
<%@include file="../../footer/footer.jsp"%>
</body>
</html>
