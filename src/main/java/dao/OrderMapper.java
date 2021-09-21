package dao;

import pojo.EasybuyOrder;

import java.util.List;
import java.util.Map;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-28 10:01
 **/
public interface OrderMapper {
    public List<EasybuyOrder> queryAll();

    public List<Map<String,Object>> queryAll4();
}
