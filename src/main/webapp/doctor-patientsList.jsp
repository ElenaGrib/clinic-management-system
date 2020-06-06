<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%--<jsp:include page="style.jsp"/>--%>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="shortcut icon" href="https://pngimg.com/uploads/plus/plus_PNG24.png" type="image/x-icon">
<title><fmt:message key="label.mediLux"> - <fmt:message key="label.patientsList"></title>
</head>
<body>
<div id="page">
<jsp:include page="header.jsp"/>
    <div id="content-inner">
    <table id="form">
    <thead>
    <tr>
        <th>Id:</th>
        <th><b><fmt:message key="label.firstName">:</b></th>
        <th><b><fmt:message key="label.lastName">:</b></th>
        <th><b><fmt:message key="label.birthday">:</b></th>
        <th><b><fmt:message key="label.gender">:</b></th>
        <th><b>Email:</b></th>
        <th><b><fmt:message key="label.phone">:</b></th>
        <th><b><fmt:message key="label.country">:</b></th>
        <th><b><fmt:message key="label.city">:</b></th>
        <th><b><fmt:message key="label.street">:</b></th>
        <th><b><fmt:message key="label.building">:</b></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="patient" items="${patients.pageList}">
    <tr>
        <th>${patient.id}</th>
        <th>${patient.firstName}</th>
        <th>${patient.lastName}</th>
        <th>${patient.birthday}</th>
        <th>${patient.gender}</th>
        <th>${patient.email}</th>
        <th>${patient.phone}</th>
        <th>${patient.country}</th>
        <th>${patient.city}</th>
        <th>${patient.street}</th>
        <th>${patient.building}</th>
    </tr>
    </c:forEach>
    </tbody>
     </table>

      <div id="pagination">
       <c:url value="/patients" var="prev">
           <c:param name="page" value="${page-1}"/>
       </c:url>
       <c:if test="${page > 1}">
           <a href="<c:out value="${prev}" />" class="pn prev">Prev</a>
       </c:if>

       <c:forEach begin="1" end="${maxPages}" step="1" varStatus="i">
        <c:choose>
            <c:when test="${page == i.index}">
            <span>${i.index}</span>
       </c:when>
       <c:otherwise>
       <c:url value="/patients" var="url">
                   <c:param name="page" value="${i.index}"/>
             </c:url>
            <a href='<c:out value="${url}" />'>${i.index}</a>
       </c:otherwise>
       </c:choose>
       </c:forEach>
       <c:url value="/patients" var="next">
       <c:param name="page" value="${page + 1}"/>
       </c:url>
       <c:if test="${page + 1 <= maxPages}">
           <a href='<c:out value="${next}" />' class="pn next">Next</a>
        </c:if>
        </div>

    <div class="clr"></div>
   </div>
<jsp:include page="footer.jsp"/>
</div>
</body>
</html>
