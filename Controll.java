

package com.example.serverroomsec;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Controll extends AppCompatActivity {


    Button change,change2;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference1,databaseReference2,databaseReference3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controll);

        change = (Button) findViewById(R.id.change);
        change2 = (Button) findViewById(R.id.change2);



        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference1 = firebaseDatabase.getReference("Monitoring");

        //databaseReference1 = firebaseDatabase.getReference("status 3 is");

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference1.setValue(0);
            }
        });
        change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference1.setValue(1);
            }
        });







    }
}