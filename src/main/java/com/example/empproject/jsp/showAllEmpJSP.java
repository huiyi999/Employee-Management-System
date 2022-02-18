package com.example.empproject.jsp;

import com.example.empproject.entity.Emp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "showAllEmpJSP", value = "/manager/safe/showAllEmpJSP")
public class showAllEmpJSP extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. get collection data
        List<Emp> emps = (List<Emp>) request.getAttribute("emps");

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");
        printWriter.println("   <head>");
        printWriter.println("       <meta charset='utf-8'>");
        printWriter.println("       <title>Search all employees</title>");
        printWriter.println("   </head>");
        printWriter.println("   <body>");
        printWriter.println("       <table border='1'>");
        printWriter.println("          <tr>");
        printWriter.println("             <td>Id</td>");
        printWriter.println("             <td>Name</td>");
        printWriter.println("             <td>Salary</td>");
        printWriter.println("             <td>Age</td>");
        printWriter.println("             <td colspan='2'>Operation</td>");
        printWriter.println("          </tr>");
        for (Emp emp:emps){
            printWriter.println("          <tr>");
            printWriter.println("             <td>"+emp.getId()+"</td>");
            printWriter.println("             <td>"+emp.getName()+"</td>");
            printWriter.println("             <td>"+emp.getSalary()+"</td>");
            printWriter.println("             <td>"+emp.getAge()+"</td>");
            printWriter.println("             <td><a href='"+request.getContextPath()+"/manager/safe/removeEmpController?id="+emp.getId()+"'>delete<a></td>");
            printWriter.println("             <td><a href='"+request.getContextPath()+"/manager/safe/showEmpController?id="+emp.getId()+"'>update<a></td>");
            printWriter.println("          </tr>");
        }
        printWriter.println("       </table>");
        printWriter.println("   </body>");
        printWriter.println("</html>");
    }
}
