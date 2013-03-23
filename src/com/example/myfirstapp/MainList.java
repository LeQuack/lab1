package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;

public class MainList extends Activity {

    private ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        List list_data[] = new List[]
        {
            new List(R.drawable.is, R.string.info_sis),
            new List(R.drawable.wan, R.string.wan_mr),
            new List(R.drawable.kkip, R.string.kk_ip),
            new List(R.drawable.mis, R.string.mob_is),
            new List(R.drawable.jmm, R.string.javni_mm)
        };
        
        ListAdapter adapter = new ListAdapter(this, 
                R.layout.listview_item_row, list_data);
        
        
        listView1 = (ListView)findViewById(R.id.listView1);
         
        View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
        listView1.addHeaderView(header);
        
        listView1.setAdapter(adapter);
    }
}