package com.qidi.maintenance.widget;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.qidi.maintenance.R;

/**
 * 作者：lenovo on 2016/5/25 13:26
 * 邮箱：353510746@qq.com
 * 功能：必需包含有title_layout
 */
public class TitleBar implements View.OnClickListener {
    private Activity mContext;
    private LayoutInflater mInflater;
    private TextView mTitleTxt;
    private TextView mBackTxt;
    public TitleBar(Activity mContext) {
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
        mBackTxt = (TextView) mContext.findViewById(R.id.tv_back);
        mTitleTxt = (TextView) mContext.findViewById(R.id.tv_title);
        mBackTxt.setOnClickListener(this);
    }
    public TitleBar(Activity mContext,View view) {
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
        mBackTxt = (TextView) view.findViewById(R.id.tv_back);
        mTitleTxt = (TextView) view.findViewById(R.id.tv_title);
        mBackTxt.setOnClickListener(this);
    }
    public void setTitle(String title){
        if(TextUtils.isEmpty(title)){
            mTitleTxt.setVisibility(View.GONE);
        }else{
            mTitleTxt.setText(title);
        }
    }
    public void setTitle(int title){
        mTitleTxt.setText(title);
    }

    public void setBackVisible(boolean visible){
       if(visible){
           mBackTxt.setVisibility(View.VISIBLE);
       }else{
           mBackTxt.setVisibility(View.INVISIBLE);
       }
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.tv_back){
            if(mContext!=null){
                mContext.finish();
            }
        }
    }
}
