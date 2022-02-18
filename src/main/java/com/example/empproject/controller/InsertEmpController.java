package com.example.empproject.controller;

import com.example.empproject.entity.Emp;
import com.example.empproject.service.EmpService;
import com.example.empproject.service.impl.EmpServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "InsertEmpController", value = "/manager/safe/insertEmp")
public class InsertEmpController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Double salary= Double.valueOf(request.getParameter("salary"));
        Integer age = Integer.valueOf(request.getParameter("age"));

        Emp emp = new Emp(name,salary,age);

        EmpService empService =new EmpServiceImpl();
        empService.addEmp(emp);

        response.sendRedirect(request.getContextPath()+"/manager/safe/showAllEmp");

    }
}
