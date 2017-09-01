package com.android.kyler.baseproject.Fragments.Dialog;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.kyler.baseproject.R;

public class ConfirmDialog extends BaseDialogFragment<Boolean> implements View.OnClickListener {

    protected TextView tvTitle, tvMessage;
    protected Button btOk, btCancel;

    @Override
    protected int getLayout() {
        return R.layout.dialog_confirm;
    }

    @Override
    protected void initView(View view) {
        tvTitle = view.findViewById(R.id.title);
        tvMessage = view.findViewById(R.id.message);
        btOk = view.findViewById(R.id.ok);
        btCancel = view.findViewById(R.id.cancel);
        btOk.setOnClickListener(this);
        btCancel.setOnClickListener(this);
        setValueListener(false);
    }

    @Override
    protected void setUpData() {
        if (tvTitle != null) tvTitle.setText(mTitle);
        if (tvMessage != null) tvMessage.setText(mMessage);
        if (btOk != null) btOk.setText("OK");
        if (btCancel != null) btCancel.setText("Cancel");
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ok:
                setValueListener(true);
                dismiss();
                break;
            case R.id.cancel:
                setValueListener(false);
                dismiss();
                break;
        }
    }
}
