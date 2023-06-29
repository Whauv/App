package com.example.rcte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_page extends AppCompatActivity {


    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

       loginButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Intent intent=new Intent(Login_page.this,movetomain.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login_page.this, "Login failed :/", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}