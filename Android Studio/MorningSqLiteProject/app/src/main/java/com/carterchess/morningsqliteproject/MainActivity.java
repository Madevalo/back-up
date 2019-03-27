package com.carterchess.morningsqliteproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mName,mEmail,mId;
    Button mBtnSave,mBtnView,mBtnDelete;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mName=findViewById(R.id.edtName);
        mId=findViewById(R.id.edtID);
        mEmail=findViewById(R.id.edtMail);
        mBtnDelete=findViewById(R.id.btnDelete);
        mBtnSave=findViewById(R.id.btnSave);
        mBtnView=findViewById(R.id.btnView);
        db=openOrCreateDatabase("voterDb",MODE_PRIVATE,null);
        // Query to Create a table
        db.execSQL("CREATE TABLE IF NOT EXISTS voterreg(name VARCHAR, email VARCHAR, idNo VARCHAR)");
        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the user has filled in all records
                String name=mName.getText().toString();
                String email=mEmail.getText().toString();
                String id=mId.getText().toString().trim();
                if (name.isEmpty()){
                    messageDisplay("NAME ERROR","Kindly fill in your name");
                }else if (email.isEmpty()){
                    messageDisplay("EMAIL ERROR","Kindly fill in your email");
                }else if (id.isEmpty()){
                    messageDisplay("ID ERROR","Kindly fill in your ID Number");
                }else {
                    // Query to Insert into the DB
                    db.execSQL("INSERT INTO voterreg VALUES('"+name+"','"+email+"','"+id+"')");
                    messageDisplay("QUERY SUCCESS","Data saved successfully");
                    clear();
                }
            }
        });
        mBtnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Query to view DB records
                Cursor cursor=db.rawQuery("SELECT * FROM voterreg",null);
                // Check if there is any records
                if (cursor.getCount()==0){
                    messageDisplay("NO RECORDS","Sorry, No records were found");
                }
                // Use buffer to append the records
                StringBuffer buffer=new StringBuffer();
                while (cursor.moveToNext()){
                    buffer.append("\n"+cursor.getString(0));
                    buffer.append("\t,\n"+cursor.getString(1));
                    buffer.append("\t,\n"+cursor.getString(2));
                    buffer.append("\n");
                }
                messageDisplay("DATABASE RECORDS",buffer.toString());
            }
        });
        mBtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Check if someone has not entered the ID
                String id=mId.getText().toString().trim();
               if (id.isEmpty()){
                   messageDisplay("ID ERROR","Kindly fill in the ID");
               }else {
                   Cursor cursor=db.rawQuery("SELECT * FROM voterreg WHERE idNo='"+id+"'", null);
                   db.execSQL("DELETE FROM voterreg WHEREE IdNo='"+id+"");
               }

            }
        });
    }
    // Message Display function
    private void messageDisplay(String title,String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.create().show();
    }
    // Clear the editText after saving
    public void clear(){
        mName.setText("");
        mEmail.setText("");
        mId.setText("");
    }
}
