package test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.ParameterMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.NewsUser;
import util.MybatisFatory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-28 11:28
 **/

public class ParameterMapperImpl {
    @Test
    public void selectUser(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);//动态代理
            PageHelper.startPage(1,5);
            List<NewsUser> queryl = mapper.queryl("小");
            PageInfo<NewsUser> PageInfo = new PageInfo<>(queryl);

            System.out.println(PageInfo);
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void selectUserMap(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);//动态代理
            Map<String,Object> where=new HashMap<>();
//            where.put("name","小");
            where.put("name1","小");
            List<NewsUser> queryl = mapper.query2(where);
            System.out.println(queryl);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void selectUserMap3(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);//动态代理
            Map<String,Object> where=new HashMap<>();
//            where.put("name","小");
            where.put("name1","小");
            List<NewsUser> queryl = mapper.query3(where);
            System.out.println(queryl);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void selectUserString(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);//动态代理
            List<NewsUser> ma = mapper.query4("小", "123456");
            for (NewsUser newsUser : ma) {
                System.out.println(newsUser);
            }
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void selectUserString1(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);//动态代理
            List<NewsUser> queryl = mapper.query5("小","1234567");
            System.out.println(queryl);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
}
