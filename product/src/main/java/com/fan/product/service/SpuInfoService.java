package com.fan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fan.common.utils.PageUtils;
import com.fan.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:21:31
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

