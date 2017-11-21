package cn.zain.service;

import cn.zain.model.po.SysUser;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */
public interface SysUserService {

    /**
     * 功能说明 ：根据系统用户id查询用户信息
     *
     * @param sysUserId
     * @return
     */
    SysUser getSysUserById(Long sysUserId);

    /**
     * 功能说明 ：根据用户姓名查询用户信息
     *
     * @param username
     * @return
     */
    SysUser getSysUserByUsername(String username);
}
