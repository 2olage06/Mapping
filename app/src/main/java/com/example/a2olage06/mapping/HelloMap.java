package com.example.a2olage06.mapping;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.IntegerRes;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

import org.osmdroid.views.MapView;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.config.Configuration;

public class HelloMap extends Activity implements View.OnClickListener
{

    MapView mv;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // this line tells OpenStreetMap about our app.
        // If you miss this out, you might get banned from OSM servers
        Configuration.getInstance().load
                (this, PreferenceManager.getDefaultSharedPreferences(this));

        mv = (MapView) findViewById(R.id.map1);

        mv.setBuiltInZoomControls(true);
        mv.getController().setZoom(14);
        mv.getController().setCenter(new GeoPoint(40.1, 22.5));

        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(this);

    }

    public void onClick(View view){
        EditText et1 = (EditText) findViewById(R.id.Latitude);
        double latitude= Double.parseDouble(et1.getText().toString());
        EditText et2 = (EditText) findViewById(R.id.Longitude);
        double longitude= Double.parseDouble(et2.getText().toString());
        mv.getController().setCenter(new GeoPoint(latitude, longitude));

    }
}