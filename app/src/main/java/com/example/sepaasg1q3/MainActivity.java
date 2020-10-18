package com.example.sepaasg1q3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;


public class MainActivity extends AppCompatActivity {

    private EditText eName; //variable for name
    private EditText ePassword; //variable for password
    private Button eLogin;
    private Button eRegister;
    private TextView eAttemptsInfo;


    private String username="Admin";
    private String Password="1234";
    boolean isValid=false;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Welcome to Login Page",Toast.LENGTH_LONG).show();

        eName=findViewById(R.id.etName);
        ePassword=findViewById(R.id.etPassword);
        eLogin=findViewById((R.id.btnLogin));
        eRegister=findViewById((R.id.btnRegister));
        eAttemptsInfo=findViewById((R.id.tvinfo));


        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName=eName.getText().toString();
                String inputPassword=ePassword.getText().toString();
                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please enter details correctly",Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        isValid=validate(inputName,inputPassword);
                        if(!isValid)
                        {
                            counter--;
                            Toast.makeText(getApplicationContext(),"Invalid details",Toast.LENGTH_LONG).show();
                            eAttemptsInfo.setText("No of incorrect attempts: "+ counter);
                            if (counter==0)
                            {
                                eLogin.setEnabled(false);
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Logged in",Toast.LENGTH_LONG).show();
                            //code for next page starts here .......
                            Intent intent=new Intent(MainActivity.this,HomePageActivity.class);
                            startActivity(intent);
                        }

                    }


            }
        });

        eRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for register button
                Toast.makeText(getApplicationContext(),"Registration Page",Toast.LENGTH_LONG).show();
                //Linking done here...
                Intent intent=new Intent(MainActivity.this,Register.class);
                startActivity(intent);
            }
        });


    }
    /*
    public void login(View view)//Popup for login button
    {
        Toast.makeText(getApplicationContext(),"App Under Maintenance",Toast.LENGTH_SHORT).show();
    }
    public void reg(View view)//Popup for reg button
    {
        Toast.makeText(getApplicationContext(),"Registration will open soon...",Toast.LENGTH_SHORT).show();
    }*/
    
    //password validator
    private boolean validate(String name,String password)
    {
        if(name.equals(username) && password.equals(Password))
        {
            return true;
        }
        return false;
    }
}
