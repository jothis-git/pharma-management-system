package com.Basic.Entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column
    private String userName;

    @Column
    private Integer age;

    @OneToMany(mappedBy = "user")
    private List<order> orders;

    public User() {
    }

    public User(Integer userId, String userName, Integer age, List<order> orders) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.orders = orders;
    }

    public User(String userName, Integer age, List<order> orders) {
        this.userName = userName;
        this.age = age;
        this.orders = orders;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<order> getOrders() {
        return orders;
    }

    public void setOrders(List<order> orders) {
        this.orders = orders;
    }
}