package com.example.yuluo.android_learn_3;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class standardActivity extends AppCompatActivity {

    public static final String TAG = "test";
    //生命周期有关函数的重载

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"standardActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"standardActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"standardActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG,"standardActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"standardActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"standardActivity onRestart");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG,"standardActivity onNewIntent");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        Log.w(TAG,"standardActivity onCreate  task id is "+getTaskId());
        Button start1 = (Button) findViewById(R.id.b12);
        Button start2 = (Button) findViewById(R.id.b13);
        Button start3 = (Button) findViewById(R.id.b14);


        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(standardActivity.this,singleTopActivity.class);
                startActivity(intent);
            }
        });
        start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(standardActivity.this,singleTaskActivity.class);
                startActivity(intent);
            }
        });
        start3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(standardActivity.this,singleInstanceActivity.class);
                startActivity(intent);
            }
        });
    }
}
