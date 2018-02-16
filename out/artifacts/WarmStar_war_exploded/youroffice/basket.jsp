<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 01.02.2018
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>--%>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Basket</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsLibrary/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/deleteFromBasket.js"></script>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
<p>1</p>
<p>1</p>
<p>1</p>
<p>1</p>

    <p>${ziro}</p>

    <div>
        <c:forEach var="i" items="${requestScope.out}">
        <div productform="${i.id}">
            <div name="iduser" value="${i.idUser}">
                <p><c:out value="${i.typeProduct}"></c:out></p>
                <p name="model" value="${i.model}"><c:out value="${i.model}"></c:out></p>
                <p name="smodel" value="${i.smodel}"><c:out value="${i.smodel}"></c:out></p>
                <p id="cost_item"><c:out value="${i.cost}"></c:out></p>
                <p>-----------------------------------------</p>
            </div>
            <button product="${i.id}" type="button" class="btn_delete">Удалить из корзины</button>
        </div>

        <%--<form basket="${i.id}">--%>
            <%--<input type="hidden" name="model" value="${i.model}"/>--%>
            <%--<input type="hidden" name="smodel" value="${i.smodel}"/>--%>
            <%--<input type="hidden" name="iduser" value="${i.idUser}">--%>
        <%--</form>--%>
        <%--<button basket="${i.id}" type="button" class="btn_delete">Удалить из корзины</button>--%>
        </c:forEach>
    </div>

<%--<input type="hidden" name="idproduct" value="${i.idProduct}"/>--%>
<%--<input type="hidden" name="type" value="${i.typeProduct}"/>--%>
<form method="POST" action="${pageContext.request.contextPath}/youroffice/basket">

    <p>
        <label for="city">Город</label>
        <input type="text" name="city" id="city">
        <c:out value="${requestScope.errorOrder['city']}"/>
    </p>

    <p>
        <label for="address">Адресс</label>
        <input type="text" name="address" id="address">
        <c:out value="${requestScope.errorOrder['address']}"/>

    </p>
    <%--<input type="hidden" name="buy" value="allBuy"/>--%>
    <p>Общая стоимость: <span id="cost">${cost}</span>$</p>
    <button type="submit">Оформить заказ</button>
</form>

    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
