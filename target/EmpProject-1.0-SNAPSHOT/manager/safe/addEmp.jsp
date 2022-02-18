<%--
  Created by IntelliJ IDEA.
  User: chy
  Date: 2022-02-18
  Time: 4:22 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <br> <br> <br>

    <title>Add employee</title>
    <h2 id="common"> Add an employee </h2>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/total.css">
    <link href="https://fonts.googleapis.com/css2?family=Balsamiq+Sans&display=swap" rel="stylesheet">
</head>
<body>
<br><br><br>
<div id="common2">
    <form class="aligncenter" action="${pageContext.request.contextPath}/manager/safe/insertEmp"
          method="post">
        <p><label id="label3">Name:</label><input id="text2" type="text" name='name'/><br>
        <p><label id="label3">Salary:</label><input id="text2" type='text' name='salary'/><br>
        <p><label id="label3">Age:</label><input id="text2" type='text' name='age' /><br><br>
        <p><input type='submit' value='Add' id="sub"/><br>
    </form>
</div>

</body>
</html>
