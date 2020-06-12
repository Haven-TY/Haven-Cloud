package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Haven
 * @email haven64641202@163.com
 * @date 2020-06-12 18:35:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
