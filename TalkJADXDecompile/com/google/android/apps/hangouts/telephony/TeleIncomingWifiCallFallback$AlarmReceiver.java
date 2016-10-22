package com.google.android.apps.hangouts.telephony;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import gdl;
import gdn;
import gdo;
import glk;
import gwb;
import iil;

public class TeleIncomingWifiCallFallback$AlarmReceiver extends BroadcastReceiver implements gdn {
    private boolean a;

    public void onReceive(Context context, Intent intent) {
        glk.c("Babel_telephony", "TeleIncomingWifiCallFallback.AlarmReceiver.onReceive", new Object[0]);
        gdo a = gdo.a(intent.getBundleExtra("invite_info"));
        if (gwb.a(context, a.f, a.a)) {
            new gdl(context, this, (TelecomManager) context.getSystemService("telecom"), a, true).b();
            iil.a("Expected condition to be true", this.a);
            return;
        }
        glk.c("Babel_telephony", "TeleIncomingWifiCallFallback.AlarmReceiver.onReceive, invite was cancelled", new Object[0]);
        gwb.a(context, a.f, a.b, 2337);
    }

    public void a(gdl gdl) {
        glk.c("Babel_telephony", "TeleIncomingWifiCallFallback.AlarmReceiver.onInviteCompleted", new Object[0]);
        this.a = true;
    }
}
