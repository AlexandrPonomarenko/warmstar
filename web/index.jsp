<%--<%@ page import="warmStar.Car"--%>
<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 01.12.2017
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
     <meta content="text/html;charset=UTF-8">

    <title>WARM STAR</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/styleMainPage.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Plaster" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsLibrary/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/autoPlay.js"></script>
  </head>
  <body>

  <jsp:include page="headers/head.jsp"/>

  <div class="video-container">
  </div>

    <div id="shop">
      <img id="imgShop" src="images/mainIm.jpg">
      <h1><span>Become by first and choose your dream.</span></h1>
    </div>

    <div class="placeMagic">

        <img id="imgMagic" src="images/placeMagic.jpg">
        <h1><span>magic is already here.</span></h1>
    </div>


  <div id="willOnSale">Soon</div>

  <div class="cars">

    <figure>
      <img src="images/Audi_R8_VPS-315T_a2fb0e77.jpg">
      <figcation>
        <p>AUDI R8 - Forged: Precision series: VPS - 315T</p>
      </figcation>
    </figure>

    <figure>
      <img src="images/Porsche_Macan_VFS1_87249905.jpg">
      <figcation>
        <p>PORSCHE Macan - Flow Formed series: VFS - 1</p>
      </figcation>
    </figure>
  </div>

  <div id="onSale">For you</div>

  <div class="cars_for_sale">
  <c:forEach items="${requestScope.cars}" var="car">
    <figure>
      <img src="${car.path1}">
      <figcation>
        <a href="${pageContext.request.contextPath}/galery/cars/products/car?id=${car.id}&model=${car.model}&smodel=${car.smodel}">${car.model} ${car.smodel} Show</a>
      </figcation>
    </figure>
  </c:forEach>
  </div>

  <div class="bike_for_sale">
    <c:forEach items="${requestScope.bikes}" var="bike">
      <figure>
        <img src="${bike.path1}">
        <figcation>
          <a href="${pageContext.request.contextPath}/galery/bikes/products/bike?id=${bike.id}&model=${bike.model}&smodel=${bike.smodel}">${bike.model} ${bike.smodel} Show</a>
        </figcation>
      </figure>
    </c:forEach>
  </div>

  <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
  </body>
</html>
