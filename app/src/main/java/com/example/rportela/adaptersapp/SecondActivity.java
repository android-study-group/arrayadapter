package com.example.rportela.adaptersapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("My title", "Description"));
        items.add(new Item("My second item", "Looooong description"));
        items.add(new Item("Another item", "looooooog lon long Description"));

        ListView listView = (ListView) findViewById(R.id.list_view);

        ItemsAdapter adapter = new ItemsAdapter(this, R.layout.single_item, items);

        listView.setAdapter(adapter);
    }
}
