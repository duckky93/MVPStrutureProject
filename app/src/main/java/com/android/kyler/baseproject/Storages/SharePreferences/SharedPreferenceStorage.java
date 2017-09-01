package com.android.kyler.baseproject.Storages.SharePreferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.android.kyler.baseproject.Helpers.Constants;

/**
 * Created by kyler on 31/08/2017.
 */

public class SharedPreferenceStorage {
    private static SharedPreferenceStorage mSharedPreferenceStorage;

    public static void initialize(Context ctx) {
        if (mSharedPreferenceStorage == null) {
            mSharedPreferenceStorage = new SharedPreferenceStorage(ctx.getApplicationContext());
        }
    }

    public static void setGithubUsername(String githubUsername){
        mSharedPreferenceStorage.i_SetGithubUsername(githubUsername);
    }

    public String getGithubUsername(){
        return mSharedPreferenceStorage.getGithubUsername();
    }

//--------------------------------------------------------------------------------------------------

    private static final String NAMESPACE = "kyler.android.com";

    private static final String GITHUB_USERNAME = "GITHUB_USERNAME";

    private Context mApplicationContext;
    private SharedPreferences mSharedPreferences;

    private SharedPreferenceStorage(Context applicationContext) {
        mApplicationContext = applicationContext;
        mSharedPreferences = mApplicationContext.getSharedPreferences(NAMESPACE, Context.MODE_PRIVATE);
    }

    private void i_SetGithubUsername(String githubUsername){
        mSharedPreferences.edit().putString(GITHUB_USERNAME, githubUsername).commit();
    }

    private String i_GetGithubUsername(){
        return mSharedPreferences.getString(GITHUB_USERNAME, Constants.EMPTY);
    }
}
