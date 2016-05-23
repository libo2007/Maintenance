package com.qidi.maintenance.activity;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public abstract class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        initViewAndData();
        loadData();
    }

    //初始化view和数据
    protected abstract void initViewAndData();

    //网络请求加载数据
    protected abstract void loadData();
}
