package com.chd.springboot;

import com.chd.springboot.bean.person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/*
springboot单元测试
 */

@SpringBootTest
class SpringBoot01HelloworldQuickApplicationTests {
    @Autowired
    com.chd.springboot.bean.person person;
    Logger logger = LoggerFactory.getLogger(getClass());



    @Test
    void contextLoads() {
        //日志的级别，由低到高，级别可以调，只会打印本级和以后的内容
        logger.trace("This is the trace log....");
        logger.debug("this is debug");
        logger.info("this is info log");
        logger.warn("this is warn log");
        logger.error("this is error");





    }

}
