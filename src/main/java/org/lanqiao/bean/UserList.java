package org.lanqiao.bean;

import java.util.List;

/**
 * Created by 卢勇全 on 2017/9/2.
 */
public class UserList {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "userList{" +
                "userList=" + userList +
                '}';
    }
}
