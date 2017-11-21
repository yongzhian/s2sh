package cn.zain.dao;

import cn.zain.model.po.SysNode;
import cn.zain.model.po.SysRole;
import cn.zain.model.po.SysUser;

import java.util.List;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */
public interface SysRoleDao {

    /**
     * 功能说明 ：查询所有的用户角色
     * @return
     */
    List<SysRole> list();
}
