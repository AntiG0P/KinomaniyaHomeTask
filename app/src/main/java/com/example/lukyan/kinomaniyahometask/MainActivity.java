package com.example.lukyan.kinomaniyahometask;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;


public class MainActivity extends ActionBarActivity {

    String[] data = {"a", "b", "c", "d"};

    GridView gvMain;
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.gvMain);
        gvMain.setAdapter(adapter);
        adjustGridView();
    }


    private void adjustGridView() {
        gvMain.setNumColumns(GridView.AUTO_FIT);
        gvMain.setVerticalSpacing(5);
        gvMain.setHorizontalSpacing(5);
    }


}
