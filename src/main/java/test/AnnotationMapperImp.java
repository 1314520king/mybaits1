package test;

import dao.AnnotationMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.NewsUser;
import util.MybatisFatory;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-30 11:39
 **/

public class AnnotationMapperImp {
     public void add(){
         SqlSession sqlSession = MybatisFatory.getInstance().openSession();
         AnnotationMapper mapper = sqlSession.getMapper(AnnotationMapper.class);
         NewsUser newsUser=new NewsUser();
         newsUser.setName("张三");
         newsUser.setPassword("123456");
         mapper.addUser(newsUser);
         sqlSession.commit();
     }
    public void add1(){
        SqlSession sqlSession = MybatisFatory.getInstance().openSession();
        AnnotationMapper mapper = sqlSession.getMapper(AnnotationMapper.class);
        NewsUser newsUser=new NewsUser();
        newsUser.setName("张三");
        newsUser.setPassword("123456");
        mapper.addUser1(newsUser);
        System.out.println(newsUser.getId());
        sqlSession.commit();
    }
    public void update(){
        SqlSession sqlSession = MybatisFatory.getInstance().openSession(true);
        AnnotationMapper mapper = sqlSession.getMapper(AnnotationMapper.class);
        NewsUser newsUser=new NewsUser();
        newsUser.setId(9);
        newsUser.setName("张三7");
        newsUser.setPassword("1234567");
        mapper.modifyUser(newsUser);
//        sqlSession.commit();
    }
    public void  delete(){
         SqlSession sqlSession=MybatisFatory.getInstance().openSession();
        AnnotationMapper mapper = sqlSession.getMapper(AnnotationMapper.class);
        mapper.removeUser(9);
        sqlSession.commit();
    }
    public void total(){
        SqlSession sqlSession=MybatisFatory.getInstance().openSession();
        AnnotationMapper mapper = sqlSession.getMapper(AnnotationMapper.class);
        int i = mapper.totalUsers();
        System.out.println(i);
    }
    public void queryUser(){
        SqlSession sqlSession=MybatisFatory.getInstance().openSession();
        AnnotationMapper mapper = sqlSession.getMapper(AnnotationMapper.class);
        Map<String,Object> map=new HashMap();
        map.put("name","张三");
        map.put("password","123456");
        NewsUser user = mapper.getUser(map);
        System.out.println(user);
    }
    public static void main(String[] args) {
        AnnotationMapperImp test =new AnnotationMapperImp();
//        test.add();
//        test.add1();
//        test.update();
//        test.delete();
//        test.total();
        test.queryUser();
    }
}
