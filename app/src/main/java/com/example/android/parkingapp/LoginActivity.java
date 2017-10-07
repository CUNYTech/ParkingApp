package com.example.android.parkingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {
//    void foo() {
//    }
//
//    void foo(String dog) {
//    }
//
//    void foo(User userHat) {
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText userName = (EditText) findViewById(R.id.userName);
        final EditText userPassword = (EditText) findViewById(R.id.userPassword);

//        final Button login_button = (Button) findViewById(R.id.login_button);
//        login_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent loginIntent = new Intent(LoginActivity.this, SearchBarActivity.class);
//                startActivity(loginIntent);
//            }
//        });


        final Button register_button = (Button)findViewById(R.id.register_button);
        register_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });




//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://awsapi.com/CUNYTech/ParkingApp")
//                .build();
//
//        GitHubService service = retrofit.create(GitHubService.class);
//        service.postUser("","").enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//                response.body().
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//
//            }
//        });
//
//        service.postUser().enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//
//            }
//        });

    }
}
