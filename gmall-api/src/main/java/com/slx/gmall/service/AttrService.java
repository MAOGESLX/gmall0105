package com.slx.gmall.service;


import com.slx.gmall.bean.PmsBaseAttrInfo;

import java.util.List;


public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
}
