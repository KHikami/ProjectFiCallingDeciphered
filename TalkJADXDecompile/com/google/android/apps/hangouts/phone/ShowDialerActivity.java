package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.text.TextUtils;
import gjg;
import glk;
import gwb;
import jzp;

public class ShowDialerActivity extends jzp {
    public void onResume() {
        boolean z;
        boolean z2 = true;
        super.onResume();
        if (new gjg(this, "com.google.android.apps.hangouts.phone.notify_external_interruption", "com.google.android.apps.hangouts.phone.block_external_interruption").a()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Intent intent = getIntent();
            Object action = intent.getAction();
            if (action == null) {
                glk.d("Babel", "Received null action when launching Dialer Activity", new Object[0]);
            } else if (action.equals("android.intent.action.MAIN")) {
                glk.a("Babel", "Received ACTION_MAIN when launching Dialer Activity", new Object[0]);
            } else {
                z2 = false;
            }
            if (z2) {
                action = "com.google.android.apps.hangouts.phone.recentcalls";
            }
            Intent g = gwb.g(null);
            if (TextUtils.equals(action, "com.google.android.apps.hangouts.phone.dialpad")) {
                Object stringExtra = intent.getStringExtra("number_to_call");
                if (!TextUtils.isEmpty(stringExtra)) {
                    g.putExtra("number_to_call", stringExtra);
                }
            }
            g.setAction(action);
            g.putExtra("use_dialer_activity", false);
            startActivity(g);
        }
        finish();
    }
}
