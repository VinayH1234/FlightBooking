<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Flight</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Add a Flight</h2>
    <form action="/flights/add" method="post">
        <div class="mb-3">
            <label for="flightNumber" class="form-label">Flight Number</label>
            <input type="text" class="form-control" id="flightNumber" name="flightNumber" required>
        </div>
        <div class="mb-3">
            <label for="source" class="form-label">Source</label>
            <input type="text" class="form-control" id="source" name="source" required>
        </div>
        <div class="mb-3">
            <label for="destination" class="form-label">Destination</label>
            <input type="text" class="form-control" id="destination" name="destination" required>
        </div>
        <div class="mb-3">
            <label for="departureTime" class="form-label">Departure Time</label>
            <input type="text" class="form-control" id="departureTime" name="departureTime" required>
        </div>
        <div class="mb-3">
            <label for="arrivalTime" class="form-label">Arrival Time</label>
            <input type="text" class="form-control" id="arrivalTime" name="arrivalTime" required>
        </div>
        <div class="mb-3">
            <label for="price" class="form-label">Price</label>
            <input type="number" class="form-control" id="price" name="price" required>
        </div>
        <button type="submit" class="btn btn-primary">Add Flight</button>
    </form>
</div>
</body>
</html>
