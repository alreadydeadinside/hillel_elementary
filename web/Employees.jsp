<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employees Table</title>
    <style>
        tr {
            min-height: 20px;
        }

        tr:focus {
            background-color: olivedrab;
        }

        td {
            border: black solid 2px;
            min-height: 20px;
        }

        p {
            padding: 10px;
        }

        button {
            margin: 10px;
        }
    </style>
</head>
<body>
<table style="table-layout: fixed; width: 100%; border: black solid">
    <tr>
        <th colspan="5">Employees</th>
    </tr>
    <tr>
        <td colspan="5">
            <div style="border: 0; width: 100%; display: flex; justify-content: space-between">
                <p>Full Name: TEST</p>
                <p>Adress: TEST</p>
                <p>Phone Number: Test</p>
                <p>Age: Test</p>
                <p>Hire Date: Test</p>
                <p>Salary: Test</p>
            </div>
        </td>
    </tr>
    <tr>
        <th colspan="5">Info</th>
    </tr>
    <th>ID</th>
    <th>Sold Goods</th>
    <th>Reputation</th>
    </tr>
    <tr tabindex="3" >
        <td>1</td>
        <td>124</td>
        <td>+</td>

    </tr>
    <tr tabindex="2">
        <td>2</td>
        <td>322</td>
        <td>-</td>

    </tr>
    <tr tabindex="2">
        <td>3</td>
        <td>1008</td>
        <td>+</td>
    </tr>
    <tr>
        <td colspan="5">
            <div style="width: 100%; display: flex; justify-content: center">
                <button>Dismiss</button>
                <button><a href="customers">Customers Table</a></button>
            </div>
        </td>
    </tr>
</table>
</body>
</html>
