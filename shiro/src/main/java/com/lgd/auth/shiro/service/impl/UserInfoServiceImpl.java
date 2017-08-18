package com.lgd.auth.shiro.service.impl;


import com.lgd.auth.shiro.dao.UserInfoDao;
import com.lgd.auth.shiro.entity.UserInfo;
import com.lgd.auth.shiro.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}