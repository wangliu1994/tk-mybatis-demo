package com.example.tkmybatisdemo.mapper;

import com.example.tkmybatisdemo.model.UserInfo;
import com.example.tkmybatisdemo.model.UserScoreInfo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/1/25
 * @desc
 */
@Repository
public interface UserMapper extends Mapper<UserInfo> {

    //自己实现的级联查询
    UserScoreInfo getUserInfo(Long id);
}
