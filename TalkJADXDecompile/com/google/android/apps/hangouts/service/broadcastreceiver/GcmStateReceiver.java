package com.google.android.apps.hangouts.service.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import biw;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import fhk;
import gwb;
import jyn;

public class GcmStateReceiver extends BroadcastReceiver {
    public static volatile boolean a;

    static {
        a = true;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("com.google.android.gcm.CONNECTED")) {
            a(true, context);
        } else if (action.equals("com.google.android.gcm.DISCONNECTED")) {
            a(false, context);
        }
        if ((action.equals("android.intent.action.GTALK_CONNECTED") || action.equals("com.google.android.gcm.CONNECTED")) && RequestWriter.g) {
            gwb.H().startService(RequestWriter.n());
        }
    }

    private static void a(boolean z, Context context) {
        if (((biw) jyn.a(context, biw.class)).a("babel_gcm_change_notification", false) && z != a) {
            RealTimeChatService.i.post(new fhk());
            a = z;
        }
    }
}
