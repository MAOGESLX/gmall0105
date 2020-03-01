package com.slx.gmall.user.service.impl;


import com.slx.gmall.user.bean.UmsMember;
import com.slx.gmall.user.bean.UmsMemberReceiveAddress;
import com.slx.gmall.user.mapper.UserMapper;
import com.slx.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList=userMapper.selectAll();
        return umsMemberList;
    }
}
