<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Список аэропортов</title>
</head>
<body>
    <table border="1">
        <thead>
        <tr>
            <td>airport_code</td>
            <td>airport_name</td>
            <td>city</td>
            <td>coordinates</td>
            <td>timezone</td>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${requestScope.data}"
                   var="airport">
            <tr>
                <td>${airport.airportСode}</td>
                <td>${airport.airportName}</td>
                <td>${airport.city}</td>
                <td>${airport.coordinates}</td>
                <td>${airport.timezone}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>