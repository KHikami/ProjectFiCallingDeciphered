package com.android.dialer.app.calllog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
public class CallLogReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.NEW_VOICEMAIL".equals(intent.getAction())) {
            CallLogNotificationsService.a(context, intent.getData());
        } else if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            CallLogNotificationsService.a(context, null);
        } else {
            String valueOf = String.valueOf(intent);
            Log.w("CallLogReceiver", new StringBuilder(String.valueOf(valueOf).length() + 29).append("onReceive: could not handle: ").append(valueOf).toString());
        }
    }
}
