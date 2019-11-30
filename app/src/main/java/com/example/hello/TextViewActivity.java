package com.example.hello;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextViewActivity extends AppCompatActivity {
    private TextView mTv4;
    private TextView mTv5,mTv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4 = (TextView)findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//加中划线,会有锯齿感
        mTv4.getPaint().setAntiAlias(true);//去除锯齿

        mTv5 = (TextView) findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线

        mTv6 = (TextView) findViewById(R.id.tv_6);
        mTv6.setText(Html.fromHtml("<u>Tom Fred</u>"));
    }
}
