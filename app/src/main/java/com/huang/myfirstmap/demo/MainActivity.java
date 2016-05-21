package com.huang.myfirstmap.demo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    public List<Fragment> fragments = new ArrayList<Fragment>();//将3个fragment添加到这个list里

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


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
