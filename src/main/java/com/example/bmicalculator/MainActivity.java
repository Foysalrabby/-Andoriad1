package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button  claculate;
    EditText editweight;
    EditText editheight;
    EditText editheight2;
    TextView dispalytxt;
    TextView dispalytxt12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        claculate=findViewById(R.id.claculate);
        editweight=findViewById(R.id.editweight);
        editheight=findViewById(R.id.editheight);
        editheight2=findViewById(R.id.editheight2);
        dispalytxt=findViewById(R.id.dispalytxt);
        dispalytxt12=findViewById(R.id.dispalytxt12);
        claculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(editweight.length() > 0 && editheight.length() > 0 && editheight2.length() > 0){
                    String editweight1=editweight.getText().toString();
                    float finalweight=Float.parseFloat(editweight1);

                    String editheight1=editheight.getText().toString();
                    Float getheight=Float.parseFloat(editheight1);
                    float finalheightfoot= (float) (getheight*0.3048);

                    String editheight12=editheight2.getText().toString();
                    Float getheight121=Float.parseFloat(editheight12);
                    float finalheightinch= (float) (getheight121*0.0254);

                    float height=finalheightfoot+finalheightinch;

                    float calbmi=finalweight/(height*height);
                    dispalytxt.setText("Your Bmi ="+calbmi);
                    if(calbmi<= 23 ){
                        dispalytxt12.setText("YOu are fit");
                    }
                    else if(calbmi>=24 ){
                        dispalytxt12.setText("YOu are to  fat");
                    }else{
                        dispalytxt12.setText("you are fatty");
                    }

                }
                else{

                    Toast.makeText(MainActivity.this,"Please Enter number",Toast.LENGTH_LONG).show();
                }



            }
        });





    }
}