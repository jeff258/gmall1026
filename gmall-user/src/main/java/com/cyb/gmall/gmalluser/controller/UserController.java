package com.cyb.gmall.gmalluser.controller;

import com.cyb.gmall.gmalluser.bean.UmsMember;

import com.cyb.gmall.gmalluser.service.iml.UserServiceIml;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by cyb on 2019/10/27 10:26
 */

@Controller
@Api(value = "会员管理")
public class UserController {
    @Autowired
    UserServiceIml userServiceIml;

   @GetMapping ("test01")
   @ResponseBody
   @ApiOperation(value = "测试")
      public List<UmsMember> test01(){
      int i=userServiceIml.getusernum();
       UmsMember msCompanyAddress=new UmsMember();
       List<UmsMember> userlist=userServiceIml.getAllUser();
       System.out.println(i);
        return userlist;
    }
}
