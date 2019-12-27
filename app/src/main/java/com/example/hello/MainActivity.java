package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.GridView;

import com.example.hello.gridview.GridViewActivity;
import com.example.hello.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnChechBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = (Button)findViewById(R.id.btn_textview);
        mBtnButton = (Button) findViewById(R.id.btn_button);
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton =(Button)findViewById(R.id.btn_RadioButton);
        mBtnChechBox = (Button) findViewById(R.id.btn__checkbox);
        mBtnImageView = (Button) findViewById(R.id.btn_imageview);
        mBtnListView = (Button) findViewById(R.id.btn_listview);
        mBtnGridView = (Button) findViewById(R.id.btn_gridview);
        setListeners();
    }
    private void setListeners(){
        Onclick onclick = new Onclick();
        mBtnTextView.setOnClickListener(onclick);
        mBtnButton.setOnClickListener(onclick);
        mBtnEditText.setOnClickListener(onclick);
        mBtnRadioButton.setOnClickListener(onclick);
        mBtnChechBox.setOnClickListener(onclick);
        mBtnImageView.setOnClickListener(onclick);
        mBtnListView.setOnClickListener(onclick);
        mBtnGridView.setOnClickListener(onclick);
    }
    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_textview:
                    //跳转到textview演示界面
                    intent = new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    //跳转到Button演示界面
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    //跳转到edittext演示界面
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_RadioButton:
                    //跳转到RadioButton演示界面
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn__checkbox:
                    //跳转到CheckBox界面
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    //跳转到ImageView
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    //跳转到ListView界面
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    //跳转到GridView演示界面
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
