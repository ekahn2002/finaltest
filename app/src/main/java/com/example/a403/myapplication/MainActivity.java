package com.example.a403.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch switch1;
    Chronometer chronometer1;
    EditText editText1, editText2, editText3;
    RadioGroup radio;
    RadioButton radioButton1, radioButton2, radioButton3;
    ImageView imageView1;
    Button button1, button2;
    TextView textView4, textView5, textView6;
    LinearLayout line1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1=(Switch)findViewById(R.id.switch1);
        chronometer1=(Chronometer)findViewById(R.id.chronometer1);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        radio=(RadioGroup)findViewById(R.id.radio);
        radioButton1=(RadioButton)findViewById(R.id.radioButton1);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        radioButton3=(RadioButton)findViewById(R.id.radioButton3);
        imageView1=(ImageView)findViewById(R.id.imageView1);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        line1=(LinearLayout)findViewById(R.id.line1);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
             if(isChecked){
                 chronometer1.setTextColor(Color.BLUE);
                 chronometer1.start();
                 line1.setVisibility(View.VISIBLE);
             }
             else line1.setVisibility(View.INVISIBLE);
            }
        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radioButton1.isChecked()){
                    imageView1.setImageResource(R.drawable.picture1);
                };
                if(radioButton2.isChecked()){
                    imageView1.setImageResource(R.drawable.picture2);
                };
                if(radioButton3.isChecked()){
                    imageView1.setImageResource(R.drawable.picture3);
                };
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(editText1.getText().toString().length() <=0 || editText2.getText().toString().length() <= 0 || editText3.getText().toString().length() <= 0){
                    Toast.makeText(MainActivity.this, "인원을 입력하세요.",Toast.LENGTH_SHORT).show();
                }

                else {
                    int adult = Integer.parseInt(editText1.getText().toString());
                    int teen = Integer.parseInt(editText2.getText().toString());
                    int child = Integer.parseInt(editText3.getText().toString());

                    int number = adult + teen + child;
                    int sum = adult*15000 + teen*12000 + child*8000;
                    int discount1 =  sum - sum*5/100;
                    int discount2 = sum - sum*10/100;
                    int discount3 = sum - sum*20/100;

                    if(radioButton1.isChecked()){
                        textView4.setText(number);
                        textView5.setText(discount1);
                        textView6.setText(sum-discount1);
                    }
                    if(radioButton2.isChecked()){
                        textView4.setText(number);
                        textView5.setText(discount2);
                        textView6.setText(sum-discount2);
                    }
                    if(radioButton3.isChecked()){
                        textView4.setText(number);
                        textView5.setText(discount3);
                        textView6.setText(sum-discount3);
                    }
                    else {
                        textView4.setText(number);
                        textView5.setText(discount3);
                        textView6.setText(sum-discount3);
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
