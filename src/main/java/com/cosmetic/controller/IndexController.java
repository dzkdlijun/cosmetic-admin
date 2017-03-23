package com.cosmetic.controller;

import com.cosmetic.mybatis.dao.UserMapper;
import com.cosmetic.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by lijun on 2016/10/25.
 */
@Controller
public class IndexController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = {"", "index"})
    public String getTest(){
        return "index";
    }

    @RequestMapping(value = "test")
    @ResponseBody
    public User test(){
        User user = userMapper.selectByPrimaryKey(1l);
        return user;
    }
}
