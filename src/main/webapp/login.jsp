<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <jsp:include page="style.jsp"/>
    <link rel="shortcut icon" href="https://pngimg.com/uploads/plus/plus_PNG24.png" type="image/x-icon">
    <title><fmt:message key="label.mediLux"> - <fmt:message key="label.login"></title>
</head>
<body>
<div id="page">
    <jsp:include page="header.jsp"/>
    <div id="content-inner">
        <form  action="${pageContext.request.contextPath}/login" method="post" id="form">
            <div class="imgcontainer">
                <img src="https://image.freepik.com/vector-gratis/medico-paciente-mujer-sala-consulta_24908-5277.jpg"
                     alt="Avatar" class="avatar">
            </div>
            <div class="container">
                <label><b><fmt:message key="label.login"></b></label>
                <input type="text" path="login" placeholder="<fmt:message key="label.enterLogin">" name="login" required>

                <label><b><fmt:message key="label.password"></b></label>
                <input type="password" path="password" placeholder="<fmt:message key="label.enterPassword">" name="password" required>

                <button type="submit" value="login"><fmt:message key="label.login"></button>
            </div>
        </form>
        <div class="clr"></div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>