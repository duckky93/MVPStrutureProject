package com.android.kyler.baseproject.Activities.GithubUsername;

import com.android.kyler.baseproject.Entities.ExampleGithubProperty;

/**
 * Created by kyler on 01/09/2017.
 */

public interface IMainModel {

    void getUsername(OnGithubResponeListener onGithubResponeListener);

    interface OnGithubResponeListener{
        void onGithubRespones(ExampleGithubProperty exampleGithubProperty);
    }
}
