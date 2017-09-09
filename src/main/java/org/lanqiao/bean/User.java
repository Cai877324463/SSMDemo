package org.lanqiao.bean;

/**
 * Created by 卢勇全 on 2017/8/30.
 */
public class User {
    private Integer userid;
    private  String username;
    private String userpassword;
    private Integer usersex;

    public User(Integer userid, String username, String userpassword, Integer usersex) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.usersex = usersex;
    }

    public User() {
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", usersex=" + usersex +
                '}';
    }
}
