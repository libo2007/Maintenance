package com.qidi.maintenance.entity;

import java.io.Serializable;

/**
 * 作者：lenovo on 2016/5/26 10:55
 * 邮箱：353510746@qq.com
 * 功能：通知实体
 */
public class NoticeEntity implements Serializable{
    private String content;
    private String time;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
