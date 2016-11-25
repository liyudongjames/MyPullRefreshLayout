package com.liyudong.home.mycustomrefreshlayout;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {

    private MyPullToRefresh refresh;

    private android.os.Handler handler = new android.os.Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refresh = (MyPullToRefresh) findViewById(R.id.refresh);
        refresh.setOnRefreshListener(new MyPullToRefresh.PullToRefreshListener() {
            @Override
            public void onRefreshing() {
                Log.d("fuck", "onRefreshing: ");

                Log.d("fuck", "onRefreshing:aaa ");
            }
        });
    }
}
