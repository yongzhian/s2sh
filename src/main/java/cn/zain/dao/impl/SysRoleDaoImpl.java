package cn.zain.dao.impl;

import cn.zain.dao.SysRoleDao;
import cn.zain.dao.base.TemplateDaoImpl;
import cn.zain.model.po.SysNode;
import cn.zain.model.po.SysRole;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 *
 * @author Zain
 */
@Repository
public class SysRoleDaoImpl extends TemplateDaoImpl implements SysRoleDao {
    private Logger logger = LogManager.getLogger(SysRoleDaoImpl.class);


    @Override
    public List<SysRole> list() {
        return (List<SysRole>) getHibernateTemplate().find("from cn.zain.model.po.SysRole");
    }
}
