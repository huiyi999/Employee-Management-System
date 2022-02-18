package com.example.empproject.controller;

import com.example.empproject.entity.EmpManager;
import com.example.empproject.service.EmpManagerService;
import com.example.empproject.service.impl.EmpManagerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EmpManagerLoginController", value = "/manager/EmpManagerLogin")
public class EmpManagerLoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. get parameter

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        EmpManagerService empManagerService = new EmpManagerServiceImpl();
        EmpManager empManager = empManagerService.login(username, password);

        if(empManager!=null){
            // login successfully
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("empManager",empManager);

            response.sendRedirect(request.getContextPath()+"/manager/safe/showAllEmp");

        }else {
            // login unsuccessfully
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }

    }
}
