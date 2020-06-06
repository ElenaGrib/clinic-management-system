<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <jsp:include page="style.jsp"/>
    <link rel="shortcut icon" href="https://pngimg.com/uploads/plus/plus_PNG24.png" type="image/x-icon">
    <title><fmt:message key="label.mediLux"> - <fmt:message key="label.aboutUs"></title>
</head>
<body>
<div id="page">
    <jsp:include page="header.jsp"/>
    <div id="content-inner">
        <main id="contentbar">
            <script>
                function initMap() {
                    var uluru = {lat: 53.902, lng: 27.562};
                    var map = new google.maps.Map(
                        document.getElementById("map"), {zoom: 4, center: uluru});
                    var marker = new google.maps.Marker({position: uluru, map: map});
                }
            </script>
            <script async defer
                    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCCR8xzP2TGZ9bIwqDBokj4b5LT4t-8MPc&callback=initMap"></script>
            <div class="article">
                <div id="map"></div>
                <div class="row">
                    <div class="column" style="background-color: #F5FFFA">
                        <h3><fmt:message key="label.minsk"></h3>
                        <p><fmt:message key="label.tel">: +375-29-123-45-67</p>
                        <p>Email: mlminsk@medilus.by</p>
                        <p><fmt:message key="label.prityckogo">, 8</p>
                    </div>
                    <div class="column" style="background-color: #F5FFFA">
                        <h3><fmt:message key="label.gomel"></h3>
                        <p><fmt:message key="label.tel">: +375-29-987-65-43</p>
                        <p>Email: mlgomel@medilus.by</p>
                        <p><fmt:message key="label.glavnaya">, 126</p>
                    </div>
                    <div class="column" style="background-color: #F5FFFA">
                        <h3><fmt:message key="label.brest"></h3>
                        <p><fmt:message key="label.tel">: +375-29-456-91-45</p>
                        <p>Email: mlbrest@medilus.b</p>
                        <p><fmt:message key="label.gogolya">, 94</p>
                    </div>
                </div>
            </div>
        </main>
        <div class="clr"></div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
