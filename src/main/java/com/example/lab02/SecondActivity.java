/** @author Ramazan Halid
        * @version 14.03.2020
        * */
package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String userEmail = intent.getStringExtra("userEmail");

        TextView textView = findViewById(R.id.Success);
        textView.setText("Welcome  " + userEmail);
    }
}