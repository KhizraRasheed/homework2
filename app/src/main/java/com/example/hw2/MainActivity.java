package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    RadioButton radioButton;
    RadioButton radioButton2;
    TextView tv;
    CheckBox c1,c2,c3,c4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
        c4=(CheckBox)findViewById(R.id.c4);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
        tv = findViewById(R.id.result);
    }

    public void ShowSelection(View view) {
        int checked = radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(checked);
        StringBuilder result= new StringBuilder();



        int checked2 = radioGroup2.getCheckedRadioButtonId();
        radioButton2 =findViewById(checked2);
        if(c1.isChecked()){
            result.append(c1.getText());
            result.append("and");
        }
        if(c2.isChecked()){
            result.append(c2.getText());
            result.append("and");
        }
        if(c3.isChecked()){
            result.append(c3.getText());
            result.append("and");
        }
        if(c4.isChecked()){
            result.append(c4.getText());
            result.append("and");
        }
        result.append(radioButton.getText());
        result.append("and");
        result.append(radioButton2.getText());

        Intent intent=new Intent(MainActivity.this,MainActivity2.Class);
        intent.putExtra("NAME", result);
        startActivity(intent);


    }
}