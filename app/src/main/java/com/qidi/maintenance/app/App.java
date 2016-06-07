package com.qidi.maintenance.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * 作者：lenovo on 2016/6/6 14:55
 * 邮箱：353510746@qq.com
 * 功能：
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
