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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/validateFildHelp.js"></script>
</head>
<body>

<p>1</p>
<p>1</p>
<p>1</p>
<p>1</p>

    <div><p>Усли у Вас появились вопросы, пишите нам на почту, обратитесь на горячую линию</p></div>
    <form method="post" action="help">
        <label for="name">Выше имя</label>
        <input type="text" name="name" id="name" value="${user.nickName}">
        <c:out value="${requestScope.errorHelp['name']}"></c:out>

        <label for="email">Ваша электронная почта</label>
        <input type="email" name="email" id="email" value="${user.email}">
        <c:out value="${requestScope.errorHelp['email']}"></c:out>

        <p><textarea name="texthelp" id="textarea" cols="140" rows="10"></textarea></p>
        <c:out value="${requestScope.errorHelp['texthelp']}"></c:out>
        <input type="submit" onclick="return validateFormHelp(this.form)" value="Отправить">
        <c:out value="${requestScope.ok}"></c:out>
    </form>
    <div></div>
    <div></div>

    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
