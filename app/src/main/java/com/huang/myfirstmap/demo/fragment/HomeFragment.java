package com.huang.myfirstmap.demo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;

import com.huang.myfirstmap.demo.R;
import com.huang.myfirstmap.demo.adpter.HomeGridViewAdapter;
import com.huang.myfirstmap.demo.util.HomeGrid;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ListView lv;
    private LinearLayout invis;
    private String[] strs;

    private GridView homeGrid;
    private ArrayList<HomeGrid> gridData = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View homeView = inflater.inflate(R.layout.fragment_home, container, false);
        invis = (LinearLayout) homeView.findViewById(R.id.invis);

        homeGrid = (GridView) homeView.findViewById(R.id.grid_b);
        gridData.add(new HomeGrid(R.drawable.a1, "找攻略"));
        gridData.add(new HomeGrid(R.drawable.a2, "订酒店"));
        gridData.add(new HomeGrid(R.drawable.a3, "机+酒"));
        gridData.add(new HomeGrid(R.drawable.a4, "当地游"));
        gridData.add(new HomeGrid(R.drawable.b1, "看游记"));
        gridData.add(new HomeGrid(R.drawable.b2, "嗡嗡"));
        gridData.add(new HomeGrid(R.drawable.b3, "问大人"));
        gridData.add(new HomeGrid(R.drawable.b4, "办签证"));

        homeGrid.setAdapter(new HomeGridViewAdapter(getActivity(), gridData));

//
//        strs = new String[30];
//
//        for (int i = 0; i < 30; i++) {
//            strs[i] = "data---" + i;
//        }

//        lv = (ListView) homeView.findViewById(R.id.lv);
//        View header = View.inflate(getActivity(), R.layout.stick_header, null);//头部图片
//        lv.addHeaderView(header);//添加头部
//        lv.addHeaderView(View.inflate(getActivity(), R.layout.stick_action, null));//ListView条目中的悬浮部分 添加到头部
//
//        lv.setAdapter(new ArrayAdapter<String>(getActivity(),
//                android.R.layout.simple_list_item_1, strs));

        ScrollView lv = (ScrollView) homeView.findViewById(R.id.scrollView);

        lv.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY > 800) {
                    invis.setVisibility(View.VISIBLE);
                } else {
                    invis.setVisibility(View.GONE);
                }
            }
        });

//        lv.setOnScrollListener(new AbsListView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(AbsListView view, int scrollState) {
//
//            }
//            @Override
//            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//                if (firstVisibleItem >= 1) {
//                    invis.setVisibility(View.VISIBLE);
//                } else {
//
//                    invis.setVisibility(View.GONE);
//                }
//            }
//        });
        return homeView;
    }

}
