package com.rabbi.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;
    Animation myanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button1);
        imageView=findViewById(R.id.imageView1);
             Picasso.get()
               .load("https://hstu.ac.bd/img/home/slider/33.jpg")
               .into(imageView);


        myanim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.up_from_bottom);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //JAKE ANIMATED button click korle image change hobe
                Picasso.get()
                        .load("https://irt.hstu.ac.bd/assets_vcc/images/slideshow/main-gate.jpg")
                        .placeholder(R.drawable.man)   //load hoyar age dekhabe internet na thakle
                        .resize(200,200)
                        .into(imageView);    //image veiw modde dekabe
            }
        });

    }
}