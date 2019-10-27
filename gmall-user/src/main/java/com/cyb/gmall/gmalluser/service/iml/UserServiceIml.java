package com.cyb.gmall.gmalluser.service.iml;

import com.cyb.gmall.gmalluser.mapper.UserMapper;
import com.cyb.gmall.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cyb on 2019/10/27 10:28
 */
@Service
public class UserServiceIml implements UserService {
    @Autowired
    UserMapper userMapper;

    public  int getusernum (){
        return userMapper.getusernum();
    };
}
