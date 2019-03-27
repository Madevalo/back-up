package com.madevalo.morningprojectfiveb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomerActivity extends AppCompatActivity {

    TextView welcomeOne;
    Button CustHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        CustHome=findViewById(R.id.btnCustHome);
        CustHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent custhome=new Intent(CustomerActivity.this,MainActivity.class);
                startActivity(custhome);
            }
        });
    }
}
