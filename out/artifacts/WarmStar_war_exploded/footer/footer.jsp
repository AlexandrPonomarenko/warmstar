<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 17.01.2018
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%--<title>Title</title>--%>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/footerStyle.css"/>
</head>
<body>
<%--<footer id="footer">--%>
    <%--&copy; 2017, Warm Star--%>
    <%--<br/>--%>
    <%--Все торговые марки, которые появляются на данном сайте,--%>
    <%--являются собственностью их владельцев. Все права защищены.--%>
    <%--<br>--%>
    <%--<a href="#">Политика конфиденциальности</a> <a href="#">Использование cookies</a> <a href="#">Продажа и возврат</a> <a href="#">Карта сайта</a>--%>
<%--</footer>--%>

<footer>
    <div class="top">
        <div class="left">
            <span>Created: Alexandr Ponomarenko</span>
            <ul>
                <li><a href="https://www.instagram.com/ponomarenko__alexandr/">instagram</a></li>
                <li><a href="https://www.facebook.com/">facebook</a></li>
                <li><a href="https://t.me/light_in_dakr">telegram</a></li>
                <li><a href="${pageContext.request.contextPath}/author.jsp">Author</a></li>
                <li><a href="#">test5</a></li>
            </ul>
        </div>
        <div class="right">
            <ul>
                <li><a href="#">test1test1</a></li>
                <li><a href="${pageContext.request.contextPath}/legal.jsp">Условия использования</a></li>
                <li><a href="${pageContext.request.contextPath}/privacy.jsp">test3test1</a></li>
                <li><a href="${pageContext.request.contextPath}/help">Help</a></li>
                <li><p>Горячая линия: +380996243100</p></li>
            </ul>
        </div>
    </div>
    <div class="bottom">
        <div class="top">
            Связь по телефону с автором по телефону 8‑099‑634‑31‑00.
        </div>
        <div class="bottom">
            <div class="rights">
                © WarmStar Inc., 2018 г. Все права защищены.
            </div>
            <div class="links">
                <a href="${pageContext.request.contextPath}/sitemap.jsp">Site map</a>
                <a href="#">link</a>
                <a href="#">link</a>
                <a href="#">link</a>
                <a href="#">link</a>
            </div>
        </div>
    </div>
</footer>
</body>
</html>
