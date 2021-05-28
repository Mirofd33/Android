package com.example.administrator.androidhomework3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.awt.Button;

public class MainActivity extends AppCompatActivity {
    //要用到的控件，定义对应的成员变量，以便从界面中找到便使用
    EditText mEtHeight;//身高控件
    RadioGroup mRegSex;//性别控件
    Button mBtnCompute;//计算按钮控件


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
