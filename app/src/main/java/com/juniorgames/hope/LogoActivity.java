package com.juniorgames.hope;

import android.animation.ObjectAnimator;
//import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class LogoActivity extends AppCompatActivity {
    private ImageView imageView;
    private ObjectAnimator objectAnimator;
    private long dur = 5000;
    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_logo);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageView = findViewById(R.id.logo);
        objectAnimator = ObjectAnimator.ofFloat(imageView,View.ALPHA,0.0f,1.0f);
        objectAnimator.setDuration(dur);
        objectAnimator.start();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i=new Intent(LogoActivity.this,GameActivity.class);
                startActivity(i);
                finish();//close this activity
            }
        },5000);

    }
}
