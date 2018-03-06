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
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsLibrary/jquery-3.3.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/validate.js"></script>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <p>${error}</p>

    <h2 id="hat">${sessionScope.firstname} Your Chose</h2>
    <ul class="styleNone">
        <li><p class="m">Model: ${product.model}</p></li>
        <li><p class="m">Type model: ${product.smodel}</p></li>
        <li><p class="m">Color: ${product.color}</p></li>
        <li><p class="m">Cost: ${product.price}</p></li>
        <li><p class="m">Type bike: ${product.type}</p></li>
    </ul>

    <form method="post" action="buy" >

        <div class="inside">
            <label for="city">City</label>
            <input type="text" name="city" id="city" class="validate"/>

            <span class="empty-message">Empty</span>
            <span class="small-length-message">Small length</span>
            <span class="bad-words-message">Bad words</span>
        </div>

        <div class="inside">
            <label for="address">Address</label>
            <input type="text" name="address" id="address" class="validate"/>

            <span class="empty-message">Empty</span>
            <span class="small-length-message">Small length</span>
            <span class="bad-words-message">Bad words</span>
        </div>

        <p>
            <button class="submit-button" type="submit" disabled>Checkout</button>
        </p>
    </form>
    
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
