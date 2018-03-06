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
    <title>Home</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="css/fonts.css"/>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>

    <h1 class="welcome">Welcome ${sessionScope.user.firstName} to the home </h1>
    <div><img id="home" src="${pageContext.request.contextPath}/images/garage-Home.jpg"></div>
    <h3 class="personal">Personal information</h3>
    <c:forEach items="${requestScope.user}" var="emp">

        <ul class="styleNone">
            <li><p class="m"><c:out value="${emp.nickName}"></c:out></p></li>
            <li><p class="m"><c:out value="${emp.firstName}"></c:out></p></li>
            <li><p class="m"><c:out value="${emp.lastName}"></c:out></p></li>
            <li><p class="m"><c:out value="${emp.email}"></c:out></p></li>
            <li><p class="m"><c:out value="${emp.phoneNamber}"></c:out></p></li>
            <li><p><c:out value="${emp.data}"></c:out></p></li>
        </ul>
    </c:forEach>

    <span class="linkOne"><a href="${pageContext.request.contextPath}/youroffice/basket">Basket${sessionScope.productBasket.length}</a></span>
    <span class="linkTwo"><a href="${pageContext.request.contextPath}/help">Help</a></span>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
