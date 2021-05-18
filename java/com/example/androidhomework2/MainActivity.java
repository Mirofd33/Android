package com.example.androidhomework2;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //为Activity中的可操作的控件定义成员变量
    EditText mEtHeight;
    RadioGroup mRgGender;
    Button mBtnCompute;
    TextView mTvWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //
        mEtHeight = findViewById(R.id.et_height);
        mRgGender = findViewById(R.id.rg_gender);
        mBtnCompute = findViewById(R.id.btn_compute);
        mTvWeight = findViewById(R.id.tv_result);
        //
        mBtnCompute.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //
                //
                int id = mRgGender.getCheckedRadioButtonId();
                if(id == R.id.rb_male){
                    //
                    String sHeight = mEtHeight.getText().toString();
                    int height = Integer.parseInt(sHeight);
                    double result = (height -80)*0.7;
                    mTvWeight.setText("标准体重是"+result+"");

                }else if(id==R.id.rb_female){

                    String fHeight = mEtHeight.getText().toString();
                    int height1 = Integer.parseInt(fHeight);
                    double result1 = (height1 -70)*0.6;
                    mTvWeight.setText("标准体重是"+result1+"");
                }
            }
        });
    }
}
