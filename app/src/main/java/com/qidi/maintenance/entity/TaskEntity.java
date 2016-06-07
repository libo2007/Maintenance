package com.qidi.maintenance.entity;

import java.io.Serializable;

/**
 * 作者：lenovo on 2016/6/6 13:50
 * 邮箱：353510746@qq.com
 * 功能：任务实体
 */
public class TaskEntity implements Serializable {
    private  String corver;
    private String content;
    private String title;
    private String time;

    public String getCorver() {
        return corver;
    }

    public void setCorver(String corver) {
        this.corver = corver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
