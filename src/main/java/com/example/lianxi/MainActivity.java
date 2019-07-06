package com.example.lianxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_name;
    private EditText et_pwd;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = (EditText) findViewById(R.id.et_name);

        et_pwd = (EditText) findViewById(R.id.et_pwd);

        bt_login = (Button) findViewById(R.id.bt_login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = et_name.getText().toString();

                Toast.makeText(MainActivity.this,"登陆成功",0).show();

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                intent.putExtra("key_name",name);

                startActivity(intent);



            }
        });
    }




}
