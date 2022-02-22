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

    <table border="1" cellpadding="1" cellspacing="0">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Salary</th>
            <th>Age</th>
            <th colspan='2'>Operation</th>
        </tr>
        <c:forEach var="emp" items="${emps}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.salary}</td>
                <td>${emp.age}</td>
                <td>
<%--                    <a href="${pageContext.request.contextPath}/manager/safe/removeEmp?id=${emp.id}">delete</a>--%>
                    <a href="<c:url context='${pageContext.request.contextPath}' value='/manager/safe/removeEmp?id=${emp.id}'/>">delete</a>
                </td>
                <td>
<%--                    <a href="${pageContext.request.contextPath}/manager/safe/showEmp?id=${emp.id}">update</a>--%>
                    <a href="<c:url context='${pageContext.request.contextPath}' value='/manager/safe/showEmp?id=${emp.id}'/>">update</a>
                </td>
                    <%--            <td><a href="<%=request.getContextPath()+"/manager/safe/removeEmpController?id="+emp.getId()%>">delete</a></td>--%>
                    <%--            <td><a href="<%=request.getContextPath()+"/manager/safe/showEmpController?id="+emp.getId()%>">update</a></td>--%>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6">
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
