package com.rabbi.degitaltuasbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvcount;
    Button Addbutton,Sunbutton,Resetbuton;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvcount=findViewById(R.id.tvcount);
        Addbutton=findViewById(R.id.Addbutton);
        Sunbutton=findViewById(R.id.Sunbutton);
        Resetbuton=findViewById(R.id.Resetbuton);

        Addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //count=count + 1;
                count++;
                tvcount.setText(""+count);
            }
        });

        Sunbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tvcount.setText(""+count);
            }
        });
        Resetbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tvcount.setText(""+count);
            }
        });


    }





}