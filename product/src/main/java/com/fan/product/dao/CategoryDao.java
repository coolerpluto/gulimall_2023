package com.fan.product.dao;

import com.fan.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:21:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
