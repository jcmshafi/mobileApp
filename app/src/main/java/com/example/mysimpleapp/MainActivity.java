package com.example.mysimpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toast(View view){
        Context context=getApplicationContext();
        Toast toast= Toast.makeText(context, R.string.message, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void count(View view){

    }
}