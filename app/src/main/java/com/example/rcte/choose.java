package com.example.rcte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class choose extends AppCompatActivity {

    TextView login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_choose);

        login=(TextView) findViewById(R.id.textView7);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });

        register=(TextView) findViewById(R.id.textView6);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpActivity();
            }
        });
    }

    public void openLoginActivity(){
        Intent intent=new Intent(this,Login_page.class);
        startActivity(intent);
    }
    public void openSignUpActivity(){
        Intent intent=new Intent(this,sign_up_page.class);
        startActivity(intent);
    }
}