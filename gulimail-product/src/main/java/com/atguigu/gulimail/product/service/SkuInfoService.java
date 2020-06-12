package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author Haven
 * @email haven64641202@163.com
 * @date 2020-06-12 13:23:01
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

