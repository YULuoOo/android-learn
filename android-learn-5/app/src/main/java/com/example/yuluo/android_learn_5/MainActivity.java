package com.example.yuluo.android_learn_5;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int CHANGE_COLOR=1;
    private RelativeLayout mLayout;

    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch(msg.what){
                case CHANGE_COLOR:
                    Random myRandom = new Random();
                    int ranColor = 0xff000000 | myRandom.nextInt(0x00ffffff);
                    mLayout.setBackgroundColor(ranColor);
                    break;
                default:
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLayout = (RelativeLayout )findViewById(R.id.l1);
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:
                new Thread(new Runnable(){
                    @Override
                    public void run() {
                        Message message = new Message();
                        message.what = CHANGE_COLOR;
                        handler.sendMessage(message);
                    }
                }).start();
                break;
            default:
                break;
        }
    }
}
