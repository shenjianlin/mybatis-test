package com.fengze.mybatis.domain;

import com.fengze.mybatis.common.BaseDo;
import lombok.Data;

/**
 * Created by ASUS on 2017/4/12.
 */
@Data
public class User extends BaseDo{

    private String userName;
    private String password;
    private String realName;
    private String email;
    private String address;
    private String cellPhone;
    private String userType;


}