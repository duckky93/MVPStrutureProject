package com.android.kyler.baseproject.Helpers;

/**
 * Created by kyler on 01/09/2017.
 */

public enum CommonError {
    OK(200);

    int mCode;

    CommonError(int code){
        mCode = code;
    }

    public int getmCode() {
        return mCode;
    }
}
