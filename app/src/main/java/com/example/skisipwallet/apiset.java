package com.example.skisipwallet;

import retrofit2.Call;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface apiset {
    @FormUrlEncoded
    @POST("auth/registration")
    Call<responsemodel_1>get_register(
            @Field("username") String username,
            @Field("email") String email,
            @Field("password") String password,
            @Field("password2") String password2


            );
    @FormUrlEncoded
    @POST("auth/login/")
    Call<responsemodel_1>get_login(
            @Field("email") String email,
            @Field("password") String password2


    );

    }


