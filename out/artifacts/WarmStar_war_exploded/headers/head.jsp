<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 12.01.2018
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fonts.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsLibrary/jquery-3.3.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/header.js"></script>

    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        (function($) {
            $(document).ready(function(){
                $("#gallery").selectmenu({
                    change: function(event, data) {
                        window.open(data.item.value, "_self");
                    }
                });
            });
        })(jQuery);
    </script>

    <style>
        .ui-selectmenu-button {
            background-color: transparent !important;
            color: red !important;
            width: 5em !important;
            outline: none !important;
            border: 0 !important;
            padding: 0 !important;
        }
        .ui-widget-content {
            background-color: transparent;
        }
    </style>
</head>
<body>
<header>
    <div id="nav-curtain"></div>
    <div class="nav-content">
        <a class="logo" href="${pageContext.request.contextPath}/warmStar"><img src="${pageContext.request.contextPath}/images/star-electronics-120x120.png"></a>
        <nav id="nav">
            <ul>
                <li><a href="${pageContext.request.contextPath}/author.jsp">Author</a></li>
                <li><a href="${pageContext.request.contextPath}/about.jsp">About</a></li>
                <li><a href="${pageContext.request.contextPath}/partners.jsp">Partners</a></li>
                <li>
                    <select id="gallery">
                        <option selected="selected" disabled><a href="#">Gallery</a></option>
                        <option value="${pageContext.request.contextPath}/galery/cars">Cars</option>
                        <option value="${pageContext.request.contextPath}/galery/bikes">Bikes</option>
                    </select>
                </li>
                <li><a href="${pageContext.request.contextPath}/help">Help</a></li>
                <c:if test="${sessionScope.user == null}">
                    <li><a href="${pageContext.request.contextPath}/logIn">Log in</a></li>
                    <li><a href="${pageContext.request.contextPath}/logOn">Log on</a></li>
                </c:if>
                <c:if test="${sessionScope.user != null}">
                    <li><a href="${pageContext.request.contextPath}/logOut">Log out</a></li>
                </c:if>
            </ul>
        </nav>
        <a class="garage" href="${pageContext.request.contextPath}/yourOffice"><span class="icon-home"></span></a>
    </div>
</header>
</body>
</html>
