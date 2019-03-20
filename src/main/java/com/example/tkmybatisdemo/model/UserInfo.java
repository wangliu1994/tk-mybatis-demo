package com.example.tkmybatisdemo.model;

import javax.persistence.*;

/**
 * @author : winnie
 * @date : 2019/1/25
 * @desc
 */
@Table(name = "user")
public class UserInfo {
    /**
     * GeneratedValue 的参数设置，默认是可以不加参数的，但是如果数据库控制主键自增(auto_increment), 不加参数就会报错。
     * GeneratedValue注解的strategy属性提供四种值：
     * -AUTO主键由程序控制, 是默认选项 ,不设置就是这个
     * -IDENTITY 主键由数据库生成, 采用数据库自增长, Oracle不支持这种方式
     * -SEQUENCE 通过数据库的序列产生主键, MYSQL  不支持
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "address")
    private String address;

    @Column(name = "job")
    private String job;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
