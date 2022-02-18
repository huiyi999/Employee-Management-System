package com.example.empproject.service.impl;

import com.example.empproject.dao.EmpDao;
import com.example.empproject.dao.impl.EmpDaoImpl;
import com.example.empproject.entity.Emp;
import com.example.empproject.entity.Page;
import com.example.empproject.service.EmpService;
import com.example.empproject.utils.Dbutils;

import java.util.ArrayList;
import java.util.List;

public class EmpServiceImpl implements EmpService {
    private EmpDao empDao = new EmpDaoImpl();

    @Override
    public List<Emp> showAllEmpByPage() {
        List<Emp> emps = new ArrayList<>();

        try {
            Dbutils.begin();
            List<Emp> temp = empDao.selectAll();
            if (temp != null)
                emps = temp;
            Dbutils.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return emps;
    }

    @Override
    public int removeEmp(int id) {
        int result = 0;
        try {
            Dbutils.begin();
            result = empDao.delete(id);
            Dbutils.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public int modifyEmp(Emp emp) {
        int result = 0;
        try {
            Dbutils.begin();
            result = empDao.update(emp);
            Dbutils.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Emp showEmp(int id) {
        Emp emp = null;

        try {
            Dbutils.begin();
            Emp temp = empDao.select(id);
            if (temp != null)
                emp = temp;
            Dbutils.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return emp;
    }

    @Override
    public List<Emp> showAllEmpByPage(Page page) {
        List<Emp> emps = new ArrayList<>();

        try {
            Dbutils.begin();
            long count = empDao.selectCount();
            page.setTotalCounts((int) count);
            List<Emp> temp = empDao.selectAll(page);
            if (temp != null)
                emps = temp;
            Dbutils.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return emps;
    }

    @Override
    public int addEmp(Emp emp) {
        int result = 0;
        try {
            Dbutils.begin();
            result = empDao.insert(emp);
            Dbutils.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
