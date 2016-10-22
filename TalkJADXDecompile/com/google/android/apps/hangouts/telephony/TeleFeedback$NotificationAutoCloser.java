package com.google.android.apps.hangouts.telephony;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TeleFeedback$NotificationAutoCloser extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        ((NotificationManager) context.getSystemService("notification")).cancel("telephony_call_feedback", intent.getIntExtra("telephony_id", -1));
    }
}
