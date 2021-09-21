package test;

import dao.BatisMapper;
import dao.DynamicSQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Batis;
import pojo.EasybuyOrder;
import util.MybatisFatory;

import java.util.*;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-29 09:02
 **/

public class DynamicSQLMapperImpl {
    @Test
    public void DynamicSQLMapper(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            Map<String,Object> where=new HashMap<>();
            where.put("loginName","凤姐");
            where.put("serialNumber","111111111");
            List<EasybuyOrder> easybuyOrders = mapper.queryOrder(where);
            for (EasybuyOrder easybuyOrder : easybuyOrders) {
                System.out.println(easybuyOrder);
            }
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void DynamicSQLMapper2(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            Map<String,Object> where=new HashMap<>();
            where.put("loginName","凤姐");
            where.put("serialNumber","111111111");
            List<EasybuyOrder> easybuyOrders = mapper.queryOrder2(where);
            for (EasybuyOrder easybuyOrder : easybuyOrders) {
                System.out.println(easybuyOrder);
            }
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void DynamicSQLMapper3(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            EasybuyOrder easybuyOrder1 = new EasybuyOrder();
            easybuyOrder1.setCreateTime(new Date());
            easybuyOrder1.setSeriaNumber("9");
             mapper.updateOrder(easybuyOrder1);

            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void DynamicSQLMapper4(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            Map<String,Object> where=new HashMap<>();
            where.put("loginName","凤姐");
            where.put("serialNumber","111111111");
            where.put("from","0");
            where.put("pageSize","10");
            List<EasybuyOrder> easybuyOrders = mapper.queryOrder3(where);
            for (EasybuyOrder easybuyOrder : easybuyOrders) {
                System.out.println(easybuyOrder);
            }

            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void DynamicSQLMapper5(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            EasybuyOrder easybuyOrder = new EasybuyOrder();
            easybuyOrder.setCreateTime(new Date());
            easybuyOrder.setSeriaNumber("9");
            mapper.updateOrder1(easybuyOrder);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void DynamicSQLMapper6(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            Map<String,Object> where=new HashMap<>();
            where.put("loginName","凤姐");
            where.put("serialNumber","111111111");
            List<EasybuyOrder> easybuyOrders = mapper.queryOrder4(where);
            for (EasybuyOrder easybuyOrder : easybuyOrders) {
                System.out.println(easybuyOrder);
            }

            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void DynamicSQLMapper7(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            List where =new ArrayList<>();
            where.add("admin");
            where.add("小翠");
            List<EasybuyOrder> easybuyOrders = mapper.queryOrder6(where);
            for (EasybuyOrder easybuyOrder : easybuyOrders) {
                System.out.println(easybuyOrder);
            }
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void DynamicSQLMapper8(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            Map<String,Object> where=new HashMap<>();
            where.put("ctime","2017-09-01");
            List<String> where1 =new ArrayList<>();
            where1.add("admin");
            where.put("list",where1);
//            where.add("小翠");
            List<EasybuyOrder> easybuyOrders = mapper.queryOrder7(where);
            for (EasybuyOrder easybuyOrder : easybuyOrders) {
                System.out.println(easybuyOrder);
            }
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void DynamicSQLMapper9(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            List<EasybuyOrder> where=new ArrayList<>();
            EasybuyOrder where1 = new EasybuyOrder();
            where1.setCreateTime(new Date());
            where1.setCost(50);
            where1.setSeriaNumber("啤酒");
//            List<EasybuyOrder> easybuyOrders = mapper.addRecordBatch(where);

            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
    @Test
    public void DynamicSQLMapper10(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);//动态代理
            List<EasybuyOrder> where=new ArrayList<>();
            EasybuyOrder where1 = new EasybuyOrder();
            where1.setCreateTime(new Date());
            where1.setCost(50);
            where1.setSeriaNumber("啤酒");
//            List<EasybuyOrder> easybuyOrders = mapper.addRecordBatch(where);

            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
}
