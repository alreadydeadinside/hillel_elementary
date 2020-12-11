<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customers Table</title>
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
        <th colspan="5">Customers</th>
    </tr>
    <tr>
        <td colspan="5">
            <div style="border: 0; width: 100%; display: flex; justify-content: space-between">
                <p>Full name: TEST</p>
                <p>Adress: TEST</p>
                <p>Phone Number: TEST</p>
            </div>
        </td>
    </tr>
    <tr>
        <th colspan="5">Info</th>
    </tr>
    <tr>
    <th>ID</th>
    <th>Bought goods name</th>
    <th>Costs</th>
    </tr>
    <tr tabindex="3">
        <td>1</td>
        <td>MP3 Player "Sony"</td>
        <td>300$</td>

    </tr>
    <tr tabindex="2">
        <td>2</td>
        <td>Fedora Hat</td>
        <td>100$</td>

    </tr>
    <tr tabindex="2">
        <td>3</td>
        <td>GUCCI pants x Lui Vuitton x Fendi x Prada</td>
        <td>19.999$</td>
    </tr>

    <tr>
        <td colspan="5">
            <div style="width: 100%; display: flex; justify-content: center">
                <button>Phone Customer</button>
                <button><a href="companies">Companies Table</a></button>
            </div>
        </td>
    </tr>
</table>
</body>
</html>
