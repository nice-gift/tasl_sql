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
    <title>Список самолетов</title>
</head>
<body>
    <table border="1">
        <thead>
        <tr>
            <td>Код</td>
            <td>Модель</td>
            <td>Расстояние</td>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${requestScope.data}"
                   var="flight">
            <tr>
                <td>${flight.aircraftCode}</td>
                <td>${flight.model}</td>
                <td>${flight.range}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>