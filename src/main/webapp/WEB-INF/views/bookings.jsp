<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My Bookings</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>My Bookings</h2>
    
    <c:if test="${not empty message}">
        <div class="alert alert-success">${message}</div>
    </c:if>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Flight Number</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Booking Date</th>
        </tr>
        </thead>
        <tbody>
        <c:choose>
            <c:when test="${not empty bookings}">
                <c:forEach var="booking" items="${bookings}">
                    <tr>
                        <td>${booking.flight.flightNumber}</td>
                        <td>${booking.flight.source}</td>
                        <td>${booking.flight.destination}</td>
                        <td>${booking.bookingDate}</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4" class="text-center text-muted">No bookings found.</td>
                </tr>
            </c:otherwise>
        </c:choose>
        </tbody>
    </table>
</div>
</body>
</html
