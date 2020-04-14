<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/9
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Student Information</h2>
<table>
    <tr>
        <td>Username</td>
        <td>${username}</td>
    </tr>
    <tr>
        <td>Mobile</td>
        <td>${mobile}</td>
    </tr>
    <tr>
        <td>city code</td>
        <td>${cityCode}</td>
    </tr>
</table>
</body>
</html>
