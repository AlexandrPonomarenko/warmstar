<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 12.01.2018
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="css/header.css"/>
</head>
<body>
<header>
    <div id="nav-curtain"></div>
    <div class="nav-content">
        <a class="logo" href="index.jsp" ><img src="images/star-electronics-120x120.png"></a>
        <nav id="nav">
            <ul>
                <li><a href="#">Регистрация</a></li>
                <li><a href="#">О Нас</a></li>
                <li><a href="#">Товар</a></li>
                <li><a href="LogIn.jsp">LogIn</a></li>
                <li><a href="${pageContext.request.contextPath}/logOn">LogOn</a></li>
            </ul>
        </nav>
        <%--<a class="garage" href="#"><img src="images/garage.png" width="32" height="26"></a>--%>
        <%--<c:if test="${ sessionScope.user != null}">--%>
            <%--<a class="garage" href="${pageContext.request.contextPath}/yourOffice"><span class="icon-home"></span></a>--%>
        <%--</c:if >--%>
        <%--<c:if test="${ sessionScope.user == null}">--%>
            <%--<a class="garage" href="${pageContext.request.contextPath}/logOn"><span class="icon-home"></span></a>--%>
        <%--</c:if >--%>

        <a class="garage" href="${pageContext.request.contextPath}/yourOffice"><span class="icon-home"></span></a>
    </div>
</header>
</body>
</html>
