package com.android.kyler.baseproject.BaseClasses;

import android.app.Application;

/**
 * Never store references to Context or View in your Presenter. This will result in memory leaks
 * as Presenter will outlive their lifecycle owner activity or fragment.
 * So we will use the Application instead of using Context to use the function that need
 * Context (ex: Database, Check Network, ...)
 */
public class BasePresenter{

    private Application mApplication;

    public BasePresenter(Application application){
        mApplication = application;
    }

    /**
     * Return the application.
     */
    public <T extends Application> T getApplication(){
        return (T) mApplication;
    }
}
