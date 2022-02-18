package com.example.empproject.controller;

import com.example.empproject.entity.Emp;
import com.example.empproject.entity.Page;
import com.example.empproject.service.EmpService;
import com.example.empproject.service.impl.EmpServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "showAllEmpController", value = "/manager/safe/showAllEmp")
public class ShowAllEmpController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("login successfully");

        String pageIndex = request.getParameter("pageIndex");

        if (pageIndex == null) {
            pageIndex = "1";
        }

        Page page = new Page(Integer.valueOf(pageIndex));
        EmpService empService = new EmpServiceImpl();
        List<Emp> emps = empService.showAllEmpByPage(page);

        request.setAttribute("page", page);
        request.setAttribute("emps", emps);

        // 转发
        request.getRequestDispatcher("/manager/safe/showAllEmp.jsp").forward(request, response);
    }
}
