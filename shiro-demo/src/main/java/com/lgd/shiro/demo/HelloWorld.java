package com.lgd.shiro.demo;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
/**
 * Describe: 1
 *
 *
 * author: guodong.li
 * datetime: 2017/8/19 11:41
 */
public class HelloWorld {

    public static void main(String[] args) {
        // 读取配置文件，初始化SecurityManager工厂
        Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro.ini");
        // 获取securityManager实例
        SecurityManager securityManager=factory.getInstance();
        // 把securityManager实例绑定到SecurityUtils
        SecurityUtils.setSecurityManager(securityManager);

        // 得到当前执行的用户
        Subject currentUser=SecurityUtils.getSubject();

        // 创建token令牌，用户名/密码
        UsernamePasswordToken token=new UsernamePasswordToken("zhang", "123");
        try{
            // 身份认证
            currentUser.login(token);
            System.out.println("身份认证成功！");
        }catch(AuthenticationException e){
            //e.printStackTrace();
            System.out.println("身份认证失败！");
        }
        System.out.println("-------Session:"+currentUser.getSession().getId());
        // 退出
        currentUser.logout();
    }

}
