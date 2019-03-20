package com.example.tkmybatisdemo.model;

import javax.persistence.*;

/**
 * @author : winnie
 * @date : 2019/1/25
 * @desc
 */
@Table(name = "score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    @Column(name = "id")
    private Long id;

    @Column(name = "sid")
    private Long sid;

    @Column(name = "math_score")
    private Double mathScore;

    @Column(name = "eng_score")
    private Double engScore;

    @Column(name = "che_score")
    private Double cheScore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
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
