package com.cosmetic.controller;

import com.cosmetic.mybatis.domain.Address;
import com.cosmetic.mybatis.domain.BaseDomain;
import com.cosmetic.mybatis.domain.User;
import com.cosmetic.mybatis.service.IAddressService;
import com.cosmetic.mybatis.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijun on 2016/10/25.
 */
@Controller
public class IndexController {
    @Resource
    private IUserService userService;

    @Resource
    private IAddressService addressService;

    @RequestMapping(value = {"", "index"})
    public String getTest(){
        return "index";
    }

    @RequestMapping(value = "test")
    @ResponseBody
    public List<BaseDomain> test(){
        List<BaseDomain> datas = new ArrayList();
        User user = userService.selectByPrimaryKey(1l);
        Address address = addressService.selectByPrimaryKey(1l);
        datas.add(user);
        datas.add(address);
        return datas;
    }

    @RequestMapping(value = "test/add")
    @ResponseBody
    public int testAdd(){
        User user = new User();
        user.setAge(34);
        user.setUserName("lijun");
        int result = userService.insert(user);
        return result;
    }
}
