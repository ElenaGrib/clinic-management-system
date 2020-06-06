<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <jsp:include page="style.jsp"/>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="shortcut icon" href="https://pngimg.com/uploads/plus/plus_PNG24.png" type="image/x-icon">
    <title><fmt:message key="label.mediLux"> - <fmt:message key="label.registration"></title>
</head>
<body>
<div id="page">
    <jsp:include page="header.jsp"/>
    <div id="content-inner">
        <form action="${pageContext.request.contextPath}/register" method="post"  modelAttribute="userForm" id="form">
            <div class="container">
                <div class="input-container">
                    <label><b><fmt:message key="label.login"></b></label>
                    <input type="text" path="login" placeholder="<fmt:message key="label.enterLogin">" required>

                    <label><b>Email</b></label>
                    <input type="text" path="email" placeholder="<fmt:message key="label.enterEmail">" name="email" required>

                    <label><b><fmt:message key="label.password"></b></label>
                    <input type="text" path="password" placeholder="<fmt:message key="label.enterPassword">" name="password" required>

                    <button type="submit"><fmt:message key="label.registration"></button>
                </div>
            </div>
        </form>
        <div class="clr"></div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
