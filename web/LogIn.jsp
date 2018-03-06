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
    <meta content="text/html;charset=UTF-8">
    <title>LogIn</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/LogIn.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
    <script src="${pageContext.request.contextPath}/js/validate.js"></script>
</head>
<body>

    <h1 id="user">User registration</h1>
    <div class="form">
        <div class="one">
            <form method="POST" action="logIn">
                <div class="inside">
                    <label for="login" class="Login">Nick name*</label>
                    <input type="text" name="login" id="login" class="validate"/>

                    <span class="empty-message">Empty</span>
                    <span class="small-length-message">Small length</span>
                    <span class="bad-words-message">Bad words</span>
                    <c:out value = "${requestScope.error['login']}"/>
                </div>
                <div class="inside">
                    <label for="email" class="Email">E-Mail*</label>
                    <input type="email" name="email" id="email" class="validate"/>

                    <span class="empty-message">Empty</span>
                    <span class="small-length-message">Small length</span>
                    <span class="bad-words-message">Bad words</span>
                    <c:out value = "${requestScope.error['email']}"/>
                </div>
                <div class="inside">
                    <label for="FName" class="FName">First name*</label>
                    <input type="text" name="FName" id="fName" class="validate"/>

                    <span class="empty-message">Empty</span>
                    <span class="small-length-message">Small length</span>
                    <span class="bad-words-message">Bad words</span>
                    <c:out value = "${requestScope.error['FName']}"/>
                </div>
                <div class="inside">
                    <label for="LName" class="LName">Last name*</label>
                    <input type="text" name="LName" id="lName" class="validate"/>

                    <span class="empty-message">Empty</span>
                    <span class="small-length-message">Small length</span>
                    <span class="bad-words-message">Bad words</span>
                    <c:out value = "${requestScope.error['LName']}"/>
                </div>

                <div class="inside">
                    <label for="PNumber" class="PNumber">Phone number*</label>
                    <input type="text" name="PNumber" id="pNumber" class="validate"/>

                    <span class="empty-message">Empty</span>
                    <span class="small-length-message">Small length</span>
                    <span class="bad-words-message">Bad words</span>
                    <c:out value = "${requestScope.error['PNumber']}"/>
                </div>
                <div class="inside">
                    <label for="age" class="Age">Age*</label>
                    <input type="text" name="age" id="age" class="validate"/>

                    <span class="empty-message">Empty</span>
                    <span class="small-length-message">Small length</span>
                    <span class="bad-words-message">Bad words</span>
                    <c:out value = "${requestScope.error['age']}"/>
                </div>

                <div class="inside">
                    <label for="password" class="Password">Password*</label>
                    <input type="password" name="password" id="password" class="validate"/>

                    <span class="empty-message">Empty</span>
                    <span class="small-length-message">Small length</span>
                    <span class="bad-words-message">Bad words</span>
                    <c:out value = "${requestScope.error['password']}"/>
                </div>
                <div class="inside">
                    <label for="password2" class="Password2">Repeat password*</label>
                    <input type="password" name="password2" id="password2" class="validate"/>

                    <span class="empty-message">Empty</span>
                    <span class="small-length-message">Small length</span>
                    <span class="bad-words-message">Bad words</span>
                    <c:out value = "${requestScope.error['password2']}"/>
                </div>
                <p>
                    <button class="submit-button" type="submit" disabled>LogIn</button>
                </p>
            </form>
        </div>
        <div class="two">
            <p>get full access</p>
        </div>
    </div>

    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>

</body>
</html>
