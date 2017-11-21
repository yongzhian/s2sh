package cn.zain.action;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */

import cn.zain.action.base.BaseAction;
import cn.zain.model.po.SysNode;
import cn.zain.model.po.SysUser;
import cn.zain.service.SysUserService;
import com.opensymphony.xwork2.ModelDriven;

import javax.annotation.Resource;

/**
 * Created by Zain 2016/9/7 .
 *
 * @author Zain
 */

public class SysUserAction extends BaseAction implements ModelDriven {
    @Resource
    private SysUserService sysUserService;
    private SysUser sysUser;

    @Override
    public String execute() throws Exception {
        logger.debug("execute...");
        return SUCCESS;
    }

    /**
     * 功能说明 ： 登录
     *
     * @return
     */
    public String login() {
        logger.debug("用户登录({})...", sysUser);
        if (null == sysUser) {
            return LOGIN;
        }
        SysUser user = sysUserService.getSysUserByUsername(sysUser.getUsername());
        if (null != user && user.getPassword().equals(sysUser.getPassword())) {
            logger.debug("登录成功,");
            request.setAttribute("sysUser", sysUser);
            return SUCCESS;
        }
        return LOGIN;
    }

    /**
     * 功能说明 ：查询用户信息
     *
     * @return
     * @author Zain 2016/9/8 14:58
     * @params
     */
    public String getUserInfo() {
        logger.debug("查询用户信息(getUserInfo)...");

        if (null != sysUser) {
            sysUser = sysUserService.getSysUserByUsername(sysUser.getUsername());
            logger.debug("查询用户成功,{}",sysUser);
        }
        return "json";
    }


    @Override
    public Object getModel() {
        if (request.getParameterMap().containsKey("username") && null == sysUser) {
            if (null == sysUser) {
                sysUser = new SysUser();
                return sysUser;
            }
        }
        return null;
    }

    /**
     * 功能说明：用于页面直接基于模型获取对象
     * 不存在会报错
     * @return
     */
    public SysUser getSysUser() {
        return sysUser;
    }
}
