package com.android.dialer.app.calllog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
public class MissedCallNotificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.telecom.action.SHOW_MISSED_CALLS_NOTIFICATION".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.telecom.extra.NOTIFICATION_COUNT", -1);
            String stringExtra = intent.getStringExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER");
            Intent intent2 = new Intent(context, CallLogNotificationsService.class);
            intent2.setAction("com.android.dialer.calllog.UPDATE_MISSED_CALL_NOTIFICATIONS");
            intent2.putExtra("MISSED_CALL_COUNT", intExtra);
            intent2.putExtra("MISSED_CALL_NUMBER", stringExtra);
            context.startService(intent2);
        }
    }
}
