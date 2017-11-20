package cn.zain.dao.impl;

import cn.zain.dao.SysUserDao;
import cn.zain.dao.base.TemplateDaoImpl;
import cn.zain.model.po.SysUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 *
 * @author Zain
 */
@Repository
public class SysUserDaoImpl extends TemplateDaoImpl implements SysUserDao {
    private static final Logger logger = LogManager.getLogger(SysUserDaoImpl.class);

    @Override
    public SysUser getSysUserById(Long sysUserId) {
        return new SysUser();
    }

    @Override
    public SysUser getSysUserByUsername(String username) {
        List<SysUser> list = (List<SysUser>) getHibernateTemplate().find("from cn.zain.model.po.SysUser", username);
        if (null != list && list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

}
