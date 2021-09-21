package dao;

import pojo.NewsUser;

import java.util.List;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-27 09:20
 **/
public interface UserMapper1 {
    //添加
    public void addUser(NewsUser user);
    //修改
    public void modifyUser(NewsUser user);
    //删除
    public void deleteUser(int id);
    //查询记录数
    public int totalUser();
    //查询具体用户
    public NewsUser getUser(int id);
    //查询全部用户
    public List<NewsUser> getAllUser();

}
