package com.example.asus.xiaohuangshu;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        final Button login = (Button) findViewById(R.id.denglu);
        final String zh = "abcd";
        final String mm = "1234";
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String zhanghao = " ";
                EditText editText1 = (EditText) findViewById(R.id.zhanghao);
                zhanghao = editText1.getText().toString();
                String mima = " ";
                EditText editText2 = (EditText) findViewById(R.id.mima);
                mima = editText2.getText().toString();
                if (zhanghao.equals(zh) & mima.equals(mm)) {
                    Intent intent = new Intent(Index.this, B.class);
                    startActivity(intent);
                } else {
                    new AlertDialog.Builder(Index.this).setTitle("错误").setMessage("账号或者密码错误！！！")
                            .setNegativeButton("OK", null)
                            .show();
                }
            }
            });
    }
}