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
    <title>Подтверждение заказа</title>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <p>${sessionScope.user.firstName} Ваш заказ:</p>
    <p>Город : ${sessionScope.city}</p>
    <p>Адресс : ${sessionScope.address}</p>

    <div>
        <p><c:out value="${sessionScope.user.firstName}"></c:out></p>
        <c:forEach var="product" items="${sessionScope.productBasket.products}">
            <p><c:out value="${product.typeProduct}"></c:out></p>
            <p><c:out value="${product.model}"></c:out></p>
            <p><c:out value="${product.smodel}"></c:out></p>
            <p><c:out value="${product.cost}"></c:out></p>
            <p>-----------------------------------------</p>
        </c:forEach>
    </div>
    <form method="POST" action="${pageContext.request.contextPath}/youroffice/order">
        <input type="hidden" name="buy" value="allBuy"/>
        <button type="submit">Подтверждение заказа</button>
    </form>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
