package com.md.mysqldao.mybatis.sso.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.md.mysqldao.mybatis.sso.entity.UserInfo;
import com.md.mysqldao.mybatis.sso.mapper.UserInfoMapper;
import com.md.mysqldao.mybatis.sso.service.IUserInfoService;
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
public class UserInfoInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
