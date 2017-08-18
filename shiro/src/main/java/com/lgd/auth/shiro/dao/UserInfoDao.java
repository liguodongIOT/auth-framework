package com.lgd.auth.shiro.dao;


import com.lgd.auth.shiro.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    //public UserInfo findByUsername(@Param("username") String username);
    UserInfo findByUsername(String username);
}