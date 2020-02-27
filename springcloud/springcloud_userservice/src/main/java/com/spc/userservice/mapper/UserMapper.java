package com.spc.userservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spc.commons.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author 袁忠贵
 * @since 2020-02-27
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}