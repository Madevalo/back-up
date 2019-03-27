package com.madevalo.morningprojectnineb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<Item> users;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        users = new ArrayList();
        adapter=new CustomAdapter(this,users);
        list=findViewById(R.id.listWatu);
        Item person=new Item("King","0756365668",R.drawable.kenyatwo);
        Item person2=new Item("ing","0756365668",R.drawable.kenyatwo);
        Item person3=new Item("ng","0756365668",R.drawable.kenyatwo);
        Item person4=new Item("g","0756365668",R.drawable.kenyatwo);
        Item person5=new Item("Kng","0756365668",R.drawable.kenyatwo);
        Item person6=new Item("Kg","0756365668",R.drawable.kenyatwo);
        Item person7=new Item("K","0756365668",R.drawable.kenyatwo);
        Item person8=new Item("Kig","0756365668",R.drawable.kenyatwo);
        Item person9=new Item("Ki","0756365668",R.drawable.kenyatwo);
        Item person10=new Item("Kin","0756365668",R.drawable.kenyatwo);
        Item person11=new Item("Kings","0756365668",R.drawable.kenyatwo);
        users.add(person);
        users.add(person2);
        users.add(person3);
        users.add(person4);
        users.add(person5);
        users.add(person6);
        users.add(person7);
        users.add(person8);
        users.add(person9);
        users.add(person10);
        users.add(person11);

        list.setAdapter(adapter);
    }
}
