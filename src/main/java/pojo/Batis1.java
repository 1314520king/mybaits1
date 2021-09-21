package pojo;

import java.util.Date;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-28 09:27
 **/

public class Batis1 {
    private int bId;
    private String bName;
    private Date bDate;
    private String bDesc;

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public String getbDesc() {
        return bDesc;
    }

    public void setbDesc(String bDesc) {
        this.bDesc = bDesc;
    }

    @Override
    public String toString() {
        return "Batis1{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", bDate=" + bDate +
                ", bDesc='" + bDesc + '\'' +
                '}';
    }
}
