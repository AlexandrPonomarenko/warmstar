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
    <title>Office</title>
    <link type="text/css" rel="stylesheet" href="css/fonts.css"/>
</head>
<body>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>

    <h1>WELCOME </h1>
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
