package com.huang.myfirstmap.demo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.huang.myfirstmap.demo.HomePager.HotelActivity;
import com.huang.myfirstmap.demo.HomePager.StrategyActivity;
import com.huang.myfirstmap.demo.HomePager.TravelNotesActivity;
import com.huang.myfirstmap.demo.R;
import com.huang.myfirstmap.demo.SearchActivity;
import com.huang.myfirstmap.demo.adpter.HomeGridViewAdapter;
import com.huang.myfirstmap.demo.entity.HomeGrid;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private LinearLayout invis;

    LinearLayout search;

    private GridView homeGrid;
    private ArrayList<HomeGrid> gridData = new ArrayList<>();
    private ArrayList<HomeGrid> gridDataD1 = new ArrayList<>();
    private ArrayList<HomeGrid> gridDataD2 = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View homeView = inflater.inflate(R.layout.fragment_home, container, false);
        invis = (LinearLayout) homeView.findViewById(R.id.invis);

        search = (LinearLayout) homeView.findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(getActivity(), SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        homeGrid = (GridView) homeView.findViewById(R.id.grid_b);
        gridData.add(new HomeGrid(R.drawable.a1, "找攻略"));
        gridData.add(new HomeGrid(R.drawable.a2, "订酒店"));
        gridData.add(new HomeGrid(R.drawable.a3, "机+酒"));
        gridData.add(new HomeGrid(R.drawable.a4, "当地游"));
        gridData.add(new HomeGrid(R.drawable.b1, "看游记"));
        gridData.add(new HomeGrid(R.drawable.b2, "嗡嗡"));
        gridData.add(new HomeGrid(R.drawable.b3, "问达人"));
        gridData.add(new HomeGrid(R.drawable.b4, "办签证"));
        homeGrid.setAdapter(new HomeGridViewAdapter(getActivity(), gridData));


        homeGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent strageyIntent = new Intent(getActivity(),StrategyActivity.class);
                        getActivity().startActivity(strageyIntent);
                        break;
                    case 1:
                        Intent hotelIntent = new Intent(getActivity(),HotelActivity.class);
                        getActivity().startActivity(hotelIntent);
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        Intent travelIntent = new Intent(getActivity(),TravelNotesActivity.class);
                        getActivity().startActivity(travelIntent);
                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;

                }
            }
        });

        homeGrid = (GridView) homeView.findViewById(R.id.grid_d1);
        gridDataD1.add(new HomeGrid(R.drawable.f1, "￥1999 起/人"));
        gridDataD1.add(new HomeGrid(R.drawable.f2, "￥4199 起/人"));
        gridDataD1.add(new HomeGrid(R.drawable.f3, "￥3099 起/人"));
        gridDataD1.add(new HomeGrid(R.drawable.f4, "￥238 起/人"));
        gridDataD1.add(new HomeGrid(R.drawable.f5, "￥430 起/人"));
        gridDataD1.add(new HomeGrid(R.drawable.f6, "￥288 起/人"));
        homeGrid.setAdapter(new HomeGridViewAdapter(getActivity(), gridDataD1));

        homeGrid = (GridView) homeView.findViewById(R.id.grid_d2);
        gridDataD2.add(new HomeGrid(R.drawable.g1, "伸手接住五月的阳光"));
        gridDataD2.add(new HomeGrid(R.drawable.g2, "骄阳下用流光溢彩编制膨胀的梦想"));
        gridDataD2.add(new HomeGrid(R.drawable.g3, "炎夏如烈焰，旅途也疯狂"));
        gridDataD2.add(new HomeGrid(R.drawable.g4, "剩下的盛夏"));
        gridDataD2.add(new HomeGrid(R.drawable.g5, "残云收夏暑，新雨戴秋岚"));
        gridDataD2.add(new HomeGrid(R.drawable.g6, "迷醉在色彩斑斓的金秋十月"));
        homeGrid.setAdapter(new HomeGridViewAdapter(getActivity(), gridDataD2));

        ScrollView sv = (ScrollView) homeView.findViewById(R.id.scrollView);
        sv.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                if (scrollY > 780) {
                    invis.setVisibility(View.VISIBLE);
                    invis.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent searchIntent = new Intent(getActivity(), SearchActivity.class);
                            startActivity(searchIntent);
                        }
                    });

                } else {
                    invis.setVisibility(View.GONE);
                }
            }
        });

        return homeView;
    }

}
