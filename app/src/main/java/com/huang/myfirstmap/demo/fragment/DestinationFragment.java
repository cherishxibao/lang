package com.huang.myfirstmap.demo.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.huang.myfirstmap.demo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DestinationFragment extends Fragment {


    public DestinationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_destination, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.des);
        txt_content.setText("目的地");
        return view;
    }

}
