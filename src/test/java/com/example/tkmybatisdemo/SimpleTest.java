package com.example.tkmybatisdemo;

import com.example.tkmybatisdemo.mapper.UserMapper;
import com.example.tkmybatisdemo.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author : winnie
 * @date : 2019/1/25
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TkMybatisDemoApplication.class)
public class SimpleTest {
    @Autowired
    private UserMapper userDao;

    @Test
    public void testSelect() throws Exception {
        List<UserInfo> productList = userDao.selectAll();
        assertEquals(true, productList.size() > 0);
    }
}
