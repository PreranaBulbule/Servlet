<!DOCTYPE html>
<html>
<head>
    <title>Theft Complaint</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="text-center mb-4">Theft Complaint Form</h2>
    <form action="theft" method="post" class="p-4 border bg-white rounded shadow">
        <div class="mb-3"><label>Name</label><input type="text" name="name" class="form-control" required></div>
        <div class="mb-3"><label>Mobile</label><input type="text" name="mobile" class="form-control" required></div>
        <div class="mb-3"><label>Age</label><input type="number" name="age" class="form-control" required></div>
        <div class="mb-3"><label>Address</label><input type="text" name="address" class="form-control" required></div>
        <div class="mb-3"><label>Location of Theft</label><input type="text" name="location" class="form-control" required></div>
        <div class="mb-3"><label>Item Lost</label><input type="text" name="item" class="form-control" required></div>
        <div class="mb-3"><label>Date of Theft</label><input type="date" name="lostOn" class="form-control" required></div>
        <button type="submit" class="btn btn-danger w-100">Submit Complaint</button>
    </form>
</div>
</body>
</html>
