package com.google.android.apps.hangouts.realtimechat;

import android.content.Context;
import android.content.Intent;
import glj;
import gwb;
import iw;

@Deprecated
public class MessagesAvailableReceiver extends iw {
    public void onReceive(Context context, Intent intent) {
        if (!gwb.a(gwb.H(), "babel_enable_gcm_message_receiver", false)) {
            intent.putExtra("timestamp", glj.b() * 1000);
            intent.setClass(context, GcmIntentService.class);
            iw.a(context, intent);
            setResultCode(-1);
        }
    }
}
