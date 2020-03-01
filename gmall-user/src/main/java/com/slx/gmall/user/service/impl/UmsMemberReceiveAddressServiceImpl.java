package com.slx.gmall.user.service.impl;

import com.slx.gmall.user.bean.UmsMemberReceiveAddress;
import com.slx.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.slx.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress u=new UmsMemberReceiveAddress();
        u.setMemberId(memberId);
        List<UmsMemberReceiveAddress> list=umsMemberReceiveAddressMapper.select(u);
        return list;
    }
}
