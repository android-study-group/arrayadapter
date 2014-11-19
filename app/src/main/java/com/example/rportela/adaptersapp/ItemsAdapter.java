package com.example.rportela.adaptersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Item> {

    public ItemsAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_item, null);

        Item item = getItem(position);

        TextView title = (TextView) view.findViewById(R.id.title);
        title.setText(item.title);

        TextView description = (TextView) view.findViewById(R.id.description);
        description.setText(item.description);

        return view;
    }
}
