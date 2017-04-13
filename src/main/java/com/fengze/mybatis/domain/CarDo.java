package com.fengze.mybatis.domain;

import lombok.Data;

/**
 * Created by ASUS on 2017/4/12.
 * 购物车模型类
 * Created by zhangls on 2016/11/3 0003.
 */
@Data
public class CarDo extends BaseDo {
    private Integer userId;
    private Integer prodId;
    private String proSize;
    private String proColor;
    private Integer proNum;
    private Double proPrice;
    private Double talPrice;

    //引用Java bin
    private ProductDo pro;


}
