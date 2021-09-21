package dao;

import pojo.Batis;
import pojo.EasybuyOrder;
import pojo.NewsUser;

import java.util.List;
import java.util.Map;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-29 08:49
 **/
public interface DynamicSQL {
    //if
    public List<EasybuyOrder> queryOrder(Map<String,Object> where);
    //if where
    public List<EasybuyOrder> queryOrder2(Map<String,Object> where);
    //set if
    public void updateOrder(EasybuyOrder order);
    //trim代替where if连用
    public List<EasybuyOrder> queryOrder3(Map<String,Object> where);
    //trim代替set 和 if
    public void updateOrder1(EasybuyOrder order);
    //choose
    public List<EasybuyOrder> queryOrder4(Map<String,Object> where);
    //foreach使用list去传递条件值
    public List<EasybuyOrder> queryOrder6(List<Object> where);
    //foreach map传参
    public List<EasybuyOrder> queryOrder7(Map<String,Object> where);
    //批量插入
    public void addRecordBatch(List<NewsUser> list);
    //批量插入
    public void addRecordBatch1(List<Batis> list);
}
