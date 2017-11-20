package com.example.jhim0.project1_new;

import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.view.Menu;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements MainFragment.OnTitleSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Phoneaction(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-760-4499"));
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    //item선택됬을때 --> 상단 메뉴
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.goto_AddMenuActivity:
                Intent intent = new Intent(getApplicationContext(), AddMenu.class);
                startActivity(intent);
                return true;
        }
        return false;
    }


    @Override
    public void onTitleSelected(int i) {
        if (getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {
            //DetailsFragment detailsFragment = new DetailsFragment();
            detailFragment detailfragment = new detailFragment();
            detailfragment.setSelection(i);
            getSupportFragmentManager().beginTransaction().replace(R.id.details, detailfragment).commit();
        } else {
            Intent intent = new Intent(this, detailActivity.class);
            intent.putExtra("index", i);
            startActivity(intent);

        }
    }


}
