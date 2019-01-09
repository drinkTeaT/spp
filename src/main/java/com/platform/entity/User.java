package com.platform.entity;

import javax.persistence.*;

/**
 * @Author: zwl
 * @Date: 2018/12/24 17:35
 */

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = true, length = 32)
    private Integer id;

    @Column(name = "user_username", nullable = true, length = 32)
    private String userName;

    @Column(name = "user_password", nullable = true, length = 32)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
