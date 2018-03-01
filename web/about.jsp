<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 14.02.2018
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<head>
    <meta content="text/html" charset="UTF-8">
    <title>About</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/about.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <div class="text">
        <p class="insideText">
            We are a young and developing team that opened for the first time in Ukraine. Our goal is to provide citizens of Ukraine with access
            to custom cars. We and our <a href="${pageContext.request.contextPath}/partners.jsp">partners</a> will do our best to provide Ukrainian citizens with the best custom machines
            all firms. Want a car over which the best designers worked, which they pumped into the edge!? Just come to us at
            Ukraine Kharkov pr. Saturn's Belt st. Quiet Harbor.
        </p>
    </div>
    <h2 class="about">About main of ours partners</h2>
    <div class="video-container">
        <video  class="videos" controls="controls" poster="images/garage.png" height="400">
            <source class="video_source" src="video/Vossen x Work Wheels - 'The Collaboration'.mp4">
        </video>
    </div>

    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
