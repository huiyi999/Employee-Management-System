package com.example.empproject.utils;

import com.example.empproject.dao.EmpDao;
import com.example.empproject.dao.impl.EmpDaoImpl;
import com.example.empproject.entity.Emp;
import com.example.empproject.entity.Page;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        EmpDao empDao = new EmpDaoImpl();
        Page page = new Page(2);

        int pageIndex = 1;
        int pageSize = 5;

        List<Emp> emps= empDao.selectAll(page);

        for(Emp emp:emps){
            System.out.println(emp);
        }
    }
}
