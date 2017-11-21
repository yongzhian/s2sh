package cn.zain.dao.impl;

import cn.zain.dao.SysNodeDao;
import cn.zain.dao.base.TemplateDaoImpl;
import cn.zain.model.po.SysNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 *
 * @author Zain
 */
@Repository
public class SysNodeDaoImpl extends TemplateDaoImpl implements SysNodeDao {
    private Logger logger = LogManager.getLogger(SysNodeDaoImpl.class);

    @Override
    public SysNode getSysNodeById(Long sysNodeId) {
        return getHibernateTemplate().get(SysNode.class, sysNodeId);
    }

    @Override
    public List<SysNode> list() {
        return (List<SysNode>) getHibernateTemplate().find("from cn.zain.model.po.SysNode");
    }

}
