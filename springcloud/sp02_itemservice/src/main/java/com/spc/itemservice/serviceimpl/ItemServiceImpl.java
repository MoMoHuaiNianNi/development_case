package com.spc.itemservice.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spc.commons.entity.Item;
import com.spc.itemservice.mapper.ItemMapper;
import com.spc.commons.service.ItemService;
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
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {

}
