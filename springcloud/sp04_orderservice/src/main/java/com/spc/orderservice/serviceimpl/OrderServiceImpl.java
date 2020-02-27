package com.spc.orderservice.serviceimpl;

import com.spc.commons.entity.Order;
import com.spc.orderservice.mapper.OrderMapper;
import com.spc.commons.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 袁忠贵
 * @since 2020-02-27
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
