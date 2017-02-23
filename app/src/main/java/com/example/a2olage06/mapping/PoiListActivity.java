package com.example.a2olage06.mapping;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class PoiListActivity extends ListActivity {

    String[] names, details;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        names = new String[]{"The Crown", "The Cowherds", "The Tow Brothers", "Piccolo Mondo"};
        details = new String[]{"pub, 2.5 miles north", "pub, 1.5 miles north", "pub, 3.5 miles northeast", "Italian restaurant, 0.5 miles west"};
        MyAdapter adapter = new MyAdapter();
        setListAdapter(adapter);

    }

    public void onListItemClick(ListView lv, View view, int index, long id)
    {

    }

    class MyAdapter extends ArrayAdapter<String> {
        public MyAdapter() {
            super(PoiListActivity.this, android.R.layout.simple_list_item_1, names);
        }


        @Override
        public View getView(int index, View convertView, ViewGroup parent) {
            View view = convertView;
            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.activity_poi_list, parent, false);
            }
            TextView title = (TextView) view.findViewById(R.id.poi_name);
            TextView detail = (TextView) view.findViewById(R.id.poi_desc);
            title.setText(names[index]);
            detail.setText(details[index]);
            return view;
        }
    }
}
