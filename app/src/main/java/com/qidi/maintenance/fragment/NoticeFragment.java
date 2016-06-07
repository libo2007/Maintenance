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
import com.qidi.maintenance.adapter.NoticeAdapter;
import com.qidi.maintenance.entity.NoticeEntity;
import com.qidi.maintenance.widget.TitleBar;
import com.qidi.maintenance.widget.zrclistview.ZrcListView;
import com.qidi.maintenance.widget.zrclistview.ZrcListViewUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 任务fragent
 */
public class NoticeFragment extends Fragment {
    private View view;
    private ZrcListView mListView;
    private NoticeAdapter mAdapter;
    private List<NoticeEntity> mList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_notice, null);
        TitleBar titleBar = new TitleBar(getActivity(),view);
        titleBar.setTitle(R.string.my_notice);
        titleBar.setBackVisible(false);
        mListView = (ZrcListView) view.findViewById(R.id.listview);
        ZrcListViewUtil.setListViewStyle(getActivity(),mListView);

        mList = new ArrayList<NoticeEntity>();
        mAdapter = new NoticeAdapter(getActivity(),mList);
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

    private void refresh(){
      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              mList.clear();
              for(int i = 0;i<10;i++){
                  NoticeEntity entity = new NoticeEntity();
                  entity.setContent("这是通知内容");
                  entity.setTime("2014-11-11");
                  mList.add(entity);
              }
              mAdapter.notifyDataSetChanged();
              mListView.setRefreshSuccess();
              mListView.startLoadMore(); // 开启LoadingMore功能
          }
      }, 500);
    }

    private void loadMore(){
        mListView.setLoadMoreSuccess();
    }
}
