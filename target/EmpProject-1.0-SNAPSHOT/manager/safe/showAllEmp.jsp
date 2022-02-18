<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.empproject.entity.Emp" %><%--
  Created by IntelliJ IDEA.
  User: chy
  Date: 2022-02-16
  Time: 8:09 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <br> <br> <br>
    <title>Search all employees</title>
    <h2 id="common"> Show all employees </h2>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/total.css">
    <link href="https://fonts.googleapis.com/css2?family=Balsamiq+Sans&display=swap" rel="stylesheet">
</head>
<body>
<marquee scrollamount="10" width="100%" direction="left" height="100px">
    <h5>Welcome, ${empManager.username}!</h5>
</marquee>

<div id="common3">

    <table style="table-layout: fixed; width: 100%; height: 90%; border-collapse: collapse; border: 1px solid black; margin: auto;text-align:center;">
        <tr>
            <th style="width: 35px; border: 1px solid black;border-collapse: collapse; height: 30px;">Id</th>
            <th style="border: 1px solid black;border-collapse: collapse; height: 30px;">Name</th>
            <th style="border: 1px solid black;border-collapse: collapse; height: 30px;">Salary</th>
            <th style="border: 1px solid black;border-collapse: collapse; height: 30px;">Age</th>
            <th colspan='2' style="border: 1px solid black;border-collapse: collapse; height: 30px;">Operation</th>
        </tr>
        <c:forEach var="emp" items="${emps}">
            <tr>
                <td style="border: 1px solid black;border-collapse: collapse;height: 30px;">${emp.id}</td>
                <td style="border: 1px solid black;border-collapse: collapse;height: 30px;">${emp.name}</td>
                <td style="border: 1px solid black;border-collapse: collapse;height: 30px;">${emp.salary}</td>
                <td style="border: 1px solid black;border-collapse: collapse;height: 30px;">${emp.age}</td>
                <td style="border: 1px solid black;border-collapse: collapse;height: 30px;">
<%--                    <a href="${pageContext.request.contextPath}/manager/safe/removeEmp?id=${emp.id}">delete</a>--%>
                    <a href="<c:url context='${pageContext.request.contextPath}' value='/manager/safe/removeEmp?id=${emp.id}'/>">delete</a>
                </td>
                <td style="border: 1px solid black;border-collapse: collapse;height: 30px;">
<%--                    <a href="${pageContext.request.contextPath}/manager/safe/showEmp?id=${emp.id}">update</a>--%>
                    <a href="<c:url context='${pageContext.request.contextPath}' value='/manager/safe/showEmp?id=${emp.id}'/>">update</a>
                </td>
                    <%--            <td><a href="<%=request.getContextPath()+"/manager/safe/removeEmpController?id="+emp.getId()%>">delete</a></td>--%>
                    <%--            <td><a href="<%=request.getContextPath()+"/manager/safe/showEmpController?id="+emp.getId()%>">update</a></td>--%>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6" style="border: 1px solid black;border-collapse: collapse;height: 30px;">
                <c:if test="${page.pageIndex > 1}">
                    <a href="${pageContext.request.contextPath}/manager/safe/showAllEmp?pageIndex=1"> First </a>
                </c:if>
                <c:if test="${page.pageIndex == 1}">
                    <a> First </a>
                </c:if>

                <c:if test="${page.pageIndex > 1}">
                    <a href="${pageContext.request.contextPath}/manager/safe/showAllEmp?pageIndex=${page.pageIndex-1}"> Previous </a>
                </c:if>
                <c:if test="${page.pageIndex == 1}">
                    <a> Previous </a>
                </c:if>

                <c:if test="${page.pageIndex < page.totalPages}">
                    <a href="${pageContext.request.contextPath}/manager/safe/showAllEmp?pageIndex=${page.pageIndex+1}"> Next </a>
                </c:if>
                <c:if test="${page.pageIndex == page.totalPages}">
                    <a> Next </a>
                </c:if>

                <c:if test="${page.pageIndex < page.totalPages}">
                    <a href="${pageContext.request.contextPath}/manager/safe/showAllEmp?pageIndex=${page.totalPages}"> Last </a>
                </c:if>
                <c:if test="${page.pageIndex == page.totalPages}">
                    <a> Last </a>
                </c:if>

            </td>
        </tr>
    </table>
    <p><input type="button" value="Add employee" id="sub1"
              onclick="location='${pageContext.request.contextPath}/manager/safe/addEmp.jsp'"></p>
</div>
</body>
</html>
