<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>
           cars
        </title>
    </head>
    <body>
    <c:forEach items="${cars}" var="car">
        ${car.brand} <br>
    </c:forEach>
    </body>
</html>