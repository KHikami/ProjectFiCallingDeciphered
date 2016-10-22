package com.google.android.apps.hangouts.service.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bhl;
import fde;
import fdh;
import ftg;
import jyn;

public class AccountRefreshReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        if (intent.getAction().equals("com.google.android.apps.enterprise.dmagent.AUTO_REGISTRATION_FINISHED")) {
            if (intent.getStringExtra("dmagent_autoregister_error_code").equals("SUCCESS")) {
                fde.a();
                for (fdh fdh : fde.b.values()) {
                    if (!fdh.s() && fdh.g() > 102) {
                        fdh.h();
                    }
                }
            } else {
                return;
            }
        } else if (intent.getAction().equals("android.accounts.LOGIN_ACCOUNTS_CHANGED")) {
            z = true;
        }
        ((bhl) jyn.a(context, bhl.class)).a(new ftg(z));
    }
}
