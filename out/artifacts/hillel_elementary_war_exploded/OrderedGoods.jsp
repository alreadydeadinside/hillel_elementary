<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>OrderedGoods Table</title>
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
    <th colspan="5">Ordered Goods</th>
  </tr>
  <tr>
    <td colspan="5">
      <div style="border: 0; width: 100%; display: flex; justify-content: space-between">
        <p>Order number: TEST</p>
        <p>Full name: TEST</p>
        <p>Date of order creation: TEST</p>
        <p>Order delivery date: TEST</p>
        <p>Delivery time for delivery: TEST</p>
        <p>Status: Delivered / On the road / Not sent</p>
      </div>
    </td>
  </tr>
  <tr>
    <th colspan="5">Info</th>
  </tr>
  <th>Sequence number of the goods in the order</th>
  <th>Name of the good</th>
  <th>Amount</th>
  </tr>
  <tr tabindex="3">
    <td>1</td>
    <td>Golden Apples</td>
    <td>73</td>

  </tr>
  <tr tabindex="2">
    <td>2</td>
    <td>Potion of Health</td>
    <td>46</td>

  </tr>
  <tr tabindex="2">
    <td>3</td>
    <td>Diamond Sword</td>
    <td>113</td>
  </tr>

  <tr>
    <td colspan="5">
      <div style="width: 100%; display: flex; justify-content: center">
        <button>Order</button>
        <button><a href="employees">Employees Table</a></button>
      </div>
    </td>
  </tr>
</table>
</body>
</html>
