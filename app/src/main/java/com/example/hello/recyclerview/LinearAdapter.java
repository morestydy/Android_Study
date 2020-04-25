package com.example.hello.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hello.R;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {
    private Context mContext;
    private OnItemClickListener mListener;
    private OnLongItemClickListener mLongListener;

    public LinearAdapter(Context mContext,OnItemClickListener listener,OnLongItemClickListener LongListener) {
        this.mContext = mContext;
        this.mListener=listener;
        this.mLongListener = LongListener;
    }
    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder holder, final int position) {
        holder.textView.setText("Hello World!");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClick(position);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mLongListener.OnLongClick(position);
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }
    //新建一个接口,返回点击位置参数
    public interface OnItemClickListener{
        void onClick(int pos);
    }
    //新建一个接口,返回长按位置参数
    public interface OnLongItemClickListener{
        void OnLongClick(int pos);
    }
}
