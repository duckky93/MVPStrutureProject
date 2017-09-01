package com.android.kyler.baseproject.RetrofitManager;

import com.android.kyler.baseproject.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.android.kyler.baseproject.Helpers.Constants.getBaseUrl;

/**
 * Created by kyler on 01/09/2017.
 */

public class RetrofitManager {

    public static Retrofit getRetrofit() {
        if (BuildConfig.IS_PRODUCTION_VERSION) {
            return new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(getBaseUrl())
                    .build();
        } else {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .readTimeout(60, TimeUnit.SECONDS)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .addInterceptor(interceptor)
                    .build();
            return new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(getBaseUrl())
                    .client(client)
                    .build();
        }
    }

}
