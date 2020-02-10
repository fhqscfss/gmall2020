package com.fhqscfss.gmall.user.service.impl;

import com.fhqscfss.gmall.user.mapper.UserMapper;
import com.fhqscfss.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Mifanxiaobai
 * @create: 2020-02-10 13:46
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
