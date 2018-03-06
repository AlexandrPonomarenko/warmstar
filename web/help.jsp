<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 09.02.2018
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Help</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/help.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsLibrary/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/validate.js"></script>
</head>
<body>

    <div class="img"><img id="img" src="images/bolb.jpg"></div>

    <div class="had">
        <h2 id="front">
            It is very important for us to maintain feedback, and if you have any questions, write to us at the post office or call the hot line.
        </h2>
    </div>
    <div class="form">
        <form method="post" action="help">
            <div class="inside">
                <label for="name">Your name:</label>
                <input type="text" name="name" id="name" value="${user.nickName}" class="validate">
                <c:out value="${requestScope.errorHelp['name']}"></c:out>
                <span class="empty-message">Empty</span>
                <span class="small-length-message">Small length</span>
                <span class="bad-words-message">Bad words</span>
            </div>
            <div class="inside">
                <label for="email">Your Email address:</label>
                <input type="email" name="email" id="email" value="${user.email}" class="validate">
                <c:out value="${requestScope.errorHelp['email']}"></c:out>
                <span class="empty-message">Empty</span>
                <span class="small-length-message">Small length</span>
                <span class="bad-words-message">Bad words</span>
            </div>
            <div class="inside">
                    <textarea name="texthelp" id="textarea" cols="140" rows="10" class="validate"></textarea>
                <c:out value="${requestScope.errorHelp['texthelp']}"></c:out>
                <span class="empty-message">Empty</span>
                <span class="small-length-message">Small length</span>
                <span class="bad-words-message">Bad words</span>
            </div>
            <input class="submit-button" type="submit" disabled value="Send">
            <c:out value="${requestScope.ok}"></c:out>
        </form>
    </div>
    <div></div>

    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
