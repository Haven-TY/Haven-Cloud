package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Haven
 * @email haven64641202@163.com
 * @date 2020-06-12 13:23:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
