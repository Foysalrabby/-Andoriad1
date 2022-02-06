package com.rabbi.musicalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {
    WebView Vedioview;
    public static String vedio_url="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        Vedioview=findViewById(R.id.Vedioview);
        //vedio_url="https://www.youtube.com/embed/p1yoQ83TG1k";
        Vedioview.getSettings().setJavaScriptEnabled(true);
        //Vedioview.loadUrl("https://www.youtube.com/embed/p1yoQ83TG1k");
        Vedioview.loadUrl(vedio_url);
    }
}