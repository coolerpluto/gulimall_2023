package com.fan.order.dao;

import com.fan.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-08 22:49:49
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
