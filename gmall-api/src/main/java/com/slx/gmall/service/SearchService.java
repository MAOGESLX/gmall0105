package com.slx.gmall.service;

import com.slx.gmall.bean.PmsSearchParam;
import com.slx.gmall.bean.PmsSearchSkuInfo;

import java.util.List;

public interface SearchService {
    List<PmsSearchSkuInfo> list(PmsSearchParam pmsSearchParam);
}
