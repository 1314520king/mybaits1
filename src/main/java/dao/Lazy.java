package dao;

import pojo.Teacher;

/**
 * @program: mybaits1
 * @description:
 * @author: Mr.xu
 * @create: 2021-07-30 09:52
 **/
public interface Lazy {
    //根据教师id去查教师
    public Teacher queryTeacher(int tid);
}
