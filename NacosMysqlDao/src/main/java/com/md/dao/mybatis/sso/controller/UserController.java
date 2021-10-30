package com.md.dao.mybatis.sso.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.md.dao.mybatis.sso.entity.User;
import com.md.dao.mybatis.sso.mapper.UserMapper;
import com.md.dao.util.USER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author md
 * @since 2021-10-30
 */
@Controller
@RequestMapping("/sso/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    public List<String> getAllUser(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("userName");
        List<String> nanelist = (List<String>) ((Object) userMapper.selectObjs(queryWrapper));
        return nanelist;
    }
}
