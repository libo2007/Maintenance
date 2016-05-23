package com.qidi.maintenance.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.qidi.maintenance.R;
import com.qidi.maintenance.fragment.AttendanceFragment;
import com.qidi.maintenance.fragment.CaseFragment;
import com.qidi.maintenance.fragment.PersonalFragment;
import com.qidi.maintenance.fragment.TaskFragment;

public class MainActivity extends BaseActivity {
    private View tab1;
    private View tab2;
    private View tab3;
    private View tab4;

    private ImageView mTabImg1;
    private ImageView mTabImg2;
    private ImageView mTabImg3;
    private ImageView mTabImg4;

    private TextView mTabTxt1;
    private TextView mTabTxt2;
    private TextView mTabTxt3;
    private TextView mTabTxt4;
    private FragmentManager fragmentManager;

    @Override
    protected void initViewAndData() {
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        mTabImg1 = (ImageView) findViewById(R.id.tab1_img);
        mTabImg2 = (ImageView) findViewById(R.id.tab2_img);
        mTabImg3 = (ImageView) findViewById(R.id.tab3_img);
        mTabImg4 = (ImageView) findViewById(R.id.tab4_img);

        mTabTxt1 = (TextView) findViewById(R.id.tab1_txt);
        mTabTxt2 = (TextView) findViewById(R.id.tab2_txt);
        mTabTxt3 = (TextView) findViewById(R.id.tab3_txt);
        mTabTxt4 = (TextView) findViewById(R.id.tab4_txt);


        tab1 = findViewById(R.id.tab1);
        tab1.setOnClickListener(new OneClickListener());

        tab2 = findViewById(R.id.tab2);
        tab2.setOnClickListener(new TwoClickListener());

        tab3 = findViewById(R.id.tab3);
        tab3.setOnClickListener(new ThreeClickListener());

        tab4 = findViewById(R.id.tab4);
        tab4.setOnClickListener(new FourClickListener());
    }

    @Override
    protected void loadData() {

    }

    private class OneClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            fragmentManager.beginTransaction().replace(R.id.fragment_conainer, new TaskFragment()).commit();
            mTabImg1.setImageResource(R.mipmap.home_userselected);
            mTabTxt1.setTextColor(getResources().getColor(
                    R.color.textview_blue));

            mTabImg2.setImageResource(R.mipmap.home_messagenormal);
            mTabTxt2.setTextColor(getResources().getColor(
                    R.color.txt_black));
            mTabImg3.setImageResource(R.mipmap.home_findnormal);
            mTabTxt3.setTextColor(getResources().getColor(
                    R.color.txt_black));
            mTabImg4.setImageResource(R.mipmap.home_morenormal);
            mTabTxt4.setTextColor(getResources().getColor(
                    R.color.txt_black));
        }
    }

    private class TwoClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            fragmentManager.beginTransaction().replace(R.id.fragment_conainer, new CaseFragment()).commit();
            mTabImg1.setImageResource(R.mipmap.home_usernormal);
            mTabTxt1.setTextColor(getResources().getColor(
                    R.color.txt_black));
            mTabImg2.setImageResource(R.mipmap.home_messageselected);
            mTabTxt2.setTextColor(getResources().getColor(
                    R.color.textview_blue));
            mTabImg3.setImageResource(R.mipmap.home_findnormal);
            mTabTxt3.setTextColor(getResources().getColor(
                    R.color.txt_black));
            mTabImg4.setImageResource(R.mipmap.home_morenormal);
            mTabTxt4.setTextColor(getResources().getColor(
                    R.color.txt_black));
        }
    }

    private class ThreeClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            fragmentManager.beginTransaction().replace(R.id.fragment_conainer, new AttendanceFragment()).commit();
            mTabImg1.setImageResource(R.mipmap.home_usernormal);
            mTabTxt1.setTextColor(getResources().getColor(
                    R.color.txt_black));
            mTabImg2.setImageResource(R.mipmap.home_messagenormal);
            mTabTxt2.setTextColor(getResources().getColor(
                    R.color.txt_black));
            mTabImg3.setImageResource(R.mipmap.home_findselected);
            mTabTxt3.setTextColor(getResources().getColor(
                    R.color.textview_blue));
            mTabImg4.setImageResource(R.mipmap.home_morenormal);
            mTabTxt4.setTextColor(getResources().getColor(
                    R.color.txt_black));
        }
    }

    private class FourClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            fragmentManager.beginTransaction().replace(R.id.fragment_conainer, new PersonalFragment()).commit();
            mTabImg1.setImageResource(R.mipmap.home_usernormal);
            mTabTxt1.setTextColor(getResources().getColor(
                    R.color.txt_black));
            mTabImg2.setImageResource(R.mipmap.home_messagenormal);
            mTabTxt2.setTextColor(getResources().getColor(
                    R.color.txt_black));
            mTabImg3.setImageResource(R.mipmap.home_findnormal);
            mTabTxt3.setTextColor(getResources().getColor(
                    R.color.txt_black));
            mTabImg4.setImageResource(R.mipmap.home_moreselected);
            mTabTxt4.setTextColor(getResources().getColor(
                    R.color.textview_blue));
        }
    }
}
