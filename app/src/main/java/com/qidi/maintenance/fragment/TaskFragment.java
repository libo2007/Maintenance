package com.qidi.maintenance.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qidi.maintenance.R;
import com.qidi.maintenance.activity.NoticeDetailActivity;
import com.qidi.maintenance.adapter.TaskAdapter;
import com.qidi.maintenance.entity.TaskEntity;
import com.qidi.maintenance.widget.TitleBar;
import com.qidi.maintenance.widget.zrclistview.ZrcListView;
import com.qidi.maintenance.widget.zrclistview.ZrcListViewUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 任务fragent
 */
public class TaskFragment extends Fragment {
    private View view;
    private ZrcListView mListView;
    private TaskAdapter mAdapter;
    private List<TaskEntity> mList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_task, null);
        TitleBar titleBar = new TitleBar(getActivity(), view);
        titleBar.setTitle(R.string.my_task);
        titleBar.setBackVisible(false);
        mListView = (ZrcListView) view.findViewById(R.id.listview);
        ZrcListViewUtil.setListViewStyle(getActivity(), mListView);

        mList = new ArrayList<TaskEntity>();
        mAdapter = new TaskAdapter(getActivity(), mList);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new ZrcListView.OnItemClickListener() {
            @Override
            public void onItemClick(ZrcListView parent, View view, int position, long id) {
                Intent it = new Intent(getActivity(), NoticeDetailActivity.class);
                startActivity(it);
            }
        });
        mListView.setOnRefreshStartListener(new ZrcListView.OnStartListener() {
            @Override
            public void onStart() {
                refresh();
            }
        });

//         加载更多事件回调（可选）
        mListView.setOnLoadMoreStartListener(new ZrcListView.OnStartListener() {
            @Override
            public void onStart() {
                loadMore();
            }
        });
        mListView.refresh();
        return view;
    }

    private void refresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mList.clear();
                for (int i = 0; i < 10; i++) {
                    TaskEntity entity = new TaskEntity();
                    entity.setContent("这是任务内容");
                    entity.setTime("2014-11-11");
                    if (i % 2 == 0) {
                        entity.setCorver("http://img0.imgtn.bdimg.com/it/u=1988065642,368946272&fm=21&gp=0.jpg");
                    } else {
                        entity.setCorver("http://imgsrc.baidu.com/forum/pic/item/89f4051f95cad1c87ccacc6b7e3e6709c83d5147.jpg");
                    }
                    entity.setTitle("标题");
                    mList.add(entity);
                }
                mAdapter.notifyDataSetChanged();
                mListView.setRefreshSuccess();
                mListView.startLoadMore(); // 开启LoadingMore功能
            }
        }, 500);
    }

    private void loadMore() {
        mListView.setLoadMoreSuccess();
    }
}