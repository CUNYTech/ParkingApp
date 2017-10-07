package com.example.android.parkingapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by mingjingtang on 10/1/17.
 */

public interface GitHubService {
    @POST("users/{user}/{password} /repos")
    Call<User> postUser(@Path("user")String user,@Path("password") String password);
}