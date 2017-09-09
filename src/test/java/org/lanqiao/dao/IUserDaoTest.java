package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 卢勇全 on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    public static void main(String[] args) throws Exception {
        new IUserDaoTest().updateUserByCond();
    }

    @Autowired
    IUserDao dao;
    @Test
    public  void updateUserByCond() throws Exception {
        User user = new User();
        user.setUserid(88);
        user.setUsername("caicai");
        dao.updateUserByCond(user);
    }

    @Test
    public void getUserIn() throws Exception {
        List<Integer> list= new ArrayList<Integer>();
        list.add(88);
        list.add(77);
        System.out.println( dao.getUserIn(list));
    }
}