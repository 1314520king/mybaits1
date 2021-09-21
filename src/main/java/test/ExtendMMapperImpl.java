package test;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import dao.ExtendMMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.NewsUser;
import util.MybatisFatory;

import java.util.List;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-29 11:52
 **/

public class ExtendMMapperImpl {
    public void testqueryAll1(){
        SqlSession sqlSession = MybatisFatory.getInstance().openSession();
        ExtendMMapper mapper = sqlSession.getMapper(ExtendMMapper.class);
        List<NewsUser> newsUsers = mapper.queryAll1();
        newsUsers.forEach(System.out::println);
    }
}
