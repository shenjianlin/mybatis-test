package com.fengze.mybatis.mapper;


import com.fengze.mybatis.domain.ProDetailDo;

import java.util.List;

/**
 * Created by Administrator on 2016-12-03.
 */
public interface ProDetailMapper {

    public ProDetailDo findByIdProDet(Integer id) throws Exception;


    public List<ProDetailDo> queryProDetail() throws Exception;
}
