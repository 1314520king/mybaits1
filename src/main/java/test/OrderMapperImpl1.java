package test;

import dao.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.EasybuyOrder;
import util.MybatisFatory;

import java.util.List;
import java.util.Map;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-28 10:12
 **/

public class OrderMapperImpl1 {
    @Test
    public void addBatis1(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);//动态代理
            List<Map<String, Object>> maps = mapper.queryAll4();
            System.out.println(maps);
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
}
