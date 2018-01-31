<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 15.12.2017
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>LogOn</title>
    <%--<link type="text/css" rel="stylesheet" href="css/LogIn.css"/>--%>
    <%--<link type="text/css" rel="stylesheet" href="css/fonts.css"/>--%>
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>


<div><p>123</p></div>
    <div><p>12312</p></div>
        <div><p>123123</p></div>
            <div><p>123123</p></div>





    <div class="text-article">
    <form method="POST" action="logOn">
        <p>
            <label for="login">Логин</label>
            <input type="text" name="login" id="login"/>
            <c:out value = "${requestScope.error['login']}"/>
        </p>
        <p>
            <label for="password">Пароль</label>
            <input type="password" name="password" id="password"/>
            <c:out value = "${requestScope.error['password']}"/>
        </p>
        <p>
            <button type="submit">Вход</button>
        </p>
    </form>
</div>
<jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>

</body>
</html>
