package com.huang.myfirstmap.demo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.huang.myfirstmap.demo.R;

public class HomeFragment extends Fragment {

    private ListView lv;
    private LinearLayout invis;
    private String[] strs;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View homeView =  inflater.inflate(R.layout.fragment_home, container, false);
        invis = (LinearLayout) homeView.findViewById(R.id.invis);

//        strs = new String[30];
//
//        for (int i = 0; i < 30; i++) {
//            strs[i] = "data---" + i;
//        }



        lv = (ListView) homeView.findViewById(R.id.lv);
        View header = View.inflate(getActivity(), R.layout.stick_header, null);//头部图片
        lv.addHeaderView(header);//添加头部
        lv.addHeaderView(View.inflate(getActivity(), R.layout.stick_action, null));//ListView条目中的悬浮部分 添加到头部

        lv.setAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strs));

        lv.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }
            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if (firstVisibleItem >= 1) {
                    invis.setVisibility(View.VISIBLE);
                } else {

                    invis.setVisibility(View.GONE);
                }
            }
        });
        return homeView;
    }




}
