package com.example.tkmybatisdemo.controller;

import com.example.tkmybatisdemo.model.Response;
import com.example.tkmybatisdemo.model.UserInfo;
import com.example.tkmybatisdemo.model.UserScoreInfo;
import com.example.tkmybatisdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/1/24
 * @desc
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;


    @GetMapping("/getUser")
    @ApiOperation(value = "查询User",notes = "查询User")
    public Response<List<UserInfo>> getUserInfo() {
        Response<List<UserInfo>> response = new Response<>();
        response.setData(service.getUserInfo());
        response.setCode("0");
        response.setMsg("查询成功");
        return response;
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public Response<UserInfo> getUserInfo(int id) {
        Response<UserInfo> response = new Response<>();
        response.setData(service.getUserInfo(id));
        response.setCode("0");
        response.setMsg("查询成功");
        return response;
    }

    @RequestMapping(value = "/getUserScoreById", method = RequestMethod.GET)
    public Response<UserScoreInfo> getUserScoreInfo(Long id) {
        Response<UserScoreInfo> response = new Response<>();
        response.setData(service.getUserScoreInfo(id));
        response.setCode("0");
        response.setMsg("查询成功");
        return response;
    }


    @RequestMapping("/addUserName")
    public Response<UserInfo> addUser(String userName) {
        UserInfo user = new UserInfo();
        user.setName(userName);
        return addUser(user);
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ApiOperation(value = "新增User",notes = "新增User，传入User全量参数")
    public Response<UserInfo> addUserInfo(@RequestBody UserInfo user) {
        return addUser(user);
    }

    private Response<UserInfo> addUser(UserInfo user) {
        Response<UserInfo> response = new Response<>();
        int result = service.addUserInfo(user);
        if (result > 0) {
            response.setData(user);
            response.setCode("0");
            response.setMsg("添加成功");
        } else {
            response.setCode("0");
            response.setMsg("添加失败");
        }
        return response;
    }
}
