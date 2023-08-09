package com.fan.coupon.dao;

import com.fan.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:23:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
