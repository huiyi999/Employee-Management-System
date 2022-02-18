package com.example.empproject.service;

import com.example.empproject.entity.Emp;
import com.example.empproject.entity.Page;

import java.util.List;

public interface EmpService {
    public List<Emp> showAllEmpByPage();

    public int removeEmp(int id);

    public int modifyEmp(Emp emp);

    public Emp showEmp(int id);

    public List<Emp> showAllEmpByPage(Page page);

    public int addEmp(Emp emp);
}
