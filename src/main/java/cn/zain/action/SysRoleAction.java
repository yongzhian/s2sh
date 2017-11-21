package cn.zain.action;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */

import cn.zain.action.base.BaseAction;
import cn.zain.model.po.SysNode;
import cn.zain.service.SysNodeService;
import cn.zain.service.SysRoleService;
import org.apache.struts2.convention.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Zain 2016/9/7 .
 *
 * @author Zain
 */
@ParentPackage("project-default")
@Namespace("/sys/role")
@Results({
        @Result(name = "grid", location = "/jsp/sys/sysrole/grid.jsp")
})
@Controller
public class SysRoleAction extends BaseAction {
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 功能说明 ：节点列表
     *
     * @return
     * @author Zain 2016/9/14 15:02
     * @params
     */
    public String list() {
        logger.debug("查询节点列表...");
        request.setAttribute("list", sysRoleService.list());
        return "grid";
    }

}
