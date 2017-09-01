package com.android.kyler.baseproject.Activities.GithubUsername;

import android.app.Application;

import com.android.kyler.baseproject.BaseClasses.BasePresenter;
import com.android.kyler.baseproject.Entities.ExampleGithubProperty;
import com.android.kyler.baseproject.Helpers.Utils;

/**
 * Created by kyler on 01/09/2017.
 */

public class MainPresenterImpl extends BasePresenter implements IMainPresenter, IMainModel.OnGithubResponeListener {

    IMainView mMainView;
    IMainModel mMainModel;

    public MainPresenterImpl(Application application, IMainView mainView) {
        super(application);
        mMainView = mainView;
        mMainModel = new MainModel();
    }

    @Override
    public void getUsername() {
        if(mMainModel != null) {
            if(Utils.isNetworkAvailable(this.getApplication())) {
                mMainModel.getUsername(this);
            }
        }
    }

    @Override
    public void onGithubRespones(ExampleGithubProperty exampleGithubProperty) {
        if(mMainView != null){
            mMainView.onGithubRespones(exampleGithubProperty);
        }
    }
}
