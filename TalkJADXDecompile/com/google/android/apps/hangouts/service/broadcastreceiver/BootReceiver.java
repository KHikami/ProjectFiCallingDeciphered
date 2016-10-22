package com.google.android.apps.hangouts.service.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import bko;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import ect;
import fde;
import fnc;
import fqo;
import glk;
import java.util.List;
import jyn;

public class BootReceiver extends BroadcastReceiver {
    public static boolean a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("EsApplication", 0);
        boolean z = sharedPreferences.getBoolean("first_upgrade", true);
        sharedPreferences.edit().putBoolean("first_upgrade", false).apply();
        return z;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            glk.a("Babel", "Scheduling babel db cleanup after reboot", new Object[0]);
            if (a(context)) {
                RealTimeChatService.a(context, intent.getAction());
            }
            fqo.a(context);
            ((fnc) jyn.a(context, fnc.class)).a();
            SmsReceiver.a();
            bko k = fde.k();
            ect ect = (ect) jyn.a(context, ect.class);
            if (k != null) {
                ect.a(k.g(), true);
            }
            List<bko> o = fde.o();
            glk.d("Babel", "On boot, found " + o.size() + " ready accounts", new Object[0]);
            for (bko k2 : o) {
                String valueOf = String.valueOf(k2);
                glk.c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 20).append("babel boot account: ").append(valueOf).toString(), new Object[0]);
                if (k2 != null) {
                    ect.a(k2.g(), true);
                }
            }
        }
    }
}
