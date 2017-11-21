package cn.zain.action;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */

import cn.zain.action.base.BaseAction;
import cn.zain.model.po.SysNode;
import cn.zain.model.po.SysUser;
import cn.zain.service.SysUserService;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.logging.log4j.spi.ExtendedLogger;

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
    private SysNode sysNode;

    @Override
    public String execute() throws Exception {
        logger.debug("execute...");
        ExtendedLogger extendedLogger;
        return SUCCESS;
    }

    /**
     * 功能说明 ： 登录
     * @return
     */
    public String login() {
        logger.debug("用户登录({})...", sysUser);
        if(null == sysUser){
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
        logger.debug("查询用户信息getUserInfo...");
        if (null != sysUser && "haha".equals(sysUser.getUsername())) {
            logger.info("ok");
            sysUser.setFullName("wod");
            request.setAttribute("sysUser", sysUser);
            return SUCCESS;
        }
        return INPUT;
    }


    @Override
    public Object getModel() {
        //如果带有密码参数则是用户po
        if (request.getParameterMap().containsKey("username")) {
            if (null == sysUser) {
                sysUser = new SysUser();
                return sysUser;
            }
        } else { //其他默认为节点po
            if (null == sysNode) {
                sysNode = new SysNode();
                return sysNode;
            }
        }
        return null;
    }

    public SysUser getSysUser() {
        return sysUser;
    }
}
