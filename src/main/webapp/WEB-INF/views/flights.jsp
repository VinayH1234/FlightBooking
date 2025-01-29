<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Flights</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Available Flights</h2>

    <!-- Display error or success messages -->
    <c:if test="${not empty error}">
        <div class="alert alert-danger">${error}</div>
    </c:if>
    <c:if test="${not empty message}">
        <div class="alert alert-warning">${message}</div>
    </c:if>

    <!-- Search Form -->
    <form action="/flights/search" method="post" class="d-flex mb-3">
        <input type="text" class="form-control me-2" name="source" placeholder="Source" required>
        <input type="text" class="form-control me-2" name="destination" placeholder="Destination" required>
        <button type="submit" class="btn btn-primary">Search</button>
    </form>

    <!-- Flights Table -->
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Flight Number</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Departure</th>
            <th>Arrival</th>
            <th>Price</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:choose>
            <c:when test="${not empty flights}">
                <c:forEach var="flight" items="${flights}">
                    <tr>
                        <td>${flight.flightNumber}</td>
                        <td>${flight.source}</td>
                        <td>${flight.destination}</td>
                        <td>${flight.departureTime}</td>
                        <td>${flight.arrivalTime}</td>
                        <td>${flight.price}</td>
                        <td>
                            <a href="/bookings/new/${flight.id}" class="btn btn-success btn-sm">Book</a>
                        </td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="7" class="text-center text-muted">No flights found.</td>
                </tr>
            </c:otherwise>
        </c:choose>
        </tbody>
    </table>
</div>
</body>
</html>
