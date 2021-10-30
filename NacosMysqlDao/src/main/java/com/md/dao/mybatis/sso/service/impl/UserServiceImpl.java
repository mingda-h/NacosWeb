package com.md.dao.mybatis.sso.service.impl;

import com.md.dao.mybatis.sso.entity.User;
import com.md.dao.mybatis.sso.mapper.UserMapper;
import com.md.dao.mybatis.sso.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author md
 * @since 2021-10-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
