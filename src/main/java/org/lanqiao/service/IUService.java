package org.lanqiao.service;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by 卢勇全 on 2017/8/30.
 */
public interface IUService {
    /**
     * 查询出所有用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 根据id查询某一个用户
     * @param userid 用户id
     * @return 执行结果
     */
    User getOneUser(int userid);

    /**
     * 根据id删除某个用户
     * @param userid  用户id
     * @return 执行结果
     */
    int delUser(int userid);

    /**
     * 插入一个用户
     * @param user 用户对象
     * @return 执行结果
     */
    int addUser(User user);

    /**
     * 更新一个用户
     * @param user  用户user
     * @return 执行结果
     */
    int updateUser(User user);

    /**
     * 根据某一项查询
     */
    List<User> getUserByCondition(User user);

    List<User> findUserByCondition(User user);


}
