package com.example.empproject.filter;

import com.example.empproject.entity.EmpManager;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "CheckFilter",value = "/manager/safe/*")
public class CheckFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        HttpSession httpSession = httpServletRequest.getSession();
        EmpManager empManager = (EmpManager) httpSession.getAttribute("empManager");

        if(empManager!=null){
            chain.doFilter(httpServletRequest,httpServletResponse);
        }else {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/login.html");
        }
    }
}
