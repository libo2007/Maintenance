package com.qidi.maintenance.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.qidi.maintenance.R;
import com.qidi.maintenance.entity.TaskEntity;

import org.w3c.dom.Text;

import java.util.List;

/**
 * 作者：lenovo on 2016/5/26 10:54
 * 邮箱：353510746@qq.com
 * 功能：任务Adapter
 */
public class TaskAdapter extends BaseAdapter {
    private Context mContext;
    private List<TaskEntity> mList;

    public TaskAdapter(Context mContext, List<TaskEntity> mList) {
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
        if (convertView == null) {

            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_task, null);
            holder = new ViewHolder();
            holder.iv_cover = (SimpleDraweeView) convertView.findViewById(R.id.iv_cover);
            holder.tv_content = (TextView) convertView.findViewById(R.id.tv_content);
            holder.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
            holder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String corver = mList.get(position).getCorver();
        if(!TextUtils.isEmpty(corver)){
            Uri uri = Uri.parse(corver);
            holder.iv_cover.setImageURI(uri);
        }
        holder.tv_content.setText(mList.get(position).getContent());
        holder.tv_title.setText(mList.get(position).getTitle());
        holder.tv_time.setText(mList.get(position).getTime());
        return convertView;
    }

    static class ViewHolder {
        SimpleDraweeView iv_cover;
        TextView tv_content;
        TextView tv_title;
        TextView tv_time;
    }
}
