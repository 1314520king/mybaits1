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
 * @create: 2021-07-30 09:36
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int tid;
    private String tname;
    private String subject;
    private List<Student> slist=new ArrayList<>();
}
