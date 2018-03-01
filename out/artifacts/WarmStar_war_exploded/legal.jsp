<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 15.02.2018
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<head>
    <meta content="text/html" charset="UTF-8">
    <title>Legal</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/legal.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <h1 class="h1">
        Legal information and official notices
    </h1>
    <div class="text-con">
        <p id="text">
            Ownership of the site; acceptance of terms of use
            These Terms and Conditions of Use (the "Terms of Use") refer to the WarmStar website,
            located at www.WarmStar.com, and to all relevant sites linked to the website www.apple.com and
            owned by WarmStar, its subsidiaries and affiliates, including WarmStar sites around the world (collectively,
            "Site"). The site is owned by WarmStar Inc. ("WarmStar") and its licensors. USING THE SITE,
            YOU ACCEPT THESE TERMS OF USE; IN THE EVENT OF CONSIDERATION WITH CONDITIONS DO NOT USE THE SITE.

            WarmStar reserves the right at any time at its discretion to modify, add or delete items of these
            Terms of use. You are responsible for periodically reviewing these Terms and Conditions for availability
            changes. Continued use of the Site after making changes means acceptance of these changes.
            Subject to you following these Terms of Use, WarmStar grants you a personal, non-exclusive,
            not subject to transfer to another person, limited right to visit and use the Site.
        </p>
    </div>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
