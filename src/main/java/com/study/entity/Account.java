package com.study.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Authror 卫骏
 * @Date 2019/11/29 17:05
 */
public class Account implements Serializable {

    private String userName;
    private String password;
    private Double money;

    private List<User> user;

    private Map<String,User> map;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", user=" + user +
                ", map=" + map +
                '}';
    }
}
