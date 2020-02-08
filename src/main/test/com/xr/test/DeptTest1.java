package com.xr.test;


import dao.DeptAsEmpMapper;

import model.Dept;
import model.Emp;
import util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DeptTest1 {

    @Test
    public void test1() throws Exception{
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DeptAsEmpMapper  deptAsEmpMapper = sqlSession.getMapper(DeptAsEmpMapper.class);
        Dept dept = deptAsEmpMapper.queryDeptAsEmps(1);
        System.out.println(dept);


        MybatisUtil.closeSqlSessoin(sqlSession);

    }



    @Test
    public void test2() throws Exception{
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DeptAsEmpMapper  deptAsEmpMapper = sqlSession.getMapper(DeptAsEmpMapper.class);
        Emp emp = deptAsEmpMapper.queryEmpsAsDept(2);
        System.out.println(emp);


        MybatisUtil.closeSqlSessoin(sqlSession);

    }


}