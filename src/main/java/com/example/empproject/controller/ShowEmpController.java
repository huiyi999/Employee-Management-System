package com.example.empproject.controller;

import com.example.empproject.entity.Emp;
import com.example.empproject.service.EmpService;
import com.example.empproject.service.impl.EmpServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "showEmpController", value = "/manager/safe/showEmp")
public class ShowEmpController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.valueOf(request.getParameter("id"));

        EmpService empService = new EmpServiceImpl();
        Emp emp = empService.showEmp(id);

        request.setAttribute("emp",emp);
        request.getRequestDispatcher("/manager/safe/showUpdateEmpInfo.jsp").forward(request,response);
    }
}
