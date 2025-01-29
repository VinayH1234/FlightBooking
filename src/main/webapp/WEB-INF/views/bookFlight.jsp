<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Book Flight</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Book Flight</h2>
    <p>Flight Number: ${flight.flightNumber}</p>
    <p>Source: ${flight.source}</p>
    <p>Destination: ${flight.destination}</p>
    <p>Price: ${flight.price}</p>
    <form action="/bookings/new" method="post">
        <input type="hidden" name="flightId" value="${flight.id}">
        <button type="submit" class="btn btn-primary">Confirm Booking</button>
    </form>
</div>
</body>
</html>