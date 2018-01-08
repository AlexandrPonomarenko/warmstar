<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 15.12.2017
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LogIn</title>
    <link type="text/css" rel="stylesheet" href="css/LogIn.css"/>
    <link type="text/css" rel="stylesheet" href="css/fonts.css"/>
</head>
<body>
    <header>
        <div id="nav-curtain"></div>
        <div class="nav-content">
            <a class="logo" href="index.jsp"><img src="images/star-electronics-120x120.png"></a>
            <nav id="nav">
                <ul>
                    <li><a href="#">Регистрация</a></li>
                    <li><a href="#">О Нас</a></li>
                    <li><a href="#">Товар</a></li>
                    <li><a href="LogIn.jsp">LogIn</a></li>
                    <li><a href="LogOn.jsp">LogOn</a></li>
                 </ul>
            </nav>
            <a class="garage" href="#"><span class="icon-home"></span></a>
        </div>
    </header>

    <div class="text-article">
        <form method="POST" action="logIn">
            <p>
                <label for="login">Логин</label>
                <input type="text" name="login" id="login"/>
            </p>
            <p>
                <label for="email">E-Mail</label>
                <input type="email" name="email" id="email"/>
            </p>
            <p>
                <label for="FName">First name</label>
                <input type="text" name="FName" id="FName"/>
            </p>
            <p>
                <label for="LName">Last name</label>
                <input type="text" name="LName" id="LName"/>
            </p>

            <p>
                <label for="PNumber">phone number</label>
                <input type="text" name="PNumber" id="PNumber"/>
            </p>
            <p>
                <label for="age">Age</label>
                <input type="text" name="age" id="age"/>
            </p>

            <p>
                <label for="password">Пароль</label>
                <input type="password" name="password" id="password"/>

                <label for="password2">Повторите пароль</label>
                <input type="password" name="password2" id="password2"/>
            </p>
            <p>
                <button type="submit">Зарегистрироваться</button>
            </p>
        </form>
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
