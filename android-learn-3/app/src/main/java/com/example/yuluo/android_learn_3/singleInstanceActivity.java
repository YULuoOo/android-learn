package com.example.yuluo.android_learn_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class singleInstanceActivity extends AppCompatActivity {

    public static final String TAG = "test1";
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"singleInstanceActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"singleInstanceActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"singleInstanceActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG,"singleInstanceActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"singleInstanceActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"singleInstanceActivity onRestart");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
        Log.i(TAG,"singleInstanceActivity onCreate  task id is "+getTaskId());
        Button start1 = (Button) findViewById(R.id.b41);
        Button start2 = (Button) findViewById(R.id.b42);
        Button start3 = (Button) findViewById(R.id.b43);


        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleInstanceActivity.this,standardActivity.class);
                startActivity(intent);
            }
        });
        start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleInstanceActivity.this,singleTaskActivity.class);
                startActivity(intent);
            }
        });
        start3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleInstanceActivity.this,singleTopActivity.class);
                startActivity(intent);
            }
        });
    }
}