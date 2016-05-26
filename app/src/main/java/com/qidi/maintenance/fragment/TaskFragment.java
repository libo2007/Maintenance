package com.qidi.maintenance.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qidi.maintenance.R;
import com.qidi.maintenance.widget.TitleBar;

/**
 * 任务fragent
 */
public class TaskFragment extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_task, null);
        TitleBar titleBar = new TitleBar(getActivity(),view);
        titleBar.setTitle(R.string.my_task);
        titleBar.setBackVisible(false);
        return view;
    }

}
