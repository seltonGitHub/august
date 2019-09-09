package org.itszt.newappprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.itszt.entity.Goods;
import org.itszt.inters.IGoodsService;

@Service(version = "2.0")
public class GoodsServiceImpl implements IGoodsService {
    @Override
    public Goods getGoods() {
        System.out.println("GoodsServiceImpl.getGoods");
        return null;
    }
}
