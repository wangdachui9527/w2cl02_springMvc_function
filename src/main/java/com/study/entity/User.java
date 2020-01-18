package com.study.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Authror 卫骏
 * @Date 2019/11/29 17:05
 */
public class User implements Serializable {

    private String uname;
    private Integer age;
    private Date birthday;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
