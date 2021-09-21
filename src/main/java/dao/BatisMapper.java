package dao;

import pojo.Batis;

import java.util.List;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-28 08:45
 **/
public interface BatisMapper {
    public void addBatis(Batis batis);
   //获取自增长插入时的自增长id
    public void addBatis1(Batis batis);

    public int modifyBatis(Batis batis);

    public Batis getBatis(int id);

    public List<Batis> getBatises();
}
