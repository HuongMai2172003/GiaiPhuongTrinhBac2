package com.example.giaiphuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ptcoNghiemKep extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptco_nghiem_kep);
        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        //don du lieu
        Intent i1=getIntent();
        float a = i1.getExtras().getFloat("so1");
        float b = i1.getExtras().getFloat("so2");
        float c = -b / (2 * a);

        t3.setText(String.valueOf(c));
    }
}