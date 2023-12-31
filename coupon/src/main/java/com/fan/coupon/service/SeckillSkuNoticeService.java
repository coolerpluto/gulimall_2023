package com.fan.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fan.common.utils.PageUtils;
import com.fan.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:23:41
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

