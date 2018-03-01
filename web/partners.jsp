<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 14.02.2018
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<head>
    <meta content="text/html" charset="UTF-8">
    <title>Partners</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/partners.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <div class="text">
        <h2 class="h2">Our partners</h2>
        <p class="p">
            One of the most important of our partners is the master of their business in customizing cars, these are the guys from the company <a href="https://vossenwheels.com/"> Vossen</a>
            they are engaged in the appearance of all the cars that you will find on our website and in our store, which is located at
            Ukraine Kharkov pr. Saturn's Belt st. Quiet Harbor.
            We cooperate with almost all firms that produce cars, and from recent times and bicycles.
            We are not going to stop there and soon we will have all the means of transportation in a custom form.
        </p>
    </div>

    <h2 class="h2">Short list of our partners:</h2>
    <div id="list">
        <div>
            <p><a href="https://www.audi.com">Audi</a></p>
            <p><a href="https://www.mercedes-benz.com/">Mercedes-benz</a></p>
        </div>
        <div>
            <p><a href="http://www.lexus.com/">Lexus</a></p>
            <p><a href="https://www.bmw.com/">BMW</a></p>
        </div>
        <div>
            <p><a href="https://www.lamborghini.com">Lamborghini</a></p>
            <p><a href="https://www.porsche.com/">Porsche</a></p>
        </div>
        <div>
            <p><a href="https://www.ford.com">Ford</a></p>
            <p><a href="https://www.tesla.com">Tesla</a></p>
        </div>
    </div>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
