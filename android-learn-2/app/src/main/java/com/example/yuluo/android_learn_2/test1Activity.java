package com.example.yuluo.android_learn_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class test1Activity extends AppCompatActivity {

    public static final String TAG = "test1";
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"onRestart");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        Log.i(TAG,"onCreate");
    }
}
