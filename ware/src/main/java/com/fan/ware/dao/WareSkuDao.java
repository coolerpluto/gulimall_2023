package com.fan.ware.dao;

import com.fan.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:27:15
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
