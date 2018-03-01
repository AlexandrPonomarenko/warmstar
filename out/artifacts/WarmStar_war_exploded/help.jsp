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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/validateFildHelp.js"></script>
</head>
<body>

    <div class="img"><img id="img" src="images/bolb.jpg"></div>

    <div>
        <h2 id="front">
            It is very important for us to maintain feedback, and if you have any questions, write to us at the post office or call the hot line.
        </h2>
    </div>
    <form method="post" action="help">
        <label for="name">Your name:</label>
        <input type="text" name="name" id="name" value="${user.nickName}">
        <c:out value="${requestScope.errorHelp['name']}"></c:out>

        <label for="email">Your Email address:</label>
        <input type="email" name="email" id="email" value="${user.email}">
        <c:out value="${requestScope.errorHelp['email']}"></c:out>

        <p><textarea name="texthelp" id="textarea" cols="140" rows="10"></textarea></p>
        <c:out value="${requestScope.errorHelp['texthelp']}"></c:out>
        <input type="submit" onclick="return validateFormHelp(this.form)" value="Send">
        <c:out value="${requestScope.ok}"></c:out>
    </form>
    <div></div>
    <div></div>

    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
