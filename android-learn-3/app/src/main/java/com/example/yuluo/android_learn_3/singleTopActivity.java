package com.example.yuluo.android_learn_3;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class singleTopActivity extends AppCompatActivity {

    public static final String TAG = "test1";
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"singleTopActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"singleTopActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"singleTopActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG,"singleTopActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"singleTopActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"singleTopActivity onRestart");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
        Log.i(TAG,"singleTopActivity onCreate");
        Button start1 = (Button) findViewById(R.id.b21);
        Button start2 = (Button) findViewById(R.id.b23);
        Button start3 = (Button) findViewById(R.id.b24);


        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleTopActivity.this,standardActivity.class);
                startActivity(intent);
            }
        });
        start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleTopActivity.this,singleTaskActivity.class);
                startActivity(intent);
            }
        });
        start3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleTopActivity.this,singleInstanceActivity.class);
                startActivity(intent);
            }
        });
    }
}
