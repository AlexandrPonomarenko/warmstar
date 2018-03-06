<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 01.02.2018
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Confirmation of an order</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/order.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <h2 class="user">User card</h2>
    <span><p>${sessionScope.user.firstName} your order:  City : ${sessionScope.city}    Address : ${sessionScope.address}</p></span>

    <div class="order">
        <c:forEach var="product" items="${sessionScope.productBasket.products}">
            <div class="inside">
                <p>Type: <c:out value="${product.typeProduct}"></c:out></p>
                <p>Model: <c:out value="${product.model}"></c:out></p>
                <p>Type model: <c:out value="${product.smodel}"></c:out></p>
                <p>Cost: <c:out value="${product.cost}"></c:out></p>
            </div>
        </c:forEach>
    </div>
    <form method="POST" action="${pageContext.request.contextPath}/youroffice/order">
        <input type="hidden" name="buy" value="allBuy"/>
        <button type="submit">Confirm the order</button>
    </form>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
