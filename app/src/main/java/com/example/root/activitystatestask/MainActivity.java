package com.example.root.activitystatestask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle state","onCreate invoked");
    }

    public void next(View view) {
        Intent intent=new Intent(MainActivity.this,SecondScreen.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle state","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle state","onResumr invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle state","onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle state","onStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle state","onDestroy invoked");
    }
}
