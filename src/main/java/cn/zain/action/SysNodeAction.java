package cn.zain.action;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */

import cn.zain.action.base.BaseAction;
import cn.zain.model.po.SysNode;
import cn.zain.service.SysNodeService;
import com.opensymphony.xwork2.ModelDriven;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * Created by Zain 2016/9/7 .
 * @author Zain
 */
public class SysNodeAction extends BaseAction implements ModelDriven {
    @Resource
    private SysNodeService sysNodeService;
    private SysNode sysNode;

    /**
     * 功能说明 ：节点列表
     *
     * @return
     * @author Zain 2016/9/14 15:02
     * @params
     */
    public String list() {
        logger.debug("查询用户节点列表...");
        return SUCCESS;
    }

    @Override
    public Object getModel() {
        if (null == sysNode) {
            sysNode = new SysNode();
        }
        return sysNode;
    }

    public SysNode getSysNode() {
        return sysNode;
    }
}
