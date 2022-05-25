package com.itheima.reggie.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Orders;

/**
 * 订单表(Orders)表服务接口
 *
 * @author makejava
 * @since 2022-05-23 14:56:05
 */
public interface OrdersService extends IService<Orders> {

     R<String> submit(Orders orders);
}

