package com.slx.gware.mapper;

import com.slx.gware.bean.WareInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @param
 * @return
 */
public interface WareInfoMapper extends Mapper<WareInfo> {


    List<WareInfo> selectWareInfoBySkuid(String skuid);



}
