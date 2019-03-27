package com.madevalo.morningprojectfiveb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mCustomer,mSupplier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomer=findViewById(R.id.btnCustomer);
        mSupplier=findViewById(R.id.btnSupplier);
        mCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customer = new Intent(MainActivity.this,CustomerActivity.class);
                startActivity(customer);
            }
        });
        mSupplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent supplier = new Intent(MainActivity.this,SupplierActivity.class);
                startActivity(supplier);
            }
        });
    }
}
