package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by 卢勇全 on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class IClassDaoTest {

    @Autowired
    IClassDao dao;

    @Test
    public void getClassInfoById() throws Exception {
        System.out.println(dao.getClassInfoById(234));
    }


    @Test
    public void getAllClassInfo() throws Exception {
        System.out.println(dao.getAllClassInfo());
    }

}