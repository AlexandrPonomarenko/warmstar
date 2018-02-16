<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 09.02.2018
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Карта сайта</title>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <h2>Автор</h2>
    <span><a>facebuke</a></span>
    <span><a>instagramm</a></span>
    <span><a>telegramm</a></span>
    <span><a>cv</a></span>
    <div>
        <p><a>Автор</a></p>
        <p><a>Главная</a></p>
        <p><a>О нас</a></p>
        <p><a>Помощь</a></p>
        <p><a>Наши партнеры</a></p>
        <p><a>Регистрация</a></p>
        <p><a>Вход</a></p>
        <p><a>Личный кабинет</a></p>
        <p><a>Корзина</a></p>
        <p><a>Галлерея</a></p>
        <p><a>Галлерея велосипедов</a></p>
        <p><a>Галлерея машин</a></p>
        <p><a>Карта сайта</a></p>
        <p><a>Горячая линия</a></p>
        <p><a>Условия использования</a></p>
        <p><a>Политика конфиденциальности</a></p>
    </div>
    <div></div>
    <div></div>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
