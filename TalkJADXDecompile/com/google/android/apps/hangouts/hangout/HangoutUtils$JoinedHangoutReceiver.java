package com.google.android.apps.hangouts.hangout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dgg;
import did;
import glj;
import gwb;

public class HangoutUtils$JoinedHangoutReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("session");
        did s = dgg.a().s();
        if (s != null && s.l().equals(stringExtra)) {
            if ("com.google.android.apps.hangouts.hangout.joined".equals(intent.getAction())) {
                Intent a = gwb.a(s.e(), false, null, false, true, 51, s.J(), glj.b());
                a.setFlags(872415232);
                context.startActivity(a);
            } else if ("com.google.android.apps.hangouts.hangout.exit".equals(intent.getAction())) {
                s.b(11004);
            }
        }
    }
}
