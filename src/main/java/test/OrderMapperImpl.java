package test;


import dao.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.EasybuyOrder;
import util.MybatisFatory;


import java.util.List;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-28 10:12
 **/

public class OrderMapperImpl {
    @Test
    public void order(){
        SqlSession sqlSession=null;
        try{
            sqlSession= MybatisFatory.getInstance().openSession();
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);//动态代理
            List<EasybuyOrder> easybuyOrders = mapper.queryAll();
            for (EasybuyOrder easybuyOrder : easybuyOrders) {
                System.out.println(easybuyOrder);
            }
            sqlSession.commit();
        }finally {
            MybatisFatory.close(sqlSession);
        }
    }
}
