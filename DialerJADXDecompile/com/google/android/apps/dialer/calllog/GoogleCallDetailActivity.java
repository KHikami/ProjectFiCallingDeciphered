package com.google.android.apps.dialer.calllog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import bia;
import buf;
import com.android.dialer.app.CallDetailActivity;

/* compiled from: PG */
public class GoogleCallDetailActivity extends CallDetailActivity {
    public void onClick(View view) {
        if (view.getId() == buf.li) {
            String str = this.h;
            DialogFragment bia = new bia();
            Bundle bundle = new Bundle();
            bundle.putString("number", str);
            bia.setArguments(bundle);
            bia.show(getFragmentManager(), bia.a);
            return;
        }
        super.onClick(view);
    }
}
