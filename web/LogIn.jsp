<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 15.12.2017
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="warmStar.ErrorLogIn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>LogIn</title>

</head>
<body>

    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>

    <div class="text-article">
        <form method="POST" action="logIn">
            <p>
                <label for="login">Логин</label>
                <input type="text" name="login" id="login"/>
                <c:out value = "${requestScope.error['login']}"/>
                <%--Key: <c:out value="${entry.key}"/>--%>
                <%--Value: <c:out value="${entry.value}"/>--%>
                <%--</c:forEach>--%>
            <p>
                <label for="email">E-Mail</label>
                <input type="email" name="email" id="email"/>
                <c:out value = "${requestScope.error['email']}"/>
            </p>
            <p>
                <label for="FName">First name</label>
                <input type="text" name="FName" id="FName"/>
                <c:out value = "${requestScope.error['FName']}"/>
            </p>
            <p>
                <label for="LName">Last name</label>
                <input type="text" name="LName" id="LName"/>
                <c:out value = "${requestScope.error['LName']}"/>
            </p>

            <p>
                <label for="PNumber">phone number</label>
                <input type="text" name="PNumber" id="PNumber"/>
                <c:out value = "${requestScope.error['PNumber']}"/>
            </p>
            <p>
                <label for="age">Age</label>
                <input type="text" name="age" id="age"/>
                <c:out value = "${requestScope.error['age']}"/>
            </p>

            <p>
                <label for="password">Пароль</label>
                <input type="password" name="password" id="password"/>
                <c:out value = "${requestScope.error['password']}"/>

                <label for="password2">Повторите пароль</label>
                <input type="password" name="password2" id="password2"/>
                <c:out value = "${requestScope.error['password2']}"/>
            </p>
            <p>
                <button type="submit">Зарегистрироваться</button>
            </p>
        </form>
    </div>

    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>

</body>
</html>
