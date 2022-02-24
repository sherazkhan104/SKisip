package com.example.skisipwallet;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiController {
    public static final String url="https://exarthdev4.pythonanywhere.com/";
    private static apiController user_register;
    private static Retrofit retrofitApi;

    // Api controller constructor
    apiController()
    {
        retrofitApi=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
    public static synchronized apiController getInstance()
    {
        if (user_register==null)
            user_register=new apiController();
        return  user_register;
    }
    apiset getApi()
    {
        return retrofitApi.create(apiset.class);

    }

}
