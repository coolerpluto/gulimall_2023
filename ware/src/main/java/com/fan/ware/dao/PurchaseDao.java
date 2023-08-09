package com.fan.ware.dao;

import com.fan.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:27:15
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
