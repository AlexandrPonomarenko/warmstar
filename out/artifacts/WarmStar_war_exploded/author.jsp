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
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <span>Автор проекта Ponomarenko Alexandr</span>
    <div>
        <p>Проект создавался с целью интереса к Java web разработке и поиска работы на вакансию Java Junior Developer</p>
        <p>Ниже приведен список технологий использующихся при разработке данного проекта:</p>
    </div>
    <div>
        <p>Навыки разработчика:</p>

    </div>
    <div>
        <p>Список технологий:</p>
    </div>

    <span>Обратная связь: furriets@gmail.com, покозать больше...</span>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
