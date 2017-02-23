package com.example.a2olage06.mapping;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MapListActivity extends ListActivity
{
   String[] data;

    public void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);

       data = new String[] {"regular", "cyclemap"};
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
       setListAdapter(adapter);
    }
    public void onListItemClick(ListView lv, View view, int index, long id)
   {
       Intent intent = new Intent();
       Bundle bundle=new Bundle();
       boolean cyclemap=false;
       if (index == 0)
       {
           cyclemap=true;
       }
       bundle.putBoolean("com.example.cyclemap",cyclemap);
       intent.putExtras(bundle);
       setResult(RESULT_OK,intent);
       finish();
   }


}

