package com.danny.dictionary;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddWordActivity extends AppCompatActivity {

    Button button;
    EditText editText_en, editText_cn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
        setContentView(R.layout.activity_add);

        //初始化页面控件
        button = findViewById(R.id.button);
        editText_en = findViewById(R.id.editText_en);
        editText_cn = findViewById(R.id.editText_cn);
        

        //确认按钮的监听事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //返回主页面部分
                Intent intent = new Intent(AddWordActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
