package com.example.empproject.jsp;

import com.example.empproject.entity.Emp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "showUpdateEmpInfoJSP", value = "/manager/safe/showUpdateEmpInfoJSP")
public class showUpdateEmpInfoJSP extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Emp emp = (Emp) request.getAttribute("emp");

        PrintWriter printWriter =response.getWriter();

        printWriter.println("<html>");
        printWriter.println("   <head>");
        printWriter.println("      <meta charset='utf-8'>");
        printWriter.println("      <title>Update employee info</title>");
        printWriter.println("   <body>");
        printWriter.println("      <form action='/EmpProject/manager/safe/updateEmpController' method ='post'>");
        printWriter.println("      Id:<input type='text' name='id' value='"+emp.getId()+"'readonly/><br/>");
        printWriter.println("      Name:<input type='text' name='name' value='"+emp.getName()+"'/><br/>");
        printWriter.println("      Salary:<input type='text' name='salary' value='"+emp.getSalary()+"'/><br/>");
        printWriter.println("      Age:<input type='text' name='age' value='"+emp.getAge()+"'/><br/>");
        printWriter.println("      <input type='submit' value='update'/><br/>");
        printWriter.println("      </form>");
        printWriter.println("   </body>");
        printWriter.println("   </head>");
        printWriter.println("</html>");
    }
}
