package com.huang.myfirstmap.demo.HomePager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.huang.myfirstmap.demo.R;
import com.huang.myfirstmap.demo.adpter.TravelNotesAdapter;
import com.huang.myfirstmap.demo.entity.TravelNotes;

import java.util.ArrayList;
import java.util.List;

public class TravelNotesActivity extends AppCompatActivity {
    private ListView listView;
    private List<TravelNotes> data;
    private TravelNotesAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_notes);
        
        init();
    }

    private void init() {
        listView = (ListView) findViewById(R.id.travel_lv);

        TravelNotes notes1 =
                new TravelNotes(R.drawable.catalog_head_bg1,"回首又见你",R.drawable.d1,"alickd","新西兰",24572);
        TravelNotes notes2 =
                new TravelNotes(R.drawable.catalog_head_bg2,"闯入南半球仙境般的夏天",R.drawable.d2,"黄太胖先生","澳大利亚",36572);
        TravelNotes notes3 =
                new TravelNotes(R.drawable.catalog_head_bg3,"飘逝的童话堡",R.drawable.d1,"抽风locasd","意大利",21575);
        TravelNotes notes4 =
                new TravelNotes(R.drawable.catalog_head_bg1,"云台观山，沧海相逢",R.drawable.d2,"扫雪酱","云台山",43665);
        TravelNotes notes5 =
                new TravelNotes(R.drawable.catalog_head_bg2,"世界那么大，我想带你去看看",R.drawable.d1,"minnie","涛岛",8521);
        TravelNotes notes6 =
                new TravelNotes(R.drawable.catalog_head_bg3,"回首又见你",R.drawable.d2,"黄太胖先生","新西兰",31521);
        TravelNotes notes7 =
                new TravelNotes(R.drawable.catalog_head_bg1,"回首又见你",R.drawable.d1,"黄太胖先生","新西兰",22487);
        TravelNotes notes8 =
                new TravelNotes(R.drawable.catalog_head_bg2,"回首又见你",R.drawable.d2,"黄太胖先生","新西兰",3495);

        data = new ArrayList<TravelNotes>();
        data.add(notes1);
        data.add(notes2);
        data.add(notes3);
        data.add(notes4);
        data.add(notes5);
        data.add(notes6);
        data.add(notes7);
        data.add(notes8);

        adapter = new TravelNotesAdapter(this,data);
        listView.setAdapter(adapter);
    }
}
