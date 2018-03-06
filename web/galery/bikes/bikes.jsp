<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 25.01.2018
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Gallery Bikes</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/gallery.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAllSite.css"/>
    <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsLibrary/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ajaxQuery.js"></script>
    <jsp:include page="../../headers/head.jsp"/>
</head>
<body>

    <h2 id="galleryHat">Gallery Bikes</h2>

    <div class="gallery">
        <c:forEach items="${requestScope.allbikes}" var="bike">
            <div class="product">
                <figure>
                    <a href="${pageContext.request.contextPath}/galery/bikes/products/bike?id=${bike.id}&model=${bike.model}&smodel=${bike.smodel}">
                        <img src="${pageContext.request.contextPath}/${bike.path1}">
                    </a>
                    <figcation>
                    <%--<p>${bike.model} ${bike.smodel}</p>--%>
                    <%--<p>${bike.price}</p>--%>
                    <%--<p>${bike.color}</p>--%>
                        <span class="s"><p class="p">Model: ${bike.model} ${bike.smodel}       Cost: ${bike.price}      Color: ${bike.color}</p></span>
                    </figcation>
                    <span id="${bike.id}"></span>
                </figure>

                <form product="${bike.id}">
                    <input type="hidden" name="model" value="${bike.model}"/>
                    <input type="hidden" name="smodel" value="${bike.smodel}"/>
                    <input type="hidden" name="idproduct" value="${bike.id}"/>
                    <input type="hidden" name="cost" value="${bike.price}"/>
                    <input type="hidden" name="type" value="bike"/>
                </form>
                <button product="${bike.id}" type="button" class="btn_add">Add basket</button>
            </div>
        </c:forEach>
    </div>
    <%@include file="../../footer/footer.jsp"%>
</body>
</html>
