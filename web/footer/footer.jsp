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
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/footerStyle.css"/>
</head>
<body>
<footer>
    <div class="top">
        <div class="left">
            <span>Created: Alexandr Ponomarenko</span>
            <ul>
                <li><a class="a-color" href="https://www.instagram.com/ponomarenko__alexandr/">instagram</a></li>
                <li><a class="a-color" href="https://www.facebook.com/">facebook</a></li>
                <li><a class="a-color" href="https://t.me/light_in_dakr">telegram</a></li>
                <li><a class="a-color" href="${pageContext.request.contextPath}/author.jsp">Author</a></li>
            </ul>
        </div>
        <div class="right">
            <ul>
                <li><a class="a-color" href="${pageContext.request.contextPath}/legal.jsp">Terms of Use</a></li>
                <li><a class="a-color" href="${pageContext.request.contextPath}/privacy.jsp">Privacy policy</a></li>
                <li><a class="a-color" href="${pageContext.request.contextPath}/help">Help</a></li>
                <li><p>Hot line: +38(099)624 31 00</p></li>
            </ul>
        </div>
    </div>
    <div class="bottom">
        <div class="top">
            Contacting the author by phone 8(099)634 31 00
        </div>
        <div class="bottom">
            <div class="rights">
                © WarmStar Inc., 2018.All rights reserved.
            </div>
            <div class="links">
                <a class="a-color" href="${pageContext.request.contextPath}/sitemap.jsp">Site map</a>
            </div>
        </div>
    </div>
</footer>
</body>
</html>
