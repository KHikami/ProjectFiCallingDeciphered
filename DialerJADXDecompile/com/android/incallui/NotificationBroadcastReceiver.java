package com.android.incallui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bcj;
import bdf;

/* compiled from: PG */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String str = "Broadcast from Notification: ";
        String valueOf = String.valueOf(action);
        bdf.d(this, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (action.equals("com.android.incallui.ACTION_ANSWER_VIDEO_INCOMING_CALL")) {
            bcj.b().a(context, 3);
        } else if (action.equals("com.android.incallui.ACTION_ANSWER_VOICE_INCOMING_CALL")) {
            bcj.b().a(context, 0);
        } else if (action.equals("com.android.incallui.ACTION_DECLINE_INCOMING_CALL")) {
            bcj.b().b(context);
        } else if (action.equals("com.android.incallui.ACTION_HANG_UP_ONGOING_CALL")) {
            bcj.b().a(context);
        } else if (action.equals("com.android.incallui.ACTION_ACCEPT_VIDEO_UPGRADE_REQUEST")) {
            bcj.b().a(3, context);
        } else if (action.equals("com.android.incallui.ACTION_DECLINE_VIDEO_UPGRADE_REQUEST")) {
            bcj.b().c(context);
        } else if (action.equals("com.android.incallui.ACTION_PULL_EXTERNAL_CALL")) {
            bcj.b().g.a(intent.getIntExtra("com.android.incallui.extra.EXTRA_NOTIFICATION_ID", -1));
        }
    }
}
