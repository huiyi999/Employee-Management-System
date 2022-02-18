package com.example.empproject.dao;

import com.example.empproject.entity.Emp;
import com.example.empproject.entity.Page;

import java.util.List;

public interface EmpDao {
    public List<Emp> selectAll();

    public int delete(int id);

    public int update(Emp emp);

    public Emp select(int id);

    public List<Emp> selectAll(Page page);

    public long selectCount();

    public int insert(Emp emp);
}
