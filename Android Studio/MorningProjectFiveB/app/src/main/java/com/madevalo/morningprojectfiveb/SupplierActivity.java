package com.madevalo.morningprojectfiveb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.function.Supplier;

public class SupplierActivity extends AppCompatActivity {

    TextView welcometwo;
    Button SuppHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);
        SuppHome=findViewById(R.id.btnSupHome);
        SuppHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent custhome=new Intent(SupplierActivity.this,MainActivity.class);
                startActivity(custhome);
            }
        });
    }
}
