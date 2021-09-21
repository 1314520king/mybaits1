package test;

import dao.UserMapper1;
import org.apache.ibatis.session.SqlSession;
import pojo.NewsUser;
import util.MybatisFatory;

import java.util.List;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-27 09:36
 **/

public class UserMapperImpl {
    public void addUser(NewsUser user){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            UserMapper1 um=sqlSession.getMapper(UserMapper1.class);//动态代理
            um.addUser(user);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    public void modifyUser(NewsUser user){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            UserMapper1 um=sqlSession.getMapper(UserMapper1.class);//动态代理
            um.modifyUser(user);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    public void deleteUser(int id){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            UserMapper1 um=sqlSession.getMapper(UserMapper1.class);//动态代理
            um.deleteUser(id);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    public int selectUser(){
        SqlSession sqlSession=null;
        int num;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            UserMapper1 um=sqlSession.getMapper(UserMapper1.class);//动态代理
            num = um.totalUser();
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
        return  num ;
    }
    public NewsUser getUser(int i){
        SqlSession sqlSession=null;
        NewsUser user;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            UserMapper1 um=sqlSession.getMapper(UserMapper1.class);//动态代理
           user = um.getUser(i);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
        return user ;
    }
    public List<NewsUser> getAllUser(){
        SqlSession sqlSession=null;
        List<NewsUser> allUser;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            UserMapper1 um=sqlSession.getMapper(UserMapper1.class);//动态代理
            allUser = um.getAllUser();
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
        return allUser ;
    }
    public void getAllUser1(){
        SqlSession sqlSession=null;
        SqlSession sqlSession1=null;
        try{
           sqlSession = MybatisFatory.getInstance().openSession();
           sqlSession1 = MybatisFatory.getInstance().openSession();
            UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
            UserMapper1 mapper1 = sqlSession1.getMapper(UserMapper1.class);
            List<NewsUser> allUser = mapper.getAllUser();
//            List<NewsUser> allUser1 = mapper.getAllUser();
            MybatisFatory.close(sqlSession);
            List<NewsUser> allUser2= mapper1.getAllUser();
            System.out.println("----------------------");
        }finally {
//            MybatisFatory.close(sqlSession);
            MybatisFatory.close(sqlSession1);
        }
    }

    public static void main(String[] args) {
//        UserMapperImpl userMapper = new UserMapperImpl();
//        NewsUser newsUser = new NewsUser();
//        newsUser.setId(1);
//        newsUser.setName("小红2");
//        newsUser.setPassword("1234567");
//        userMapper.addUser(newsUser);
//        userMapper.modifyUser(newsUser);
//        userMapper.deleteUser(1);
//        userMapper.selectUser();
//        NewsUser user = userMapper.getUser(2);
//        System.out.println(user);
//        List<NewsUser> allUser = userMapper.getAllUser();
//        System.out.println(allUser);
//        userMapper.getAllUser1();
    }
}
