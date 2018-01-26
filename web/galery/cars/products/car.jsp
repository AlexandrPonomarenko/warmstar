<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 26.01.2018
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/gallery.css"/>
    <title>Title</title>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
<div>r${car.model}</div>
<div>r${car.smodel}</div>
<div>r${car.color}</div>
<div>r${car.price}</div>
<div>r${car.type}</div>
<div>r${car.quantity}</div>
<div>r${car.path1}</div>
<div>r${car.path2}</div>
<div>r${car.path3}</div>

<%@include file="../../../footer/footer.jsp"%>
</body>
</html>
