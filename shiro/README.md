

### springboot整合shiro-登录认证和权限管理 
http://blog.csdn.net/ityouknow/article/details/73836159

http://www.vxzsk.com/769.html



测试

1、编写好后就可以启动程序，访问index页面，由于没有登录就会跳转到login页面。
登录之后就会跳转到index页面，登录后，有直接在浏览器中输入index页面访问，又会跳转到login页面。
上面这些操作时候触发MyShiroRealm.doGetAuthenticationInfo()这个方法，也就是登录认证的方法。

2、登录admin账户，访问：http://127.0.0.1:8080/userInfo/userAdd显示用户添加界面，
访问http://127.0.0.1:8080/userInfo/userDel显示403没有权限。
上面这些操作时候触发MyShiroRealm.doGetAuthorizationInfo()这个方面，也就是权限校验的方法。

3、修改admin不同的权限进行测试

shiro很强大，这仅仅是完成了登录认证和权限管理这两个功能，更多内容以后有时间再做探讨。

```
http://localhost:8080/login
http://localhost:8080/index


http://127.0.0.1:8080/userInfo/userList
http://127.0.0.1:8080/userInfo/userAdd
http://127.0.0.1:8080/userInfo/userDel
```




```
https://github.com/leelance/spring-boot-all

---
http://blog.h5min.cn/zjcjava/article/details/71606144
https://github.com/BambooZhang/springboot-study
---



```


