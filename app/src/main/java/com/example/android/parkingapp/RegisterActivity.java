package com.example.android.parkingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText registerUserNameText = (EditText)findViewById(R.id.registerUserName);
        final EditText registerUserPassword1 = (EditText)findViewById(R.id.registerUserPassword1);
        final EditText registerUserPassword2 = (EditText)findViewById(R.id.registerUserPassword2);
        final Button registerToDatabaseButton = (Button) findViewById(R.id.registerToDatabaseButton);

    }
}
