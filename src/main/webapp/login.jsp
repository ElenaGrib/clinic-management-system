<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 27.05.20
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <jsp:include page="style.jsp"/>
    <link rel="shortcut icon" href="https://pngimg.com/uploads/plus/plus_PNG24.png" type="image/x-icon">
    <title>МедиЛюкс - Вход</title>
</head>
<body>
<div id="page">
    <jsp:include page="header.jsp"/>
    <div id="content-inner">
        <form action="${contextPath}/login" method="post" id="form">
            <div class="imgcontainer">
                <img src="https://image.freepik.com/vector-gratis/medico-paciente-mujer-sala-consulta_24908-5277.jpg"
                     alt="Avatar" class="avatar">
            </div>
            <div class="container">
                <label><b>Логин</b></label>
                <input type="login" placeholder="Введите логин" name="login" required>

                <label><b>Пароль</b></label>
                <input type="password" placeholder="Введите пароль" name="password" required>

                <button type="submit" value="login">Войти</button>
            </div>
        </form>
        <div class="clr"></div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
