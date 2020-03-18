package com.slx.gmall.user.controller;

import com.slx.gmall.bean.UmsMemberReceiveAddress;
import com.slx.gmall.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class UmsMemberReceiveAddressController {
    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> list=umsMemberReceiveAddressService.getReceiveAddressByMemberId(memberId);
        return list;
    }

}
