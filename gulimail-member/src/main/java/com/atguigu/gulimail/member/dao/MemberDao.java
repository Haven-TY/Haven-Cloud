package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Haven
 * @email haven64641202@163.com
 * @date 2020-06-12 17:31:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
