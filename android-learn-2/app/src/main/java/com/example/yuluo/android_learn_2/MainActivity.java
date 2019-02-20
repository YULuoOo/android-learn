package com.example.yuluo.android_learn_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "test";
    //生命周期有关函数的重载

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG,"MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"MainActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"MainActivity onRestart");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG,"MainActivity onNewIntent");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(TAG,"MainActivity onCreate");
        Button startTest1 = (Button) findViewById(R.id.start_test1_button);
        Button startTest2 = (Button) findViewById(R.id.start_test2_button);

        startTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,test1Activity.class);
                startActivity(intent);
            }
        });
        startTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,test2Activity.class);
                startActivity(intent);
            }
        });
    }
}
