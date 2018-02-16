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
    <jsp:include page="${pageContext.request.contextPath}/headers/head.jsp"/>
</head>
<body>
    <div>
        <h2>Наши парнеры</h2>
        <p>
            Одни из самых главных наших парнеров является мастера своего дела в кастомизации автомобилей это ребята из <a> компании Vossen.com</a>
            именно оди занимаются внешним видом все автомобилей которые вы найдете у нас на сайте и в нашем оффисе, который находится по адресу
            Украина г. Харьков пр. Пояс Сатурна ул. Тихоя Гавань.
            Мы сотрудничаем почти со всеми фирмами которые производят автомобили, а от недавнего времени и велосипедов!
            Мы не собираемся останавливаться на достигнутом и вскоре у нас будет все средства передвижения в кастомном виде.
        </p>
    </div>
    <div>
        <p>
            Краткий список наших партнеров:
        </p>
    </div>
    <jsp:include page="${pageContext.request.contextPath}/footer/footer.jsp"/>
</body>
</html>
