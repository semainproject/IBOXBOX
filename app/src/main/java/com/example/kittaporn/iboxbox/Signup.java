package com.example.kittaporn.iboxbox;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Signup extends AppCompatActivity {
    EditText emailTx,passwordTx;
    Button backBtn;
    FloatingActionButton signupBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        emailTx = (EditText) findViewById(R.id.email);
        passwordTx = (EditText) findViewById(R.id.password);
        backBtn = (Button) findViewById(R.id.back_btn);
        signupBtn = (FloatingActionButton) findViewById(R.id.accep_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this,LoginActivity.class);
                startActivity(intent);

            }
        });
    }


}
