<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Management System - Home</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #f5f7fa, #c3cfe2);
            margin: 0;
            padding: 0;
            color: #333;
        }
        .container {
            max-width: 1200px;
            margin: 20px auto;
            padding: 20px;
            background: #fff;
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
            font-size: 2.5em;
            margin-bottom: 20px;
            font-weight: 600;
        }
        .nav {
            display: flex;
            justify-content: center;
            gap: 15px;
            flex-wrap: wrap;
        }
        .nav a {
            text-decoration: none;
            color: #fff;
            background: #007bff;
            font-size: 1.1em;
            padding: 12px 20px;
            border-radius: 8px;
            transition: background-color 0.3s ease, transform 0.3s ease;
            text-align: center;
            flex: 1 1 200px;
            max-width: 200px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
        }
        .nav a:hover {
            background: #0056b3;
            transform: scale(1.05);
        }
        .nav a i {
            margin-right: 8px;
        }
        .footer {
            text-align: center;
            margin-top: 40px;
            font-size: 14px;
            color: #777;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to the Employee Management System</h1>
        <div class="nav">
            <a href="employeeList.jsp"><i class="fas fa-users"></i> Employee List</a>
            <a href="addEmployee.jsp"><i class="fas fa-user-plus"></i> Add Employee</a>
            <a href="updateEmployee.jsp"><i class="fas fa-user-edit"></i> Update Employee</a>
            <a href="deleteEmployee.jsp"><i class="fas fa-user-times"></i> Delete Employee</a>
            <a href="reports.jsp"><i class="fas fa-chart-line"></i> Reports</a>
        </div>
        <div class="footer">
            &copy; 2024 Employee Management System. All rights reserved.
        </div>
    </div>
</body>
</html>
