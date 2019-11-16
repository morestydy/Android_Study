package com.example.tom.helloworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//相当于一个入口
        setContentView(R.layout.activity_main);
        mBtnTextView = (Button)findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到TextView演示界面
                Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton = (Button) findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到button演示界面
               Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);

            }
        });
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            //跳转到EditText演示界面
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
    }
}
