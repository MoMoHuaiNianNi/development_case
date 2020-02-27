package com.spc.orderservice.mapper;

import com.spc.commons.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 袁忠贵
 * @since 2020-02-27
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
