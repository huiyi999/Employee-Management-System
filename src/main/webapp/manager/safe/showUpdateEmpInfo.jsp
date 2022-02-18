<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.empproject.entity.Emp" %><%--
  Created by IntelliJ IDEA.
  User: chy
  Date: 2022-02-16
  Time: 8:23 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <br> <br> <br>

    <title>Update employee info</title>
    <h2 id="common"> Update employee info </h2>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/total.css">
    <link href="https://fonts.googleapis.com/css2?family=Balsamiq+Sans&display=swap" rel="stylesheet">
</head>
<body>
<br><br><br>
<div id="common2">
    <%--<%--%>
    <%--    Emp emp = (Emp) request.getAttribute("emp");--%>

    <%--%>--%>

    <%--<form action="/EmpProject/manager/safe/updateEmpController" method ="post">--%>
    <form class="aligncenter" action="${pageContext.request.contextPath}/manager/safe/updateEmp"
          method="post">
        <p><label id="label3">Id:</label><input id="text2" type="text" name='id' value="${emp.id}" readonly/><br>
        <p><label id="label3">Name:</label><input id="text2" type="text" name='name' value="${emp.name}"/><br>
        <p><label id="label3">Salary:</label><input id="text2" type='text' name='salary' value="${emp.salary}"/><br>
        <p><label id="label3">Age:</label><input id="text2" type='text' name='age' value="${emp.age}"/><br><br>
        <p><input type='submit' value='update' id="sub"/><br>
    </form>
</div>
</body>
</html>
