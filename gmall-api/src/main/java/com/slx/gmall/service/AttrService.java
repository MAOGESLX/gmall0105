package com.slx.gmall.service;


import com.slx.gmall.bean.PmsBaseAttrInfo;
import com.slx.gmall.bean.PmsBaseAttrValue;
import com.slx.gmall.bean.PmsBaseSaleAttr;

import java.util.List;


public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);


    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
