package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import fde;

public final class AbortSmsReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (VERSION.SDK_INT < 19 && fde.i() && !SmsReceiver.a(intent)) {
            abortBroadcast();
        }
    }
}
