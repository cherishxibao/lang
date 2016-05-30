package com.huang.myfirstmap.demo.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.huang.myfirstmap.demo.R;
import com.huang.myfirstmap.demo.util.HomeGrid;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/5/26.
 */
public class HomeGridViewAdapter extends BaseAdapter {
    private ArrayList<HomeGrid> gridData = new ArrayList<>();
    private Context ctxt;
    private LayoutInflater layoutInflater;

    public HomeGridViewAdapter(Context ctxt, ArrayList<HomeGrid> gridData) {
        this.ctxt = ctxt;
        this.gridData = gridData;
        layoutInflater = LayoutInflater.from(ctxt);
    }

    @Override
    public int getCount() {
        return gridData.size();
    }

    @Override
    public Object getItem(int position) {
        return gridData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.drawer_layout_grid_view, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        for(int i=0;i<gridData.size();i++){
            viewHolder.GridItemText.setText(gridData.get(position).getGridCategory());
            viewHolder.GridItemImage.setImageResource(gridData.get(position).getGridBitmap());
        }
        return convertView;
    }

    private class ViewHolder {
        TextView GridItemText;
        ImageView GridItemImage;

        public ViewHolder(View convertView) {
            GridItemText = (TextView) convertView.findViewById(R.id.GridItemText);
            GridItemImage = (ImageView) convertView.findViewById(R.id.GridItemImage);
        }

    }
}

