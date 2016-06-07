package com.qidi.maintenance.widget.zrclistview;

import android.content.Context;

import com.qidi.maintenance.R;

/**
 * 作者：lenovo on 2016/5/26 10:51
 * 邮箱：353510746@qq.com
 * 功能：
 */
public class ZrcListViewUtil {

    public static void setListViewStyle(Context context,ZrcListView listView){
        // 设置默认偏移量，主要用于实现透明标题栏功能。（可选）
        float density = context.getResources().getDisplayMetrics().density;
//        listView.setFirstTopOffset((int) (50 * density));
        // 设置下拉刷新的样式（可选，但如果没有Header则无法下拉刷新）
        SimpleHeader header = new SimpleHeader(context);
        header.setTextColor(0x1AACBB);
        header.setCircleColor(0xff33bbee);
        listView.setHeadable(header);
        // 设置加载更多的样式（可选）
        SimpleFooter footer = new SimpleFooter(context);
        footer.setCircleColor(0x1AACBB);
        listView.setFootable(footer);
        // 设置列表项出现动画（可选）
//        listView.setItemAnimForTopIn(R.anim.topitem_in);
//        listView.setItemAnimForBottomIn(R.anim.bottomitem_in);
    }
}
