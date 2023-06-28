package com.example.rcte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sign_up_page extends AppCompatActivity {

    TextView login,register;
    TextInputLayout password;

    TextInputEditText memname,phnumber,pranali,password1;

    DatabaseReference reff;

    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sign_up_page);

        memname=(TextInputEditText) findViewById(R.id.textinputedittext1);
        phnumber=(TextInputEditText) findViewById(R.id.textinputedittext2);
        pranali=(TextInputEditText) findViewById(R.id.textinputedittext3);
        password1=(TextInputEditText) findViewById(R.id.textinputedittext4);

        register=(TextView) findViewById(R.id.textView5);
        member=new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String name=String.format(memname.getText().toString().trim());
                int number =Integer.parseInt(phnumber.getText().toString().trim());
                int p_id=Integer.parseInt(pranali.getText().toString().trim());
                //String pass=String.format(password1.getText().toString().trim());

                member.setName(memname.getText().toString().trim());
                member.setNumber(number);
                member.setP_id(p_id);
                member.setPass(password1.getText().toString().trim());
                reff.push().setValue(member);
                Toast.makeText(sign_up_page.this, "Successfull", Toast.LENGTH_SHORT).show();
            }
        });

        login=(TextView) findViewById(R.id.textView8);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });
    }
    public void openLoginActivity(){
        Intent intent=new Intent(this,Login_page.class);
        startActivity(intent);
    }
}