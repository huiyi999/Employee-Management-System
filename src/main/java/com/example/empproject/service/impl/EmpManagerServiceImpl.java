package com.example.empproject.service.impl;

import com.example.empproject.dao.EmpManagerDao;
import com.example.empproject.dao.impl.EmpManagerDaoImpl;
import com.example.empproject.entity.EmpManager;
import com.example.empproject.service.EmpManagerService;
import com.example.empproject.utils.Dbutils;

public class EmpManagerServiceImpl implements EmpManagerService {
    private EmpManagerDao empManagerDao = new EmpManagerDaoImpl();

    @Override
    public EmpManager login(String username, String password) {
        EmpManager empManager =null;
        try {
            Dbutils.begin();
            EmpManager temp = empManagerDao.select(username);
            if(temp!=null){
                if(temp.getPassword().equals(password)){
                    empManager=temp;
                }
            }
            Dbutils.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return empManager;
    }
}
