package com.example.jhim0.project1_new;

import android.app.Fragment;
import android.content.Intent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jhim0 on 2017-11-17.
 */

public class detailFragment  extends android.support.v4.app.Fragment {

    static int index = -1;

    public detailFragment(){

    }

    public void setSelection(int i){index = i;}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //inflate layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);


        /*
        Intent intentimage = getIntent();
        int image = intentimage.getIntExtra("image", 0);
        ImageView image1 = (ImageView)findViewById(R.id.Foodimage1);
        image1.setImageResource(image);


        Intent intentname = getIntent();
        String Textname = intentname.getStringExtra("name");
        TextView tv1 = (TextView)findViewById(R.id.FoodText1);
        tv1.setText(Textname);

        Intent intentcost = getIntent();
        String Textcost = intentcost.getStringExtra("cost");
        TextView tv2 = (TextView)findViewById(R.id.FoodText2);
        tv2.setText(Textcost);

        Intent intentlast = getIntent();
        String Textlast = intentlast.getStringExtra("taste");
        TextView tv3 = (TextView)findViewById(R.id.FoodText3);
        tv3.setText(Textlast);
          */

        return view;
    }

}
