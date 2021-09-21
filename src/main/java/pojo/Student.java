package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-30 09:35
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int sid;
    private String sname;
    private int age;
    private List<Teacher> slist=new ArrayList<>();
}
