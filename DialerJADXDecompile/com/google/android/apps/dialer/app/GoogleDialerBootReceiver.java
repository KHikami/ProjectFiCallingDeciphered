package com.google.android.apps.dialer.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import buf;

/* compiled from: PG */
public class GoogleDialerBootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            buf.R(context);
        }
    }
}
