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
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="shortcut icon" href="https://pngimg.com/uploads/plus/plus_PNG24.png" type="image/x-icon">
    <title>МедиЛюкс - Регистрация</title>
</head>
<body>
<div id="page">
    <jsp:include page="header.jsp"/>
    <div id="content-inner">
        <form method="post" modelAttribute="userForm" id="form">
            <div class="container">
                <div class="input-container">
                    <label><b>Логин</b></label>
                    <input type="text" path="login" placeholder="Введите логин" required>

                    <label><b>Email</b></label>
                    <input type="text" path="email" placeholder="Введите email" name="email" required>

                    <label><b>Пароль</b></label>
                    <input type="text" path="password" placeholder="Введите пароль" name="password" required>

                    <label><b>Статус пользователя</b></label>
                    <select type="text" path="status" placeholder="Выберите нужное" required>
                        <option>Доктор</option>
                        <option>Пациент</option>
                    </select>

                    <button type="submit">Регистрация</button>
                </div>
            </div>
        </form>
        <div class="clr"></div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
