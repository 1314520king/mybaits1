package test;

import dao.AnnotationMapper;
import dao.BatisMapper;
import dao.Lazy;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Batis;
import pojo.NewsUser;
import pojo.Teacher;
import util.MybatisFatory;

import java.util.Date;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-30 10:01
 **/

public class LazyImpl {

    public Teacher UpdateBatis(int tid){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            Lazy mapper = sqlSession.getMapper(Lazy.class);//动态代理
            Teacher teacher = mapper.queryTeacher(tid);
            System.out.println(teacher.getTname());
            return teacher;
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    public void UpdateBatis1(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            AnnotationMapper mapper = sqlSession.getMapper(AnnotationMapper.class);//动态代理
            NewsUser newsUser = new NewsUser();
            newsUser.setName("张");
            newsUser.setPassword("123456");
            mapper.addUser(newsUser);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    public void UpdateBatis2(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            AnnotationMapper mapper = sqlSession.getMapper(AnnotationMapper.class);//动态代理
               mapper.removeUser(5);
               sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    public static void main(String[] args) {
        LazyImpl lazy = new LazyImpl();
//        Teacher teacher = lazy.UpdateBatis(1);
//        System.out.println(teacher);
//      lazy.UpdateBatis1();
        lazy.UpdateBatis2();

    }
}
