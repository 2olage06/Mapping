package com.example.a2olage06.mapping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

/**
 * Created by 2olage06 on 16/02/2017.
 */
public class SetLocation extends Activity implements View.OnClickListener {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setlocation);




        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(this);
    }


    public void onClick(View view){

        EditText et1 = (EditText) findViewById(R.id.Latitude);
        double latitude= Double.parseDouble(et1.getText().toString());
        EditText et2 = (EditText) findViewById(R.id.Longitude);
        double longitude= Double.parseDouble(et2.getText().toString());



        Bundle bundle = new Bundle();
        bundle.putDouble("com.example.latitude", latitude);
        bundle.putDouble("com.example.longitude", longitude);

        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();



    }
}
