package cn.zain.base;

import cn.zain.model.po.SysUser;
import org.junit.Test;
import org.slf4j.LoggerFactory;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */
public class BasicJdk {
    protected static final org.slf4j.Logger logger = LoggerFactory.getLogger(BasicJdk.class);

    /**
     * 功能说明 ：todo
     *
     * @return
     * @author Zain 2016/9/8 13:54
     * @params
     */
    @Test
    public void stringTest() throws Exception {
        System.out.println("ok");
        logger.debug("debbbbb");
        Object o = null;
        SysUser sysUser = new SysUser();
        sysUser.setFullName("tt");
        logger.trace("just test");
        logger.error("yz");
        logger.info("value Of sysUser:" + String.valueOf(sysUser));
//        logger.info(" null:" + String.valueOf(null));// null不能作为对象进行传递
        logger.info("value Of null:" + String.valueOf(o)); //对象可以传递null
    }
}
