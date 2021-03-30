package com.bt.apmlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hugo.weaving.DebugLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testAop();
    }

    @DebugLog
    private void testAop() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}