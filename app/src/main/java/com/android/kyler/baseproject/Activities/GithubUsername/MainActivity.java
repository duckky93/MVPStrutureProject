package com.android.kyler.baseproject.Activities.GithubUsername;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.kyler.baseproject.Activities.BaseActivity;
import com.android.kyler.baseproject.Entities.ExampleGithubProperty;
import com.android.kyler.baseproject.Fragments.Dialog.BaseDialogFragment;
import com.android.kyler.baseproject.Fragments.Dialog.ConfirmDialog;
import com.android.kyler.baseproject.R;

public class MainActivity extends BaseActivity implements IMainView{

    IMainPresenter mMainPresenter;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        mMainPresenter = new MainPresenterImpl(getApplication(), this);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConfirmDialog confirmDialog = new ConfirmDialog();
                confirmDialog.setListener(new BaseDialogFragment.DialogListener<Boolean>() {
                    @Override
                    public void onDialogClosed(Boolean result) {
                        mMainPresenter.getUsername();
                    }
                });
                confirmDialog.setTitle("Kyler");
                confirmDialog.setMessage("Request Username");
                confirmDialog.show(getSupportFragmentManager(), confirmDialog.getTAG());
            }
        });
    }

    @Override
    public void onGithubRespones(ExampleGithubProperty exampleGithubProperty) {
        tv.setText(exampleGithubProperty.getLogin());
    }
}
