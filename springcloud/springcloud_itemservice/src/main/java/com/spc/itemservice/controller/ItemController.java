package com.spc.itemservice.controller;


import com.spc.commons.entity.Item;
import com.spc.commons.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author 袁忠贵
 * @since 2020-02-27
 */
@RestController
@RequestMapping("/itemService")
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * 查询所有商品记录
     */
    @RequestMapping("getList")
    public List getList() {
        List<Item> list = itemService.list(null);
        return list;
    }

}

