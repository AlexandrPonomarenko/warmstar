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
      <%--<jsp:forward page="warmStar"/>--%>
    <title>WARM STAR</title>
    <%--<link type="text/css" rel="stylesheet" href="css/fonts.css"/>--%>
    <link type="text/css" rel="stylesheet" href="css/styleMainPage.css"/>
  </head>
  <body>

  <jsp:include page="headers/head.jsp"/>
  <%--<header>--%>
    <%--<div id="nav-curtain"></div>--%>
    <%--<div class="nav-content">--%>
      <%--<a class="logo" href="index.jsp" ><img src="images/star-electronics-120x120.png"></a>--%>
      <%--<nav id="nav">--%>
        <%--<ul>--%>
          <%--<li><a href="#">Регистрация</a></li>--%>
          <%--<li><a href="#">О Нас</a></li>--%>
          <%--<li><a href="#">Товар</a></li>--%>
          <%--<li><a href="LogIn.jsp">LogIn</a></li>--%>
          <%--<li><a href="#">LogOn</a></li>--%>
        <%--</ul>--%>
      <%--</nav>--%>
      <%--&lt;%&ndash;<a class="garage" href="#"><img src="images/garage.png" width="32" height="26"></a>&ndash;%&gt;--%>
      <%--<a class="garage" href="#"><span class="icon-home"></span></a>--%>
    <%--</div>--%>
  <%--</header>--%>
  <div class="video-container">
    <video  class="videos" autoplay poster="images/garage.png">
      <source src="video/BMW M6 - 'Gran Coupe' - Vossen VFS-2.mp4">
    </video>
  </div>

  <div id="inside">Узнай первым</div>


  <div class="bloc1">
    <div id="shop"><img id="imgShop" src="images/WarmShop.jpg"></div>
    <div id="textOpenShop">
      <p id="textOpen">Ура теперь мы в Украине, наш первый салон эксклюзивных машин в городе Харьков!
          Приходи и ты увидишь над чем трудились многие месяци десятки лучших мастеров мира.
          МЫ хотели и мы сделали! Теперь в Украине эксклюзинвые машины не нужно ждать по 3 месяца,
          можно просто прийти к нам и выбрать то Вы хотите!
      </p>
    </div>
  </div>

  <div class="bloc2">
    <div id="textKitchen">
      <p id="textKitchenIn">Все мы знаем что совершенства достич очень сложно, и у каждого есть особое место где он это делает!
        Представляем вашему вниманию, место наших партнеров где творится Магия, та самая кухня где люди с горящими глазами
        создают из обычной машины произведения исскуства.
      </p>
    </div>
    <div class="containerVideoKitchen">
      <video class="videoKitchen" controls="controls">
        <source src="video/Vossen x Work Wheels - 'The Collaboration'.mp4">
      </video>
    </div>
  </div>

  <div id="willOnSale">Скоро будут в продаже</div>

  <div class="cars">
    <figure>
      <img src="images/Lamborghini_Gallardo_VPS-306_d3e17a0e.jpg">
      <figcation>
        <p>LAMBORGHINI Gallardo - Vossen Forged: Precision series: VPS - 306</p>
        <a href="#">Подробнее >></a>
      </figcation>
    </figure>

    <figure>
      <img src="images/Audi_R8_VPS-315T_a2fb0e77.jpg">
      <figcation>
        <p>AUDI R8 - Vossen Forged: Precision series: VPS - 315T</p>
        <a href="#">Подробнее >></a>
      </figcation>
    </figure>

    <figure>
      <img src="images/Porsche_Macan_VFS1_87249905.jpg">
      <figcation>
        <p>PORSCHE Macan - Vossen Flow Formed eries: VFS - 1</p>
        <a href="#">Подробнее >></a>
      </figcation>
    </figure>
  </div>

  <div id="onSale">В продаже</div>

  <div class="cars_for_sale">
  <c:forEach items="${requestScope.cars}" var="car">
    <figure>
      <img src="${car.path1}">
      <figcation>
        <p>${car.model} ${car.smodel}</p>
        <a href="#">Подробнее >></a>
      </figcation>
    </figure>
  </c:forEach>
  </div>

  <div class="bike_for_sale">
    <c:forEach items="${requestScope.bikes}" var="bike">
      <figure>
        <img src="${bike.path1}">
        <figcation>
          <p>${bike.model} ${bike.smodel}</p>
          <a href="#">Подробнее >></a>
        </figcation>
      </figure>
    </c:forEach>
  </div>

  <div class="socialNetwork">
    <a href="#"><span class="icon-instagram"></span></a>
    <a href="#"><span class="icon-facebook2"></span></a>
  </div>

  <%@include file="footer/footer.jsp"%>
  <%--<footer id="footer">--%>
    <%--&copy; 2017, Warm Star--%>
    <%--<br/>--%>
    <%--Все торговые марки, которые появляются на данном сайте,--%>
    <%--являются собственностью их владельцев. Все права защищены.--%>
    <%--<br>--%>
    <%--<a href="#">Политика конфиденциальности</a> <a href="#">Использование cookies</a> <a href="#">Продажа и возврат</a> <a href="#">Карта сайта</a>--%>
  <%--</footer>--%>
  </body>
</html>
