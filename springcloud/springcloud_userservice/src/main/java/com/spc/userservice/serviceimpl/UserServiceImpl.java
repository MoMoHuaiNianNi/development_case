package com.spc.userservice.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spc.commons.entity.User;
import com.spc.commons.service.UserService;
import com.spc.userservice.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author 袁忠贵
 * @since 2020-02-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
