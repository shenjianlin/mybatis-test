package com.fengze.mybatis.mapper;

import com.fengze.mybatis.domain.OrderDo;

import java.util.List;

/**
 * Created by Administrator on 2016-12-03.
 */
public interface OrderMapper {

    public List<OrderDo> queryOrder() throws Exception;
}
