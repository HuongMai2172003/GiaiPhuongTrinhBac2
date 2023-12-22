package com.example.giaiphuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ptVoNghiem1 extends AppCompatActivity {
TextView m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pt_vo_nghiem1);
        m= findViewById(R.id.textView);
        m.setText("Phương trình vô nghiệm");
    }
}