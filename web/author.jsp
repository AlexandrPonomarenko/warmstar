<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 14.02.2018
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Author</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/author.css">
    <link type="text/css" rel="stylesheet" href="css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <h1 id="author">Author of the project Ponomarenko Alexandr</h1>
    <div>
        <h2 id="vacancy">The project was created with the purpose of interest to Java web development and job search for a vacancy Java Junior Developer.</h2>
    </div>
    <div>
        <h3 id="list">List technologies:</h3>

        <ul class="styleNone">
            <li><p class="m">Java SE: core</p></li>
            <li><p class="m">Java EE: servlet and JSTL, JSP</p></li>
            <li><p class="m">Data Base: JDBC MySQL</p></li>
            <li><p class="m">Web Server: TomCat</p></li>
            <li><p class="m">JavaScript: core, JQuery(Ajax)</p></li>
            <li><p class="m">HTML, CSS</p></li>
            <li><a class="a" href="https://github.com/AlexandrPonomarenko/warmstar">Link to project</a></li>
            <li><a class="a" href="https://github.com/AlexandrPonomarenko?tab=repositories">Link to developer in GITHub</a></li>
        </ul>
    </div>

    <span>Feedback: furriets@gmail.com, show more...</span>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
