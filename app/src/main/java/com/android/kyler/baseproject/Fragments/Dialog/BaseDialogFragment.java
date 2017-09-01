package com.android.kyler.baseproject.Fragments.Dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.android.kyler.baseproject.Helpers.Constants;

/**
 * T is the object that the listener will return when dialog is dismissed
 * (Ex: T could be Boolean, Enum, String, Integer,... If dialog just show information just let T
 * is Void)
 */
public abstract class BaseDialogFragment<T> extends DialogFragment {

    private final String TAG = getClass().getName();

    protected String mTitle;
    protected String mMessage;

    protected DialogListener<T> mListener;
    protected T mValueListener;

    public BaseDialogFragment() {
        mTitle = Constants.EMPTY;
        mMessage = Constants.EMPTY;
    }

    /**
     * Declare the Layout resource(int)
     * @return
     */
    protected abstract int getLayout();

    /**
     * Initialize the View such as TextView, Button, ...
     * @param view
     */
    protected abstract void initView(View view);

    /**
     * Fill the data (title, message,...) into Views
     */
    protected abstract void setUpData();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayout(), container, false);
        initView(view);
        setUpData();
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        return view;
    }

    /**
     * This TAG will return the class name
     * @return
     */
    public String getTAG(){
        return TAG;
    }

    public void setTitle(String title){
        mTitle = title;
    }

    public void setMessage(String message){
        mMessage = message;
    }

    public void setListener(DialogListener<T> listener){
        mListener = listener;
    }

    protected T getValueListener(){
        return mValueListener;
    }

    protected void setValueListener(T valueListener){
        mValueListener = valueListener;
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        if (mListener != null) {
            mListener.onDialogClosed(mValueListener);
        }
    }

    public interface DialogListener<T> {
        void onDialogClosed(T result);
    }

}
