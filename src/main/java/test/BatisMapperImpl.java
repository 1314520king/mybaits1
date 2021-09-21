package test;

import dao.BatisMapper;
import dao.UserMapper1;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Batis;
import util.MybatisFatory;

import java.util.Date;
import java.util.List;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-28 08:50
 **/

public class BatisMapperImpl {
    @Test
    public void addBatis(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//动态代理
            Batis batis = new Batis();
            batis.setName("张三");
            batis.setDate(new Date());
            batis.setDesc("上升");
            um.addBatis(batis);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void addBatis1(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//动态代理
            Batis batis = new Batis();
            batis.setName("张四");
            batis.setDate(new Date());
            batis.setDesc("上升");
            um.addBatis1(batis);
//            System.out.println(batis);
            System.out.println(batis.getId());
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void UpdateBatis(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//动态代理
            Batis batis = new Batis();
            batis.setId(1);
            batis.setName("张四");
            batis.setDate(new Date());
            batis.setDesc("上升");
            um.modifyBatis(batis);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void SeleteBatis(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//动态代理
            Batis batis = um.getBatis(1);
            System.out.println(batis);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void getBatises(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//动态代理
            List<Batis> batises = um.getBatises();
            System.out.println(batises);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
}
