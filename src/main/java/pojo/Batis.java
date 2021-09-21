package pojo;

import java.util.Date;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-28 08:42
 **/

public class Batis {
    private int id;
    private String name;
    private Date date;
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Batis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", desc='" + desc + '\'' +
                '}';
    }
}
