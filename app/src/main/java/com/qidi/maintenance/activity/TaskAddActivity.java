package com.qidi.maintenance.activity;

import android.os.Bundle;

import com.qidi.maintenance.R;
import com.qidi.maintenance.widget.TitleBar;

public class TaskAddActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initViewAndData() {
        setContentView(R.layout.activity_task_add);
        TitleBar titleBar = new TitleBar(this);
        titleBar.setTitle(R.string.task_add);
    }

    @Override
    protected void loadData() {

    }

}
