<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 01.12.2017
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>WARM STAR</title>
    <link type="text/css" rel="stylesheet" href="css/fonts.css"/>
    <link type="text/css" rel="stylesheet" href="css/styleMainPage.css"/>
  </head>
  <body>
  <header>
    <div id="nav-curtain"></div>
    <div class="nav-content">
      <a class="logo" href="index.jsp" ><img src="images/star-electronics-120x120.png"></a>
      <nav id="nav">
        <ul>
          <li><a href="#">Регистрация</a></li>
          <li><a href="#">О Нас</a></li>
          <li><a href="#">Товар</a></li>
          <li><a href="LogIn.jsp">LogIn</a></li>
          <li><a href="#">LogOn</a></li>
        </ul>
      </nav>
      <%--<a class="garage" href="#"><img src="images/garage.png" width="32" height="26"></a>--%>
      <a class="garage" href="#"><span class="icon-home"></span></a>
    </div>
  </header>
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
    <figure>
      <img src="cars_for_sale_img/All Other Makes_Tesla Model S_VVSCVT_fd4.jpg">
      <figcation>
        <p>Tesla Model S</p>
        <a href="#">Подробнее >></a>
      </figcation>
    </figure>

    <figure>
      <img src="cars_for_sale_img/Audi_A4_VVSCV7_202.jpg">
      <figcation>
        <p>Audi A4</p>
        <a href="#">Подробнее >></a>
      </figcation>
    </figure>

    <figure>
      <img src="cars_for_sale_img/Ferrari_488 GTB_VPS-310_4315c9bb.jpg">
      <figcation>
        <p>Ferrari 488</p>
        <a href="#">Подробнее >></a>
      </figcation>
    </figure>

    <figure>
      <img src="cars_for_sale_img/Ford_Mustang_VFS5_f405ffef.jpg">
      <figcation>
        <p>Ford Mustang</p>
        <a href="#">Подробнее >></a>
      </figcation>
    </figure>

    <figure>
      <img src="cars_for_sale_img/Lexus_RC_LC-105T_b85101b6.jpg">
      <figcation>
        <p>Lexus RC</p>
        <a href="#">Подробнее >></a>
      </figcation>
    </figure>
  </div>

  <div class="socialNetwork">
    <a href="#"><span class="icon-instagram"></span></a>
    <a href="#"><span class="icon-facebook2"></span></a>
  </div>


  <footer id="footer">
    &copy; 2017, Warm Star
    <br/>
    Все торговые марки, которые появляются на данном сайте,
    являются собственностью их владельцев. Все права защищены.
    <br>
    <a href="#">Политика конфиденциальности</a> <a href="#">Использование cookies</a> <a href="#">Продажа и возврат</a> <a href="#">Карта сайта</a>
  </footer>
  </body>
</html>
