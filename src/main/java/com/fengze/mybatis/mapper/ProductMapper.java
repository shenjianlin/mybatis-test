package com.fengze.mybatis.mapper;



import com.fengze.mybatis.domain.ProductDo;

import java.util.List;

/**
 *  Created by ASUS on 2017/4/12
 */
public interface ProductMapper {

    public Integer insertProd(ProductDo productDo) throws Exception;


    public List<ProductDo> queryProdList(ProductDo productDo) throws Exception;


    public Integer queryProdCount(ProductDo productDo) throws Exception;

    public List<ProductDo> queryProDetail() throws Exception;

    public List<ProductDo> queryProDetails() throws Exception;

    public List<ProductDo> queryProDetailsPage() throws Exception;

    public ProductDo findByIdProd(Integer id) throws Exception;

}
