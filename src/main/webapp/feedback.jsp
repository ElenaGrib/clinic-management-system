<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <jsp:include page="style.jsp"/>
    <link rel="shortcut icon" href="https://pngimg.com/uploads/plus/plus_PNG24.png" type="image/x-icon">
    <title><fmt:message key="label.mediLux"> - Обратная связь</title>
</head>
<body>
<div id="page">
    <jsp:include page="header.jsp"/>
    <div id="content-inner">
        <form action="${pageContext.request.contextPath}/feedback" method="post" id="form">
            <div class="imgcontainer">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQP7qk8c8TC4t9ha2hxrgr0sWIidX2bkjxyBB1SbBhTOldvk3Bo&s"
                     class="img-fluid" alt="Responsive image">
            </div>
            <div class="container">
                <label><b><fmt:message key="label.firstName"></b></label>
                <input type="text" placeholder="<fmt:message key="label.enterFirstName">" name="firstName" required>

                <label><b><fmt:message key="label.lastName"></b></label>
                <input type="text" placeholder="<fmt:message key="label.enterLastName">" name="lastName" required>

                <label><b><fmt:message key="label.phone"></b></label>
                <input type="text" placeholder="<fmt:message key="label.enterPhone">" name="phone">

                <label><b>Email</b></label>
                <input type="text" placeholder="Введите email" name="email" required>

                <label><b><fmt:message key="label.comments"></b></label>
                <textarea id="subject" name="subject" style="height:200px"></textarea>

                <button type="submit"><fmt:message key="label.send"></button>
            </div>
        </form>
        <div class="clr"></div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
