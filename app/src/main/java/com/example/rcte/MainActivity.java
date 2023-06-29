package com.example.rcte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    ImageView bg_img, org_img, titl_img;
    TextView title, sub_title, start_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);



        bg_img=(ImageView) findViewById(R.id.imageView);
        org_img=(ImageView) findViewById(R.id.imageView4);
        title=(TextView) findViewById(R.id.textView);
        sub_title=(TextView) findViewById(R.id.textView2);
        titl_img=(ImageView) findViewById(R.id.imageView3);
        start_btn=(TextView) findViewById(R.id.button);

        YoYo.with(Techniques.FadeInUp).duration(1000).repeat(0).playOn(bg_img);
        YoYo.with(Techniques.FadeInRight).duration(3000).repeat(0).playOn(org_img);
        YoYo.with(Techniques.BounceInLeft).duration(4000).repeat(0).playOn(title);
        YoYo.with(Techniques.BounceInLeft).duration(5000).repeat(0).playOn(sub_title);
        YoYo.with(Techniques.BounceInLeft).duration(3000).repeat(0).playOn(titl_img);
        YoYo.with(Techniques.BounceInLeft).duration(6000).repeat(0).playOn(start_btn);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });


    }
    public void openActivity(){
        Intent intent=new Intent(this, choose.class);
        startActivity(intent);

    }
}