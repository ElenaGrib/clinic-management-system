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
    <title>МедиЛюкс - Обратная связь</title>
</head>
<body>
<div id="page">
    <jsp:include page="header.jsp"/>
    <div id="content-inner">
        <form action="login" method="post" id="form">
            <div class="imgcontainer">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQP7qk8c8TC4t9ha2hxrgr0sWIidX2bkjxyBB1SbBhTOldvk3Bo&s"
                     class="img-fluid" alt="Responsive image">
            </div>
            <div class="container">
                <label><b>Имя</b></label>
                <input type="text" placeholder="Введите имя" name="firstName" required>

                <label><b>Фамилия</b></label>
                <input type="text" placeholder="Введите фамилию" name="lastName" required>

                <label><b>Телефон</b></label>
                <input type="text" placeholder="Введите номер телефона" name="phone">

                <label><b>Email</b></label>
                <input type="text" placeholder="Введите email" name="email" required>

                <label><b>Ваши комментарии</b></label>
                <textarea id="subject" name="subject" style="height:200px"></textarea>

                <button type="submit">Отправить</button>
            </div>
        </form>
        <div class="clr"></div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
