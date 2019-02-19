package com.example.yuluo.android_learn_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button1 = (Button)findViewById(R.id.button_2);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent("com.example.yuluo.android_learn_1.ACTION_START");
                intent.addCategory("com.example.yuluo.android_learn_1.MY_CATEGORY");
                startActivity(intent);
            }
        });
    }
}
