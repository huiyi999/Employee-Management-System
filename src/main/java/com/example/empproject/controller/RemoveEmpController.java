package com.example.empproject.controller;

import com.example.empproject.service.EmpService;
import com.example.empproject.service.impl.EmpServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "removeEmpController", value = "/manager/safe/removeEmp")
public class RemoveEmpController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.valueOf(request.getParameter("id"));
        System.out.println("remove id: "+id);

        EmpService empService = new EmpServiceImpl();
        empService.removeEmp(id);

        response.sendRedirect(request.getContextPath()+"/manager/safe/showAllEmp");
    }
}
