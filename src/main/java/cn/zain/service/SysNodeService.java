package cn.zain.service;

import cn.zain.model.po.SysNode;

import java.util.List;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 *
 * @author Zain
 */
public interface SysNodeService {
    /**
     * 功能说明 ：根据节点id查询节点信息
     *
     * @param sysNodeId
     * @return
     */
    SysNode getSysNodeById(Long sysNodeId);

    /**
     * 功能说明 ：查询所有的用户角色
     * @return
     */
    List<SysNode> list();
}
