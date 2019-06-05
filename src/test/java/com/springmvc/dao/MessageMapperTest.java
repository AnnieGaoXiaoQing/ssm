package com.springmvc.dao;

import com.springmvc.entity.Message;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class MessageMapperTest {


    private ApplicationContext applicationContext;

    @Autowired
    private MessageMapper messageMapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 导入需要测试的
        messageMapper = applicationContext.getBean(MessageMapper.class);
    }

    @Test
    public void insert() {
        Message message = new Message();
        message.setId(3);
        message.setCommand("吃饭");
        message.setContent("睡觉");
        message.setDescription("打豆豆");
        int result = messageMapper.insert(message);
        System.out.println("result = " + result);
        assert(result == 1);
    }
}