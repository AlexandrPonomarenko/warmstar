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
    <title>Site map</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/siteMap.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <div id="siteMap"><img id="img" src="${pageContext.request.contextPath}/images/puteshestviev2.jpeg"></div>
    <span class="map"><h2>Map Site</h2></span>
    <div class="conList">
        <div class="list">
            <div class="inside">
                <p class="mar"><a href="${pageContext.request.contextPath}/author.jsp">Author</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/warmStar">WarmStar</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/about.jsp">About</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/help">Help</a></p>
            </div>
        </div>
        <div class="listTwo">
            <div class="inside">
                <p class="mar"><a href="${pageContext.request.contextPath}/partners.jsp">Partners</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/logIn">LogIn</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/logOn">LogOn</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/yourOffice">Home</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/youroffice/basket">Basket</a></p>
            </div>
        </div>
        <div class="listThree">
            <div class="inside">
                <p class="mar"><a href="${pageContext.request.contextPath}/galery/bikes">Gallery bikes</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/galery/cars">Gallery cars</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/sitemap.jsp">Site Map</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/legal.jsp">Terms of Use</a></p>
                <p class="mar"><a href="${pageContext.request.contextPath}/privacy.jsp">Privacy policy</a></p>
            </div>
        </div>
    </div>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
