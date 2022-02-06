package com.rabbi.musicalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondActivity.vedio_url="https://www.youtube.com/embed/p1yoQ83TG1k";
                Intent mycontent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(mycontent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondActivity.vedio_url="https://www.youtube.com/embed/xhITJgAc6pY";
                Intent mycontent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(mycontent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondActivity.vedio_url="https://www.youtube.com/embed/iJaq-BYKK-4";
                Intent mycontent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(mycontent);

            }
        });

    }
}