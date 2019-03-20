package com.example.tkmybatisdemo.service;

import com.example.tkmybatisdemo.mapper.ScoreMapper;
import com.example.tkmybatisdemo.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Objects;

/**
 * @author : winnie
 * @date : 2019/1/25
 * @desc
 */
@Service
public class ScoreService{
    @Autowired
    ScoreMapper mapper;

    public List<Score> getScoreInfo() {
        return mapper.selectByExample(null);
    }

    public List<Score> getScoreBySid(Long id) {
        Score score = new Score();
        score.setSid(id);
        Example example = new Example(Score.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo(score);
        return mapper.selectByExample(example);
    }

    public List<Score> getScoreBySid1(Long id) {
        Example example = new Example(Score.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("sid", id);
        return mapper.selectByExample(example);
    }
}
