/**
 * @author Ramazan Halid
 * @version 14.03.2020
 * */

package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String actualUseEmail = "Ramazan35@gmail.com";
    public String actualPassword = "123123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        EditText editText = (EditText) findViewById(R.id.userEmail);
        String userName = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.userPassword);
        String userPassword = editText2.getText().toString();


        if (userName.equals(actualUseEmail) && userPassword.equals(actualPassword)){
             Intent intent = new Intent(this,SecondActivity.class);
             intent.putExtra("userEmail", userName);
             startActivity(intent);
        }
        else {
            TextView textView = findViewById(R.id.ErrorText);
            textView.setText("Username or Password wrong!");
        }

    }
}