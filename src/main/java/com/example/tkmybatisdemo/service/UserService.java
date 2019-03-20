package com.example.tkmybatisdemo.service;

import com.example.tkmybatisdemo.mapper.UserMapper;
import com.example.tkmybatisdemo.model.UserInfo;
import com.example.tkmybatisdemo.model.UserScoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/1/24
 * @desc
 */
@Service
public class UserService {
    @Autowired
    UserMapper mapper;

    public List<UserInfo> getUserInfo() {
        return mapper.selectByExample(null);
    }

    public UserScoreInfo getUserScoreInfo(Long id) {
        return mapper.getUserInfo(id);
    }

    public UserInfo getUserInfo(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    public int addUserInfo(UserInfo user) {
       return mapper.insert(user);
    }
}
