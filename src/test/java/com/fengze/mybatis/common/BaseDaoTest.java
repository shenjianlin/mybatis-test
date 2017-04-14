package com.fengze.mybatis.common;

import com.fengze.mybatis.domain.User;
import com.fengze.mybatis.domain.UserDo;
import com.fengze.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 2017/4/12.
 */
@Slf4j
public class BaseDaoTest {

    SqlSessionFactory sqlSessionFactory;
    SqlSession session;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
    }

    @After
    public void tearDown() throws Exception {
        session.close();
    }

    @Test
    public void testInsert() throws Exception {
        UserMapper userMapper = session.getMapper(UserMapper.class);

        User u = new User();
        u.setUserName("账上");
        u.setPassword("dd00000dddddd");
        u.setAddress("ssssssssss");
        u.setCellPhone("12382096456");
        u.setEmail("shen@fdegfd.com");
        u.setRealName("389765432");
        u.setUserType("0");
        u.setState("1006");
        u.setCreateBy("admin");
        u.setCreateDate("2016-10-10");
        u.setUpdateBy("admin");
        u.setUpdateDate("2016-10-10");

        Integer i = userMapper.insert(u);
        session.commit();
        log.info("i{} " , i);
    }

    @Test
    public void testInsertBatch() throws Exception {

    }

    @Test
    public void testDeleteById() throws Exception {
        UserMapper userMapper = session.getMapper(UserMapper.class);
        Integer i = userMapper.deleteById(15);
        session.commit();
        log.info("i{} " , i);
    }

    @Test
    public void testDeleteByCon() throws Exception {

    }

    @Test
    public void testUpdateById() throws Exception {
        UserMapper userMapper = session.getMapper(UserMapper.class);

        User u = new User();
//        u.setId(12);
        u.setUserName("wangwu");
        u.setPassword("pppppppppppppppp");
        u.setAddress("中文");
        u.setUpdateBy("admin");

        Integer i = userMapper.updateById(u);
        session.commit();
        log.info("i{} " , i);
    }

    @Test
    public void testUpdateByCon() throws Exception {

    }

    @Test
    public void testFindOne() throws Exception {

        UserMapper userMapper = session.getMapper(UserMapper.class);

        UserDo user = userMapper.findUserById(1004);

        log.info("user : {}", user);

    }

    @Test
    public void testFindOne1() throws Exception {

    }

    @Test
    public void testFindMany() throws Exception {

    }

    @Test
    public void testTotal() throws Exception {

    }

    @Test
    public void testTotal1() throws Exception {

    }

    @Test
    public void testQueryPage() throws Exception {

    }
}