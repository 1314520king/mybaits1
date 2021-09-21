package dao;

import org.apache.ibatis.annotations.Param;
import pojo.NewsUser;

import java.util.List;
import java.util.Map;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-28 11:23
 **/
public interface ParameterMapper {
    List<NewsUser> queryl(String name);

    List<NewsUser> query2(Map<String, Object> map);

    List<NewsUser> query3(Map<String, Object> map);

    List<NewsUser> query4(String name,String password);

    List<NewsUser> query5(@Param("name1") String name, @Param("password") String password);
}
