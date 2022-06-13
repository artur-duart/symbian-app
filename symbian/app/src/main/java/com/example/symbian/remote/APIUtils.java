package com.example.symbian.remote;

public class APIUtils {

//    INSERIR IP

    private static final String API_URL = "http://000.000.0.00:3000/";

    public static RouterInterface symbianInterface() {

        return RetrofitClient.getClient(API_URL)
                .create(RouterInterface.class);
    }
}
