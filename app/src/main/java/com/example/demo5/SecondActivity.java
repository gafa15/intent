package com.example.demo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView welcomeTextview= findViewById(R.id.textViewWelcome);
        String username = getIntent().getStringExtra("USERNAME");

        welcomeTextview.setText(username);

    }
}oo