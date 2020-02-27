package com.spc.orderservice.controller;


import com.spc.commons.entity.Order;
import com.spc.commons.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 袁忠贵
 * @since 2020-02-27
 */
@RestController
@RequestMapping("/orderService")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("getList")
    public List getList() {
        List<Order> list = orderService.list(null);
        return list;
    }

}

