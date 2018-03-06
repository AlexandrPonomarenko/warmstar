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
    <meta content="text/html" charset="UTF-8">
    <title>LogOn</title>
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/logOn.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsLibrary/jquery-3.3.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/validate.js"></script>
</head>
<body>

    <div class="parent">
        <div class="child1">
            <span id="one">Choose your dream</span>
            <span id="two">Just do it</span>
        </div>
        <div class="child2">
            <form method="POST" action="logOn">
                    <div class="one">
                        <label for="login">Nick name</label>
                        <input type="text" name="login" id="login" class="validate"/>
                        <span class="empty-message">Empty</span>
                        <span class="small-length-message">Small length</span>
                        <span class="bad-words-message">Bad words</span>
                        <c:out value = "${requestScope.error['login']}"/>
                    </div>
                    <div class="one">
                        <label for="password">Password</label>
                        <input type="password" name="password" id="password" class="validate"/>
                        <span class="empty-message">Empty</span>
                        <span class="small-length-message">Small length</span>
                        <span class="bad-words-message">Bad words</span>
                        <c:out value = "${requestScope.error['password']}"/>
                    </div>
                <div class="but">
                    <button class="submit-button" type="submit" disabled>Home</button>
                </div>
            </form>
        </div>
    </div>
<jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>

</body>
</html>
