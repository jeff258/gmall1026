package com.cyb.gmall.gmalluser.mapper;

import com.cyb.gmall.gmalluser.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

/**
 * Created by cyb on 2019/10/27 10:27
 */

public interface UserMapper  extends Mapper<UmsMember> {
    int getusernum();

    List<UmsMember> selectAllUser();
}
