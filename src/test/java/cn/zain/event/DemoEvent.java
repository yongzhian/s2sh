package cn.zain.event;

import org.springframework.context.ApplicationEvent;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;
    private  Student student;

    public DemoEvent(Object source, String msg, Student student) {
        super(source);
        this.msg = msg;
        this.student = student;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
