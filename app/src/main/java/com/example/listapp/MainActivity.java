package com.example.listapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    String[] items;
    String[] prices;
    String[] descriptions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        items = res.getStringArray(R.array.items);
        //Log.d(getClass().getName(), "value = " + items[0]+" value2 "+items[1]+" value3 "+items[2]);
        prices = res.getStringArray(R.array.prices);
        //Log.d(getClass().getName(), "value = " + prices[0]+" value2 "+prices[1]+" value3 "+prices[2]);
        descriptions = res.getStringArray(R.array.descriptions);
        //Log.d(getClass().getName(), "value = " + descriptions[0]+" value2 "+descriptions[1]+" value3 "+descriptions[2]);
        // myListView.setAdapter(new ArrayAdapter<String>(this,R.layout.my_listview_detail,items));

        ItemAdapter itemAdapter = new ItemAdapter(this, items, prices, descriptions);
        //Log.d(getClass().getName(), "value = " + itemAdapter.descriptions[0]+" value2 "+itemAdapter.descriptions[1]+" value3 "+itemAdapter.descriptions[2]);
        myListView.setAdapter(itemAdapter);

    }
}
