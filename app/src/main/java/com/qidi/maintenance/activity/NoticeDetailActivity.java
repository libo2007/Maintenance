package com.qidi.maintenance.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.qidi.maintenance.R;
import com.qidi.maintenance.widget.TitleBar;

public class NoticeDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_detail);
        TitleBar titleBar = new TitleBar(this);
        titleBar.setTitle(R.string.my_notice);
    }

    @Override
    protected void initViewAndData() {

    }

    @Override
    protected void loadData() {

    }

}
