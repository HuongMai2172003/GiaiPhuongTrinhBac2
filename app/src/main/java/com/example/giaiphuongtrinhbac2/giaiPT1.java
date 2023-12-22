package com.example.giaiphuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class giaiPT1 extends AppCompatActivity {
    EditText txt1,txt2,txt3;
    Button btn1;
    TextView txv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_pt1);
        txt1=findViewById(R.id.demotext1);
        txt2=findViewById(R.id.demotext2);
        txt3= findViewById(R.id.demotext3);
        btn1=findViewById(R.id.button);
        txv=findViewById(R.id.textView);
        btn1.setOnClickListener(v -> {
            // Lấy giá trị từ EditText
            float a, b, c, delta;


                a = Float.parseFloat(txt1.getText().toString());
                b = Float.parseFloat(txt2.getText().toString());
                c = Float.parseFloat(txt3.getText().toString());


            // Tính delta
            delta = b * b - 4 * a * c;

            // Kiểm tra điều kiện và chuyển activity
            if (delta < 0) {
                // Delta < 0, chuyển sang activity ptVoNghiem1
                Intent i = new Intent(giaiPT1.this, ptVoNghiem1.class);
                startActivity(i);
            } else if (delta == 0) {
                // Delta = 0, chuyển sang activity ptcoNghiemKep
                Intent i = new Intent(giaiPT1.this, ptcoNghiemKep.class);
                i.putExtra("so1", a);
                i.putExtra("so2", b);
                startActivity(i);
            } else {
                // Delta > 0, chuyển sang activity Ptco2Nghiem
                Intent i = new Intent(giaiPT1.this, Ptco2Nghiem.class);
                i.putExtra("so1", a);
                i.putExtra("so2", b);
                i.putExtra("so3", c);
                i.putExtra("delta", delta);
                startActivity(i);
            }
        });

        }
    }
