package dao;

import org.apache.ibatis.annotations.*;
import pojo.EasybuyOrder;
import pojo.NewsUser;
import pojo.OrderDesc;
import pojo.OrderDetail;
import java.util.List;
import java.util.Map;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-30 10:56
 **/

public interface AnnotationMapper {
    @Insert("insert into newsuser(name,password) values (#{name},#{password})")
    public void addUser(NewsUser user) ;

    @Insert("insert into newsuser(name,password) values (#{name},#{password})")
    @Options(useGeneratedKeys = true , keyProperty = "id")//获取自增的id值
    public void addUser1(NewsUser user) ;

    @Update("update newsuser set name=#{name},password=#{password} where id = #{id}")
    public void modifyUser(NewsUser user) ;

    @Delete("delete from newsuser where id = #{id}")
    public void removeUser(int id) ;

    @Select("select count(1) count from newsuser")
    public int totalUsers() ;

    @Select("select * from newsuser where name=#{name} and password=#{password}")
    public NewsUser getUser(Map<String,Object> where) ;
    @Select("select * from newsuser where name=#{name} and password=#{password}")
    public NewsUser getUser1(@Param("name") String name,
                             @Param("password") String password) ;
    @Select("select a.*,serialNumber,loginName"
            + " from orderdetail a,easybuyorder b where a.orderId = b.id")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "orderId",property = "orderId"),
            @Result(column = "productId",property = "productId"),
            @Result(column = "serialNumber",property = "serialNumber"),
            @Result(column = "loginName",property = "loginName")
    })
    public List<Map<String,Object>> queryOrderDetail() ;
    @Select("select * from orderdesc where orderId = #{id}")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "orderId",property = "orderId"),
            @Result(column = "describle",property = "describle")
    })
    OrderDesc findDescById(int id) ;
    @Select("select * from easyBuyOrder")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "loginName",property = "loginName"),
            @Result(column = "createTime",property = "createTime"),
            @Result(column = "cost",property = "cost"),
            @Result(column = "serialNumber",property = "serialNumber"),
            @Result(
                    column = "id",property = "orderDesc",
                    one = @One(select="market.dao.AnnotationMapper.findDescById")
            )
    })
    public List<EasybuyOrder> queryOrderDetail1() ;
    //1对多
    @Select("select * from orderDetail where orderId =#{id}")
    List<OrderDetail> findDetailById(int id) ;
    @Select("select * from easybuyOrder")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "loginName",property = "loginName"),
            @Result(column = "createTime",property = "createTime"),
            @Result(column = "cost",property = "cost"),
            @Result(column = "serialNumber",property = "serialNumber"),
            @Result(
                    column = "id",property = "detail",
                    many = @Many(select="market.dao.AnnotationMapper.findDetailById")
            )
    })
    public List<EasybuyOrder> queryOrderDetail2() ;

    @Select("<script>select * from newsuser <where> "
            + " <if test=\"name != null \"> and name = #{name} </if> "
            + " <if test=\"password != null \"> and password = #{password} </if> "
            + " </where></script>")
    public NewsUser getUser2(@Param("name") String name,
                             @Param("password") String password) ;

}
