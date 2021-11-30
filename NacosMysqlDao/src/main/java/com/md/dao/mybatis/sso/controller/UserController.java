package com.md.dao.mybatis.sso.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.md.dao.mybatis.sso.entity.UserInfo;
import com.md.dao.mybatis.sso.mapper.UserInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author md
 * @since 2021-10-30
 */
@Slf4j
@RestController
public class UserController {
    @Resource
    private UserInfoMapper userInfoMapper;

    @GetMapping(value = "/mysql/sso/user/name", produces = {"application/json;charset=UTF-8"})
    public List<String> getAllUserName() {
        log.info("进入MysqlDAO,查询用户账号密码");
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("USER_NAME");
        List<UserInfo> userList = userInfoMapper.selectList(null);
        List<String> namelist = (List<String>) ((Object) userInfoMapper.selectObjs(queryWrapper));
        return namelist;
    }
    @PostMapping(value = "/mysql/sso/user/check", produces = {"application/json;charset=UTF-8"})
    public boolean checkUserName(@RequestParam("username")String username,@RequestParam("password")String password) {
        log.info("进入MysqlDAO,检测用户账号密码");
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("USER_NAME").eq("USER_NAME",username).eq("PASSWORD",password);
        int count = userInfoMapper.selectCount(queryWrapper);
        if(count==1){
            return true;
        }else {
            return false;
        }
    }
}
