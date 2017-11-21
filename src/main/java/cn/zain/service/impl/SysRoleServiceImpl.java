package cn.zain.service.impl;

import cn.zain.dao.SysRoleDao;
import cn.zain.model.po.SysRole;
import cn.zain.service.SysRoleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    private Logger logger = LogManager.getLogger(SysRoleServiceImpl.class);

    @Resource
    private SysRoleDao sysRoleDao;

    @Override
    public List<SysRole> list() {
        return sysRoleDao.list();
    }
}
