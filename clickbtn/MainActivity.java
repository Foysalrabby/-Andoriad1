package com.example.clickbuuton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
          TextView Edtext1,displaytext11;
          Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edtext1=findViewById(R.id.Edtext1);
        displaytext11=findViewById(R.id.text11);
        mybutton=findViewById(R.id.mybutton);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String collectName=Edtext1.getText().toString();
                displaytext11.setText("Hello"+collectName);
            }
        });

    }
}