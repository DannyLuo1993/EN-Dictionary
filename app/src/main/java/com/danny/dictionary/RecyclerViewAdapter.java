package com.danny.dictionary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private LiveData<List<Word>> wordListLive;

    public RecyclerViewAdapter(LiveData<List<Word>> wordListLive) {
        this.wordListLive = wordListLive;
    }



    //创建ItemView（页面的View管理器）
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView_Serial, textView_EN, textView_CN;
        Switch aSwitch;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_Serial = itemView.findViewById(R.id.textView);
            textView_EN = itemView.findViewById(R.id.textView2);
            textView_CN = itemView.findViewById(R.id.textView3);
            aSwitch = itemView.findViewById(R.id.switch1);
        }
    }


    //Input方法，將需要ItemView注入ViewHolder
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        System.out.println("OnCreateViewHolder");
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.recycler_cell_word,parent,false);
        return new MyViewHolder(itemView);
    }

    //绑定数据绑定到ItemView的各个View中
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        System.out.println("onBindViewHolder");
        holder.textView_Serial.setText(position+1);
        holder.textView_EN.setText("Test");
        holder.textView_CN.setText("测试");
    }


    @Override
    public int getItemCount() {
        return 0;
    }
}
