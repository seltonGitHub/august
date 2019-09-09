package org.itszt.appdubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.itszt.entity.Goods;
import org.itszt.inters.IGoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Reference(version = "2.0")
    private IGoodsService goodsService;

    @GetMapping("goods")
    public Goods getGoods() {
        return goodsService.getGoods();
    }
}
