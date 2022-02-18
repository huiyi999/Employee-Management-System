package com.example.empproject.dao;

import com.example.empproject.entity.EmpManager;

public interface EmpManagerDao {
    public EmpManager select(String username);
}
