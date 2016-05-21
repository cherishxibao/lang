package com.huang.myfirstmap.demo.fragment;

import java.util.List;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

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

    /**
     * 改变Tab键，进行更换页面
     */

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        for (int i = 0; i < rGroup.getChildCount(); i++) {
            if (rGroup.getChildAt(i).getId() == checkedId) {
                Fragment fragment = fragments.get(i);
                FragmentTransaction ft = obtainFragmentTransaction(i);
                getCurrentFragment().onPause();// 暂停当前页面
                if (fragment.isAdded()) {
                    fragment.onResume();// 启动目标tab的onResume()
                } else {
                    ft.add(fgContentId, fragment);
                }
                showFragment(i);// 显示目标tab
                ft.commit();
            }
        }
    }

    /**
     * 显示切换的页面
     * @param i
     */
    private void showFragment(int i) {
        for (int i1 = 0; i1 < fragments.size(); i1++) {
            Fragment fragment = fragments.get(i1);
            FragmentTransaction ft = obtainFragmentTransaction(i1);
            if (i == i1) {
                ft.show(fragment);
            } else {
                ft.hide(fragment);
            }
            ft.commit();
        }
        currentId = i;// 更新目标tab为当前tab
    }

    /**
     * 得到当前的页面
     * @return
     */
    private Fragment getCurrentFragment() {
        return fragments.get(currentId);
    }

    /**
     * 得到当前页面的事务管理
     * @param i
     * @return
     */
    private FragmentTransaction obtainFragmentTransaction(int i) {
        FragmentTransaction fg = activity.getSupportFragmentManager()
                .beginTransaction();
        return fg;
    }
}
