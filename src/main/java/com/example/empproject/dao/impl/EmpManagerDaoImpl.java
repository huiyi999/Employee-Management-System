package com.example.empproject.dao.impl;

import com.example.empproject.dao.EmpManagerDao;
import com.example.empproject.entity.EmpManager;
import com.example.empproject.utils.Dbutils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;


public class EmpManagerDaoImpl implements EmpManagerDao {
    private QueryRunner queryRunner = new QueryRunner();

    @Override
    public EmpManager select(String username) {
        try {
            EmpManager empManager = queryRunner.query(Dbutils.getConnection(), "select * from empmanager where username=?", new BeanHandler<EmpManager>(EmpManager.class), username);
            return empManager;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
