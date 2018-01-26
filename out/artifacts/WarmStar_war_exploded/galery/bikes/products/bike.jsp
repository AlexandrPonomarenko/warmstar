<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 26.01.2018
  Time: 14:30
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
    <div>r${bike.model}</div>
    <div>r${bike.smodel}</div>
    <div>r${bike.color}</div>
    <div>r${bike.price}</div>
    <div>r${bike.type}</div>
    <div>r${bike.quantity}</div>
    <div>r${bike.path1}</div>
    <div>r${bike.path2}</div>
    <div>r${bike.path3}</div>


<%@include file="../../../footer/footer.jsp"%>
</body>
</html>
