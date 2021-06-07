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
    TextView mTvResult;

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
                //onclick方法是点击后将要调用的方法
                String sHeight = mEtHeight.getText().toString();
                int height = Integer.parseInt(sHeight);//将字符转换整数


                int height2 = Integer.parseInt(mEtHeight.getText().toString());

                int id =mRegSex.getCheckedRadioButtonId();//获取选中的单选按钮id
                if(id==R.id.rb_male){
                    //男性的标准体重计算公式=（身高cm-100）*0.9(kg);
                    int standarweight =(int)((height-100)*0.9);

                    //显示标准体重
                    mTvResult.setText("标准体重是："+standarweight+"KG");
                }else if(id==R.id.rb_female){
                    //是女性 女性的标准体重计算公式=（身高cm-100）*0.9(kg)-2.5kg
                    int standarweight =(int)((height-100)*0.9-2.5);
                    
                    mTvResult.setText("标准体重是："+standarweight+"KG");



                }


            }
        });
    }
}
