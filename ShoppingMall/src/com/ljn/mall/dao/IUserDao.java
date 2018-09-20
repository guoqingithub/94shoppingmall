package com.ljn.mall.dao;

import java.util.List;

import com.ljn.mall.domain.User;

public interface IUserDao {
    int deleteById(String uid);			//根据id删除用户
    int insert(User user);				//添加用户
    User selectById(String uid);		//根据id查找用户
    List<User> selectAll();				//查询所有用户
    int update(User user);				//修改用户信息
    User active(String code);           //用户激活
    User selectLogin(User user);		//用户登录
}