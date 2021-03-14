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

public class MainActivity extends AppCompatActivity {
    public String actualUserName = "Ramazan35";
    public String actualPassword = "123123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View view){
        EditText editText = (EditText) findViewById(R.id.userName);
        String userName = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.userPassword);
        String userPassword = editText2.getText().toString();


        if (userName.equals(actualUserName) && userPassword.equals(actualPassword)){
             Intent intent = new Intent(this,SecondActivity.class);
             intent.putExtra("userName", userName);
             startActivity(intent);
        }
        else {
            Intent intent2 = new Intent(this,ThirdActivity.class);
            startActivity(intent2);
        }

    }
}