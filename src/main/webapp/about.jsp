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
    <title>МедиЛюкс - О нас</title>
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
                        <h3>Минск</h3>
                        <p>Тел: +375-29-123-45-67</p>
                        <p>Email: mlminsk@medilus.by</p>
                        <p>ул. Притыцкого, 8</p>
                    </div>
                    <div class="column" style="background-color: #F5FFFA">
                        <h3>Гомель</h3>
                        <p>Тел: +375-29-987-65-43</p>
                        <p>Email: mlgomel@medilus.by</p>
                        <p>ул. Главная, 126</p>
                    </div>
                    <div class="column" style="background-color: #F5FFFA">
                        <h3>Брест</h3>
                        <p>Тел: +375-29-456-91-45</p>
                        <p>Email: mlbrest@medilus.b</p>
                        <p>ул. Гоголя, 94</p>
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
