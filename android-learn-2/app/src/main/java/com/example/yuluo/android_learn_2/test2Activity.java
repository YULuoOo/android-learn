package com.example.yuluo.android_learn_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class test2Activity extends AppCompatActivity {

    public static final String TAG = "test";
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"test1Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"test1Activity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"test1Activity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG,"test1Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"test1Activity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"test1Activity onRestart");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        Log.i(TAG,"test1Activity onCreate");
    }
}
