package com.fengze.mybatis.domain;

import lombok.Data;

/**
 * Created by ASUS on 2017/4/12.
 */
@Data
public class ProductDetailDo extends ProductDo {
    private String detId;
    private String detLength;
    private String detWidth;
    private String detHeight;
    private String detMate;//质地
    private String detAddr;//产地
    private String detDate;//生产日期
    private String detDesc;
}
