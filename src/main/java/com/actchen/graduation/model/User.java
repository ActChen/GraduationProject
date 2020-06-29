package com.actchen.graduation.model;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 4:41 下午
 */
public class User {

    private String userId;

    private String name;

    private String phone;

    private String time;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
