package com.fan.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fan.common.utils.PageUtils;
import com.fan.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:23:41
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

