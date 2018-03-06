<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 15.02.2018
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<head>
    <meta content="text/html" charset="UTF-8">
    <title>Privacy</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/privacy.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <h1 id="privacy">Privacy policy</h1>
    <h2 id="collection">Collection and use of personal information</h2>
    <div class="text">
        <h3 class="textInside">Personal information is data that allows you to identify a person or contact him.</h3>
        <p class="textInside">If you contact WarmStar or a subsidiary of WarmStar, you may be asked to provide personal information.
           WarmStar and its subsidiaries can share this personal information with each other and use it in accordance with
           this privacy policy. This information can be combined with others in order to provide and improve our
           products, services, content and advertising. You are not required to provide personal information on our request, however, if you do not have it
           specify, in some cases we will not be able to provide you with a product, provide a service, or respond to a request.
        </p>
        <p class="textInside">Here are some examples of what personal information WarmStar can ask you to provide and how it can be used by us.</p>
    </div>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
