package pojo;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-27 09:06
 **/

public class NewsUser implements Serializable {
//    private Logger log=Logger.getLogger(NewsUser.class);
    private static final long serialVersionUID = -7262983611112538952L;
    private int id;
    private String name;
    private String password;

    public NewsUser() {

    }

    public NewsUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "NewsUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
