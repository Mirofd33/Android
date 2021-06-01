package com.example.administrator.androidhomework3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.awt.Button;

public class MainActivity extends AppCompatActivity {
    //要用到的控件，定义对应的成员变量，以便从界面中找到并使用
    EditText mEtHeight;//身高控件
    RadioGroup mRegSex;//性别控件
    Button mBtnCompute;//计算按钮控件


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //从界面中找到控件，保存到成员变量
        mEtHeight = findViewById(R.id.et_height);
        //TODO 获取性别控件
        mRegSex = findViewById(R.id.rg_sex);
        //
        mBtnCompute = findViewById(R.id.btn_compute);

        //为按钮绑定clik事件处理方法
        mBtnCompute.setOnClickListener(new.View.OnClickListenner(){

            @Override
              public void onClick(View v){
                //

                
            }
        });
    }
}
