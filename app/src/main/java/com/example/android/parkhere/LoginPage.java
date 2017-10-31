package com.example.android.parkhere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    EditText etuserName;
    EditText etuserPassword;
    Button register_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        etuserName = (EditText) findViewById(R.id.email);
        etuserPassword = (EditText) findViewById(R.id.userPassword);
        register_button = (Button) findViewById(R.id.register_button);
        TextView LoginLink = (TextView) findViewById(R.id.register_button);

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginPage.this, RegisterPage.class);
                LoginPage.this.startActivity(registerIntent);
            }
        });
    }
}
