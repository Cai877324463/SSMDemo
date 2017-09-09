package org.lanqiao.bean;

/**
 * Created by 卢勇全 on 2017/9/2.
 */
public class RtnObj {
    private User user;
    private String message;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RtnObj{" +
                "user=" + user +
                ", message='" + message + '\'' +
                '}';
    }
}
