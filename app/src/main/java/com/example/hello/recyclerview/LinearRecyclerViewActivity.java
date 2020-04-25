package com.example.hello.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.hello.R;

public class LinearRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);
        mRvMain = findViewById(R.id.rv_main);
        mRvMain.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));
        //添加分割线
        mRvMain.addItemDecoration(new MyDecoration());
        //设置适配器Adapter,其中监听事件方法需要自己定义
        mRvMain.setAdapter(new LinearAdapter(LinearRecyclerViewActivity.this, new LinearAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                //设置点击事件
                Toast.makeText(LinearRecyclerViewActivity.this, "click..." + (pos + 1), Toast.LENGTH_SHORT).show();
            }
        }, new LinearAdapter.OnLongItemClickListener() {
            @Override
            public void OnLongClick(int pos) {
                Toast.makeText(LinearRecyclerViewActivity.this,"Long Click..."+(pos+1),Toast.LENGTH_SHORT).show();
            }
        }));
    }
    //定义内部类MyDecoration,并设置分隔线
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }
}
