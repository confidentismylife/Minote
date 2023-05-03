package com.example.test001;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.stream.StreamSupport;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mBtnLogin;//声明控件
    private EditText mEtUser;
    private EditText mEtPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBtnLogin = findViewById( R.id.btn_login );
        mEtUser = findViewById(R.id.et_1);
        mEtPassword = findViewById(R.id.et_2);

       /* mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;//跳转
                intent= new Intent(MainActivity.this,FunctionActivity00.class);//创建这个跳转到另外一个
                startActivity(intent);//开始跳转
            }*/
        mBtnLogin.setOnClickListener(this);
    }

            public void onClick(View view){
                String username = mEtUser.getText().toString();
                String password = mEtPassword.getText().toString();
                Intent intent = null;

                String ok="登陆成功";
                String fail="密码账号有误，请重新输！";


                if(username.equals("pjw")&&password.equals("123456")){
                    Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();

                    intent = new Intent(MainActivity.this,FunctionActivity00.class);
                    startActivity(intent);
                }else{
                    Toast toastCenter =Toast.makeText(getApplicationContext(),fail,Toast.LENGTH_SHORT);
                    toastCenter.setGravity(Gravity.CENTER,0,0);
                    toastCenter.show();
                }



            }



}