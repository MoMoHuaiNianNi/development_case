package com.spc.userservice.controller;


import com.spc.commons.entity.User;
import com.spc.commons.service.UserService;
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
@RequestMapping("/userService")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getList")
    public List getList() {
        List<User> list = userService.list(null);
        return list;
    }

}

