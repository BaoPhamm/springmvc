<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spitter</title>
</head>
<body>
<h1>Spitterrrrrr</h1>
<div class="spitterView">
<h1>Your Profile</h1>
username: <c:out value="${spitter.username}" /><br/>
firstName: <c:out value="${spitter.firstName}" /><br/>
lastName: <c:out value="${spitter.lastName}" /><br/>
</div>
</body>
</html>
