package cn.zain.aware;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */
public class AwareTest {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(BeanAware.class);    @Test
    public void awareTest() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanAware.class);
        BeanAware beanAware = context.getBean(BeanAware.class);
        beanAware.outputResult();
        logger.info("...");
    }
}
