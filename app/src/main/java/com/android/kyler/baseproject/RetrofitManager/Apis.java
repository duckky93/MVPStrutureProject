package com.android.kyler.baseproject.RetrofitManager;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by kyler on 01/09/2017.
 */

public interface Apis {
    @GET("users/duckky93")
    Call<JsonObject> getUsername();

}
