<%@ page import="warmStar.User" %>

<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 26.12.2017
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Office</title>
    <link type="text/css" rel="stylesheet" href="css/fonts.css"/>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>

    <p>1</p>
    <p>1</p>
    <p>1</p>
    <p>1</p>

    <h1>Добро пожаловать ${sessionScope.user.firstName} в личный кабинет </h1>

    <p><a href="${pageContext.request.contextPath}/youroffice/basket">Корзина</a> ${sessionScope.productBasket.length}</p>
    <p><a href="${pageContext.request.contextPath}/help">Помощь</a></p>
    <c:forEach items="${requestScope.user}" var="emp">
        <tr><td><c:out value="${emp.id}"></c:out></td>
            <td><c:out value="${emp.nickName}"></c:out></td>
            <td><c:out value="${emp.firstName}"></c:out></td>
            <td><c:out value="${emp.lastName}"></c:out></td>
            <td><c:out value="${emp.email}"></c:out></td>
            <td><c:out value="${emp.phoneNamber}"></c:out></td>
        <td><c:out value="${emp.data}"></c:out></td>
        <td><c:out value="${emp.password}"></c:out></td>
        <td><c:out value="${emp.passwordTwo}"></c:out></td></tr>
    </c:forEach>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
