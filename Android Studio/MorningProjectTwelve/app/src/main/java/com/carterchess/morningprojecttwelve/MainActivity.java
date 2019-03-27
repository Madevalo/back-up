package com.carterchess.morningprojecttwelve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mbtnLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnLocation=findViewById(R.id.btnLocation);
        mbtnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maps = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(maps);
                //or
                //startActivity(new Intent(getApplicationContext(),MapsActivity.class));
            }
        });
    }
}
