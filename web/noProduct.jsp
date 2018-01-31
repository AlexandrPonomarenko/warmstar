<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 30.01.2018
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Title</title>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
<div><a href="${pageContext.request.contextPath} /warmStar">Вы не выбрали товар</a></div>
<jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
