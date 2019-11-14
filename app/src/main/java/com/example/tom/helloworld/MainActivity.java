package com.example.tom.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//相当于一个入口
        setContentView(R.layout.activity_main);
    }
}
