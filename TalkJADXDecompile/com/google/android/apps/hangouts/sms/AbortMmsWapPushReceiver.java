package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import fde;

public class AbortMmsWapPushReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.provider.Telephony.WAP_PUSH_RECEIVED".equals(intent.getAction()) && "application/vnd.wap.mms-message".equals(intent.getType()) && VERSION.SDK_INT < 19 && fde.i()) {
            abortBroadcast();
        }
    }
}
