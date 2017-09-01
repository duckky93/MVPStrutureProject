package com.android.kyler.baseproject.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.kyler.baseproject.Storages.SharePreferences.SharedPreferenceStorage;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferenceStorage.initialize(this); //Initialize the SharedPreferences for late using
    }



}
