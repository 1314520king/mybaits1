package util;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-27 09:09
 **/

public class MybatisFatory {
    //单列模式
    private static volatile SqlSessionFactory instance;
    private MybatisFatory(){

    }
    public static SqlSessionFactory getInstance(String file){
        if (instance == null){
            synchronized (MybatisFatory.class){
                if (instance == null){
                    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
                    InputStream is;
                    try{
                        is = Resources.getResourceAsStream(file);
                    }catch (IOException e){
                        throw new RuntimeException(e);
                    }
                    instance = builder.build(is);
                }
            }
        }
        return instance;
    }
    public static SqlSessionFactory getInstance(){
        String file = "mybatis-config.xml";
        return getInstance(file);
    }

    //SqlSession和 connection 关联
    //SqlSession 负责执行我们写的sql
    public static void close(SqlSession sqlSession){
        if (sqlSession !=null){
            sqlSession.close();
        }
    }
}
