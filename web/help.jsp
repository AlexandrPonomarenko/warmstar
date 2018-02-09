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
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <div><p>Усли у Вас появились вопросы, пишите нам на почту, обратитесь на горячую линию</p></div>
    <form method="post" action="">
        <label for="name">Выше имя</label>
        <input type="text" name="name" id="name">

        <label for="email">Ваша электронная почта</label>
        <input type="text" name="email" id="email">

        <p><textarea name="texthelp" id="textarea" cols="140" rows="10"></textarea></p>
        <input type="submit" value="Отправить">
    </form>
    <div></div>
    <div></div>

    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
