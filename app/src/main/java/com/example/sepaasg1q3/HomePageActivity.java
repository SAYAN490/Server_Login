package com.example.sepaasg1q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toast.makeText(getApplicationContext(),"Logged in as Admin",Toast.LENGTH_SHORT).show();
    }
}
