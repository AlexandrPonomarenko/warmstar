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
    <div>${bike.model}</div>
    <div>${bike.smodel}</div>
    <div>${bike.color}</div>
    <div>${bike.price}</div>
    <div>${bike.type}</div>
    <div>${bike.quantity}</div>
    <div>${bike.path1}</div>
    <div>${bike.path2}</div>
    <div>${bike.path3}</div>

    <a href="${pageContext.request.contextPath}/buy?id=${bike.id}&model=${bike.model}&smodel=${bike.smodel}&type=bike">Купить</a>

<%@include file="../../../footer/footer.jsp"%>
<%--<jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp" flush="">--%>
</body>
</html>
