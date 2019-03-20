package com.example.tkmybatisdemo.model;

import javax.persistence.Column;

/**
 * @author : winnie
 * @date : 2019/1/25
 * @desc
 */
public class UserScoreInfo {
    private String name;
    private Integer age;
    private String address;
    private String job;
    private Double mathScore;
    private Double engScore;
    private Double cheScore;

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

    public Double getMathScore() {
        return mathScore;
    }

    public void setMathScore(Double mathScore) {
        this.mathScore = mathScore;
    }

    public Double getEngScore() {
        return engScore;
    }

    public void setEngScore(Double engScore) {
        this.engScore = engScore;
    }

    public Double getCheScore() {
        return cheScore;
    }

    public void setCheScore(Double cheScore) {
        this.cheScore = cheScore;
    }
}
