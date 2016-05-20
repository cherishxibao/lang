package com.huang.myfirstmap.demo;

import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.RadioGroup;
import com.huang.myfirstmap.demo.fragment.DestinationFragment;
import com.huang.myfirstmap.demo.fragment.FragmentAdapter;
import com.huang.myfirstmap.demo.fragment.HomeFragment;
import com.huang.myfirstmap.demo.fragment.MineFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private RadioGroup rgs;//用来切换各个页面
    public List<Fragment> fragments = new ArrayList<Fragment>();//将5个fragment添加到这个list里

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.page_main);

        rgs = (RadioGroup) findViewById(R.id.radioGroup);//实例化RadioGroup
        fragments.add(new HomeFragment());
        fragments.add(new DestinationFragment());
        fragments.add(new MineFragment());

        //写的一个fragment的适配器，进行几个页面的逻辑跳转
        new FragmentAdapter(MainActivity.this, fragments, R.id.Fragment, rgs, this);

    }
}
