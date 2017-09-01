package com.android.kyler.baseproject.Activities.GithubUsername;

import com.android.kyler.baseproject.Entities.ExampleGithubProperty;
import com.android.kyler.baseproject.Helpers.CommonError;
import com.android.kyler.baseproject.Helpers.Utils;
import com.android.kyler.baseproject.RetrofitManager.Apis;
import com.android.kyler.baseproject.RetrofitManager.RetrofitManager;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kyler on 01/09/2017.
 */

public class MainModel implements IMainModel {

    @Override
    public void getUsername(final OnGithubResponeListener onGithubResponeListener) {
        Apis apis = RetrofitManager.getRetrofit().create(Apis.class);
        Call<JsonObject> call = apis.getUsername();
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                int code = response.code();
                if(code == CommonError.OK.getmCode()){
                    JsonObject responseJs = response.body();
                    ExampleGithubProperty exampleGithubProperty = Utils.getGson().fromJson(responseJs.toString(),ExampleGithubProperty.class);
                    onGithubResponeListener.onGithubRespones(exampleGithubProperty);
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }
}
