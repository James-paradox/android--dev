 package com.Siddharth.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"OnCreate",Toast.LENGTH_LONG).show();

    }

     @Override
     protected void onStart() {
         super.onStart();
         Toast.makeText(MainActivity.this,"OnStart",Toast.LENGTH_LONG).show();
     }

     @Override
     protected void onStop() {
        super.onStop();
         Toast.makeText(MainActivity.this,"OnStop",Toast.LENGTH_LONG).show();
    }

     @Override
     protected void onDestroy() {
         super.onDestroy();
         Toast.makeText(MainActivity.this,"OnDestroy",Toast.LENGTH_LONG).show();
     }

     @Override
     protected void onPause() {
         super.onPause();
         Toast.makeText(MainActivity.this,"OnPause",Toast.LENGTH_LONG).show();
     }
 }


