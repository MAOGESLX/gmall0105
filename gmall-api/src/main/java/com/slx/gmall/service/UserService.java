package com.slx.gmall.service;


import com.slx.gmall.bean.UmsMember;
import com.slx.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
