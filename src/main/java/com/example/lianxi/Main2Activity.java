package com.example.lianxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        Intent intent = getIntent();
        String name = intent.getStringExtra("key_name");
        tv_name.setText(name+"欢迎你");

    }
}
