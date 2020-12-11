<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Companies Table</title>
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
        <th colspan="5">Companies</th>
    </tr>
    <tr>
        <td colspan="5">
            <div style="border: 0; width: 100%; display: flex; justify-content: space-between">
                <p>Name: TEST</p>
                <p>Country: TEST</p>
                <p>Creator: Test</p>
                <p>Postal Code: Test</p>
            </div>
        </td>
    </tr>
    <tr>
        <th colspan="5">Info</th>
    </tr>
    <th>ID</th>
    <th>Income</th>
    <th>Year</th>
    </tr>
    <tr tabindex="3" >
        <td>1</td>
        <td>10.000.000$</td>
        <td>2014</td>

    </tr>
    <tr tabindex="2">
        <td>2</td>
        <td>5.000.00$</td>
        <td>2016</td>

    </tr>
    <tr tabindex="2">
        <td>3</td>
        <td>23.000.000$</td>
        <td>2019</td>
    </tr>
    <tr>
        <td colspan="5">
            <div style="width: 100%; display: flex; justify-content: center">
                <button>Phone To Creator</button>
                <button><a href="orderedgoods">OrderedGoods Table</a></button>
            </div>
        </td>
    </tr>
</table>
</body>
</html>
