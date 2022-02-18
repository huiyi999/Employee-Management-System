<%--
  Created by IntelliJ IDEA.
  User: chy
  Date: 2022-02-17
  Time: 10:15 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <br> <br> <br>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Manager Login Page</title>
    <h2 id="common"> Admin Login Page </h2>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/total.css">
    <link href="https://fonts.googleapis.com/css2?family=Balsamiq+Sans&display=swap" rel="stylesheet">
</head>
<body>

<br><br><br>
<div id="common2">
    <h3>Please login using valid username and password.</h3><br>

    <form method="post" action="${pageContext.request.contextPath}/manager/EmpManagerLogin">
        <label id="label3">Username: </label><input type="text" id="text" name="username" placeholder=" Username"><br>
        <p>
            <label id="label3">Password: </label><input type="password" id="text" name="password"
                                           placeholder=" Password"><br><br>
        <p>
            <input type="submit" id="sub" value="Login In">
    </form>

</div>
</body>
</html>
