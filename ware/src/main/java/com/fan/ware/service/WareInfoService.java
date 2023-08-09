package com.fan.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fan.common.utils.PageUtils;
import com.fan.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:27:15
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

