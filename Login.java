package com.example.serverroomsec;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    String username = "admin";
    String password = "admin";
    String getUsername,getPassword;

    EditText uname;
    EditText pw;
    Button login;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uname = (EditText) findViewById(R.id.uname);
        pw = (EditText) findViewById(R.id.pw);
        login =(Button) findViewById(R.id.log);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (uname.getText().toString().equals("") || pw.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Enter user Name and Password",Toast.LENGTH_SHORT).show();

                }
                else {
                    getUsername = uname.getText().toString();
                    getPassword = pw.getText().toString();
                    if (getUsername.equals(username) ){
                        Intent intent = new Intent(Login.this, Controll.class);
                        startActivity(intent);

                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Enter Valid user Name and Valid Password",Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });

    }
}