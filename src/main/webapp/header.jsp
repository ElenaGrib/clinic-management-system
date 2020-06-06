<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
            <h1><i class="material-icons" style="color: red">favorite</i><a href="home.jsp"><fmt:message key="label.medi"><span><fmt:message key="label.lux"></span></a>
            </h1>
        </div>
        <div id="top-nav">
            <ul>
                <li><a href="home.jsp"><fmt:message key="label.home"></a></li>
                <li><a href="login.jsp"><fmt:message key="label.loginEnter"></a></li>
                <li><a href="register.jsp"><fmt:message key="label.registration"></a></li>
                <li><a href="feedback.jsp"><fmt:message key="label.feedback"></a></li>
                <li><a href="about.jsp"><fmt:message key="label.contacts"></a></li>
                <li><a href="?lang=en_US"><fmt:message key="label.lang.en"></a></li>
                <li><a href="?lang=ru_RU"><fmt:message key="label.lang.ru"></a></li>
            </ul>
        </div>
        <div class="clr"></div>
    </div>
    <div class="feature">
        <div class="feature-inner">
            <h1><fmt:message key="label.chain"></h1>
        </div>
    </div>
</header>
</html>
