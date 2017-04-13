package com.fengze.mybatis.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by ASUS on 2017/4/12.
 */
@Data
public class BaseDo implements Serializable {

    private Integer id;

    private String state;

    private String createBy;

    private String createDate;

    private String updateBy;

    private String updateDate;
}
