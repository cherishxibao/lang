package com.huang.myfirstmap.demo.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioGroup;

import java.util.List;

/**
 * Created by huang on 2016/5/19.
 */
public class FragmentAdapter implements RadioGroup.OnCheckedChangeListener {
    private List<Fragment> fragments;// 一个tab页面对应一个Fragment
    private RadioGroup rGroup;// 用于切换tab
    private FragmentActivity activity;// Fragment所属的Activity
    private int fgContentId;// Activity中所要被替换的区域的id
    private int currentId; // 当前Tab页面索引
    private FragmentTransaction fTransaction;// 用于让调用者在切换tab时候增加新的功能

    public FragmentAdapter(FragmentActivity activity,
                           final List<Fragment> fragments,
                           final int fgContentId,
                           RadioGroup rGroup,
                           Context context) {
        this.activity = activity;
        this.fragments = fragments;
        this.rGroup = rGroup;
        this.fgContentId = fgContentId;

        rGroup.setOnCheckedChangeListener(this);
    }
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }
}
