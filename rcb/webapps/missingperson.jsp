<!DOCTYPE html>
<html>
<head>
    <title>Missing Person Report</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="text-center mb-4"> Missing Person Report Form</h2>
    <form action="missing" method="post" class="p-4 border bg-white rounded shadow">
        <div class="mb-3"><label>Missing Person Name</label><input type="text" name="missingName" class="form-control" required></div>
        <div class="mb-3"><label>Complaintee Mobile</label><input type="text" name="complainteeMobile" class="form-control" required></div>
        <div class="mb-3"><label>Age</label><input type="number" name="age" class="form-control" required></div>
        <div class="mb-3"><label>Address</label><input type="text" name="address" class="form-control" required></div>
        <div class="mb-3"><label>Last Seen Location</label><input type="text" name="location" class="form-control" required></div>
        <div class="mb-3"><label>Identifiable Marks</label><input type="text" name="marks" class="form-control"></div>
        <div class="mb-3"><label>Gender</label><input type="text" name="gender" class="form-control" required></div>
        <div class="mb-3"><label>Known Languages</label><input type="text" name="lang" class="form-control"></div>
        <button type="submit" class="btn btn-warning w-100">Report Missing Person</button>
    </form>
</div>
</body>
</html>