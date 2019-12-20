package com.yyl.api;

import com.yyl.object.User;

import java.util.List;

/**
 * Created by admin on 2019/12/18.
 */
public interface IUserService {

    int saveUser(User user);

    List<User> selectUserAll();
}
