package com.fengze.mybatis.mapper;

import com.fengze.mybatis.domain.OrderDo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 2017/4/12.
 */
@Slf4j
public class OrderMapperTest {


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
    public void testQueryOrder() throws Exception {

        OrderMapper mapper = session.getMapper(OrderMapper.class);

        List<OrderDo> ls = mapper.queryOrder();

        log.info("ls :{}", ls);
    }
}