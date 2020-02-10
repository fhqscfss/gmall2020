package com.fhqscfss.gmall.user.mapper;

import com.fhqscfss.gmall.user.model.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author: Mifanxiaobai
 * @create: 2020-02-10 13:45
 **/
public interface UserMapper extends Mapper<User>{
    List<User> selectAllUser();
}

