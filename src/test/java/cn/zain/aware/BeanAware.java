package cn.zain.aware;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.Charset;


/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */
@Component
@Configuration
@ComponentScan("cn.zain.aware")
public class BeanAware implements BeanNameAware, ResourceLoaderAware {

    private Logger logger = LoggerFactory.getLogger(BeanAware.class);

    private String beanName;
    private ResourceLoader loader;

    public void outputResult() {
        logger.info("bean 名称:{}",beanName);
        Resource resource = loader.getResource("classpath:test.txt");
        try {
            logger.info("加载文件:{}", IOUtils.toString(resource.getInputStream(), Charset.defaultCharset()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public String getBeanName() {
        return beanName;
    }

    public ResourceLoader getLoader() {
        return loader;
    }
}

