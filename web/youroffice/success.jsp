<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 01.02.2018
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta content="text/html" charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/success.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <title>Success</title>
</head>
<body>
    <p>Thank you for your purchase${sessionScope.user.firstName}</p>
    <p><a href="${pageContext.request.contextPath}/warmStar">Main page</a></p>
</body>
</html>
