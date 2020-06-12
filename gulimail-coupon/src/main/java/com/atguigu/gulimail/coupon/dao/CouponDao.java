package com.atguigu.gulimail.coupon.dao;

import com.atguigu.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Haven
 * @email haven64641202@163.com
 * @date 2020-06-12 17:14:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
