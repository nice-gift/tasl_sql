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
    <title>Список полетов</title>
</head>
<body>
    <table border="1">
        <thead>
        <tr>
            <td>flightId</td>
            <td>flightNo</td>
            <td>scheduledDeparture</td>
            <td>scheduledArrival</td>
            <td>departureAirport</td>
            <td>arrivalAirport</td>
            <td>status</td>
            <td>aircraftCode</td>
            <td>actualDeparture</td>
            <td>actualArrival</td>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${requestScope.data}"
                   var="flight">
            <tr>
                <td>${flight.flightId}</td>
                <td>${flight.flightNo}</td>
                <td>${flight.scheduledDeparture}</td>
                <td>${flight.scheduledArrival}</td>
                <td>${flight.departureAirport}</td>
                <td>${flight.arrivalAirport}</td>
                <td>${flight.status}</td>
                <td>${flight.aircraftCode}</td>
                <td>${flight.actualDeparture}</td>
                <td>${flight.actualArrival}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>