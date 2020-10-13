package com.example.sepaasg1q3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private Button rRegister;
    private Button rBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        rBack=findViewById(R.id.rBack);
        rRegister=findViewById(R.id.rRegister);
        //Back Button code...
        rBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register.this,MainActivity.class);
                startActivity(intent);
            }
        });
        // Register button code...
        rRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"App under maintenance",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
