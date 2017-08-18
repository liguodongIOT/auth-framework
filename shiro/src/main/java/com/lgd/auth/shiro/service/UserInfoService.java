package com.lgd.auth.shiro.service;


import com.lgd.auth.shiro.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}