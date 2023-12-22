package com.example.giaiphuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Ptco2Nghiem extends AppCompatActivity {
TextView x1,x2,x3,x4,x5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptco2_nghiem);
        x1=findViewById(R.id.textView1);
        x2=findViewById(R.id.textView2);
        x3=findViewById(R.id.textView3);
        x4=findViewById(R.id.textView4);
        x5=findViewById(R.id.textView5);
        //don du lieu
        Intent i1=getIntent();
        float a=i1.getExtras().getFloat("so1");
        float b=i1.getExtras().getFloat("so2");
        float c=i1.getExtras().getFloat("so3");
        float delta=i1.getExtras().getFloat("delta");
        float nghiem1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
        float nghiem2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
        x4.setText(String.valueOf(nghiem1));
        x5.setText(String.valueOf(nghiem2));
    }
}