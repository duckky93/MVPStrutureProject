package com.android.kyler.baseproject.Helpers;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.google.gson.Gson;

/**
 * Created by kyler on 01/09/2017.
 */

public class Utils {

    public static Gson mGson;

    public static Gson getGson(){
        if(mGson == null){
            mGson = new Gson();
        }
        return mGson;
    }

    public static boolean isNetworkAvailable(Application application) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) application.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
