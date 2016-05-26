package com.qidi.maintenance.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.qidi.maintenance.R;
import com.qidi.maintenance.entity.NoticeEntity;

import java.util.List;

/**
 * 作者：lenovo on 2016/5/26 10:54
 * 邮箱：353510746@qq.com
 * 功能：
 */
public class NoticeAdapter extends BaseAdapter {
    private Context mContext;
    private List<NoticeEntity> mList;

    public NoticeAdapter(Context mContext, List<NoticeEntity> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){

            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_notice,null);
            holder = new ViewHolder();
            holder.tv_content = (TextView) convertView.findViewById(R.id.tv_content);
            holder.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_content.setText(mList.get(position).getContent());
        holder.tv_time.setText(mList.get(position).getTime());
        return convertView;
    }

    static class ViewHolder{
        TextView tv_content;
        TextView tv_time;
    }
}
