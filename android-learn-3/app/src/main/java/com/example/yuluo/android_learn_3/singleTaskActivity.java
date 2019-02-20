package com.example.yuluo.android_learn_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class singleTaskActivity extends AppCompatActivity {

    public static final String TAG = "test";
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"singleTaskActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"singleTaskActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"singleTaskActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG,"singleTaskActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"singleTaskActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"singleTaskActivity onRestart");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
        Log.i(TAG,"singleTaskActivity onCreate");
        Button start1 = (Button) findViewById(R.id.b31);
        Button start2 = (Button) findViewById(R.id.b32);
        Button start3 = (Button) findViewById(R.id.b34);


        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleTaskActivity.this,standardActivity.class);
                startActivity(intent);
            }
        });
        start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleTaskActivity.this,singleTopActivity.class);
                startActivity(intent);
            }
        });
        start3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleTaskActivity.this,singleInstanceActivity.class);
                startActivity(intent);
            }
        });
    }
}
