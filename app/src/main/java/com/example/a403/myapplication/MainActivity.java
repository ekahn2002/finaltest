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
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch switch1;
    Chronometer chronometer1;
    EditText editText1, editText2, editText3;
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
}
