package com.madevalo.dummyappthree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView moja,mbili;
Button tatu,nne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moja=findViewById(R.id.tvOne);
        mbili=findViewById(R.id.tvTwo);
        tatu=findViewById(R.id.btnOne);
        nne=findViewById(R.id.btnThree);
        moja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "moja", Toast.LENGTH_SHORT).show();
            }
        });
        mbili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "mbili", Toast.LENGTH_SHORT).show();
            }
        });
        tatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tatu", Toast.LENGTH_SHORT).show();
            }
        });
        nne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "nne", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
