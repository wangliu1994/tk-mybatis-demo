package com.example.tkmybatisdemo.controller;

import com.example.tkmybatisdemo.model.Response;
import com.example.tkmybatisdemo.model.Score;
import com.example.tkmybatisdemo.model.UserInfo;
import com.example.tkmybatisdemo.service.ScoreService;
import com.example.tkmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/1/24
 * @desc
 */
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    ScoreService service;

    @GetMapping("/getScore")
    public Response<List<Score>> getUserInfo() {
        Response<List<Score>> response = new Response<>();
        response.setData(service.getScoreInfo());
        response.setCode("0");
        response.setMsg("查询成功");
        return response;
    }

    @RequestMapping("/getScoreById")
    public Response<List<Score>> getUserInfo(Long id) {
        Response<List<Score>> response = new Response<>();
        response.setData(service.getScoreBySid(id));
        response.setCode("0");
        response.setMsg("查询成功");
        return response;
    }
}
