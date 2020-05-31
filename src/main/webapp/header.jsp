<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 27.05.20
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <jsp:include page="style.jsp"/>
</head>
<header id="header">
    <div id="header-inner">
        <div id="lux">
            <h1><i class="material-icons" style="color: red">favorite</i><a href="home.jsp">Меди<span>Люкс</span></a>
            </h1>
        </div>
        <div id="top-nav">
            <ul>
                <li><a href="home.jsp">Главная</a></li>
                <li><a href="login.jsp">Вход</a></li>
                <li><a href="register.jsp">Регистрация</a></li>
                <li><a href="feedback.jsp">Обратная связь</a></li>
                <li><a href="about.jsp">Контакты</a></li>
            </ul>
        </div>
        <div class="clr"></div>
    </div>
    <div class="feature">
        <div class="feature-inner">
            <h1>Сеть медицинских клиник МедиЛюкс</h1>
        </div>
    </div>
</header>
</html>
