<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spittle</title>
</head>
<body>
<h1>Spittlessss</h1>
<div class="spittleMessage">
    <c:out value="${spittle.message}"/>
</div>
<div>
    <span class="spittleId">id: <c:out value="${spittle.id}"/></span>
</div>
<div>
    <span class="spittleTime">time: <c:out value="${spittle.time}"/></span>
</div>
<div>
    <span class="spittleLocation">
        (long: <c:out value="${spittle.latitude}"/>,
        lat: <c:out value="${spittle.longitude}"/>)</span>
</div>

</body>
</html>
