package com.xr.test;

import dao.RenDao;
import model.Ren;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.MybatisUtil;

import java.awt.print.Book;
import java.util.List;

import static org.junit.Assert.*;

public class RenTest {


    @Test
    public  void test()throws  Exception{
    SqlSession sqlSession = MybatisUtil.getSqlSession();
   RenDao bookDao = sqlSession.getMapper(RenDao.class);
    List<Ren> list = bookDao.queryRen();
    for (Ren ren : list ){
        System.out.println(ren);
    }


    MybatisUtil.closeSqlSessoin(sqlSession);


}

    @Test
    public void test1()throws Exception {
        Ren ren=new Ren();
        ren.setName("水水");
        ren.setAge(18);
       ren.setSex("男");
        SqlSession sqlSession = MybatisUtil.getSqlSession();
       RenDao renDao = sqlSession.getMapper(RenDao.class);
       renDao.addRen(ren);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test3()throws Exception {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        RenDao renDao = sqlSession.getMapper(RenDao.class);
        renDao.delRen(1);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2()throws Exception {
        Ren ren=new Ren();
        ren.setId(1);
        ren.setName("小明");
        ren.setSex("男");
        ren.setAge(18);
        SqlSession sqlSession = MybatisUtil.getSqlSession();
      RenDao renDao = sqlSession.getMapper(RenDao.class);
        renDao.updateRen(ren);
        sqlSession.commit();
        sqlSession.close();
    }

}