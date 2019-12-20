package com.yyl.Service;

import com.yyl.api.IUserService;
import com.yyl.object.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2019/12/18.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public int saveUser(User user) {
        return 0;
    }

    @Override
    public List<User> selectUserAll() {
        return null;
    }
}
