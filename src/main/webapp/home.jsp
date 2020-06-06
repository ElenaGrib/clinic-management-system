<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <jsp:include page="style.jsp"/>
    <link rel="shortcut icon" href="https://pngimg.com/uploads/plus/plus_PNG24.png" type="image/x-icon">
    <title><fmt:message key="label.mediLux"></title>
</head>
<body>
<div id="page">
    <jsp:include page="header.jsp"/>
    <div id="content">
        <div id="content-inner">
            <main id="contentbar">
                <div class="article">
                    <h2><fmt:message key="label.welcom"></h2>
                    <p><fmt:message key="label.content"></p>
                    <img src="https://gorod-plus.tv/sites/default/files/uploads/front-z-700.jpg"
                         class="img-fluid" alt="Responsive image">
                </div>
            </main>
            <nav id="sidebar">
                <div class="widget">
                    <h3><fmt:message key="label.links"></h3>
                    <ul>
                        <li><a href="http://minzdrav.gov.by/ru/"><fmt:message key="label.ministry"></a></li>
                        <li><a href="https://www.who.int/ru"><fmt:message key="label.who"></a></li>
                        <li><a href="https://www.medmir.com/"><fmt:message key="label.medicalJournals"></a></li>
                    </ul>
                </div>
            </nav>
            <div class="clr"></div>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
</html>