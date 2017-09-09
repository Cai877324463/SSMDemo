package org.lanqiao.dao;

import org.lanqiao.bean.Classes;
import org.lanqiao.bean.Student;

import java.util.List;

/**
 * Created by 卢勇全 on 2017/9/4.
 */
public interface IClassDao {
    List<Classes> getAllClassInfo();

    List<Student> getClassInfoById(int id);
}
