package cn.zain.dao.impl;

import cn.zain.dao.SysNodeDao;
import cn.zain.dao.base.TemplateDaoImpl;
import cn.zain.model.po.SysNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 * @author Zain
 */
@Repository
public class SysNodeDaoImpl extends TemplateDaoImpl implements SysNodeDao {
    private Logger logger = LogManager.getLogger(SysNodeDaoImpl.class);

    @Override
    @Transactional
    public SysNode getSysNodeById(Long sysNodeId) {
        return null;
    }

}
