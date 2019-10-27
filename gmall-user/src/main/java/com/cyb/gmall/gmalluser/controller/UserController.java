package com.cyb.gmall.gmalluser.controller;

import com.cyb.gmall.gmalluser.service.UserService;
import com.cyb.gmall.gmalluser.service.iml.UserServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cyb on 2019/10/27 10:26
 */

@Controller
public class UserController {
    @Autowired
    UserServiceIml userServiceIml;

   @RequestMapping("test01")
   @ResponseBody
    public String test01(){
   int i=userServiceIml.getusernum();
       System.out.println(i);
        return "hello";
    }
}
