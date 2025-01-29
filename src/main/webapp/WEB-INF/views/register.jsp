<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Register</h2>
    <form action="/users/register" method="post">
        <div class="mb-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" class="form-control" id="username" name="username" required>
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password" name="password" required>
        </div>
         <div class="mb-3">
            <label for="role" class="form-label">Role</label>
            <input type="text" class="form-control" id="role" name="role" required>
        </div>
        <button type="submit" class="btn btn-primary">Register</button>
    </form>
    <p class="text-danger mt-2">${error}</p>
</div>
</body>
</html>
