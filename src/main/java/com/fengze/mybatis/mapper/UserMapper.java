package com.fengze.mybatis.mapper;

import com.fengze.mybatis.domain.User;
import com.fengze.mybatis.domain.UserDo;

import java.util.List;

/**
 * Created by zhangls on 2016/11/16 0016.
 */
public interface UserMapper {

    public UserDo findUserById(Integer id) throws Exception;

    public Integer insert(User user) throws Exception;

    public Integer deleteById(Integer id) throws Exception;

    public Integer updateById(User user) throws Exception;


    /**
     * ��������
     * @param user
     * @return
     * @throws Exception
     */
    public Integer updateBatchId(List<User> user) throws Exception;

    public List<User> queryBatchId(List<User> ids) throws Exception;

    public List<UserDo> queryBatchIds(UserDo ids) throws Exception;
}
