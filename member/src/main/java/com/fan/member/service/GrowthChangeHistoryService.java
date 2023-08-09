package com.fan.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fan.common.utils.PageUtils;
import com.fan.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:25:28
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

