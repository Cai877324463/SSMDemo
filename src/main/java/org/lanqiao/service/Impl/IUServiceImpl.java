package org.lanqiao.service.Impl;

import org.apache.log4j.Logger;
import org.lanqiao.bean.User;

import org.lanqiao.dao.IUserDao;
import org.lanqiao.service.IUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by 卢勇全 on 2017/8/30.
 */

@Service    //告诉spring 这是一个service  同时把这个类注册到spring
public class IUServiceImpl implements IUService {
    //创建Logger对象
    Logger logger = Logger.getLogger(IUServiceImpl.class);

    @Autowired     //让spring 注入一个dao  autowired 会根据类型去匹配对应的对象
    private IUserDao userDao;

    public List<User> getAllUser() {

        logger.info("进入了getAlluser方法");
        return userDao.getAllUser();
    }

    public User getOneUser(int userid) {

        return userDao.getOneUser(userid);
    }

    public int delUser(int userid) {

        return userDao.delUser(userid);
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public List<User> getUserByCondition(User user) {
        return userDao.getUserByCondition(user);
    }

    public List<User> findUserByCondition(User user) {
        return userDao.findUserByCondition(user);
    }

}
