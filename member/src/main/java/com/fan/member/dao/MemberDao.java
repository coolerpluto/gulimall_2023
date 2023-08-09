package com.fan.member.dao;

import com.fan.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-08-09 20:25:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
