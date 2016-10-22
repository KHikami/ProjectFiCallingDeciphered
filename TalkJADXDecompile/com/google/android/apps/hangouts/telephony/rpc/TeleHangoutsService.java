package com.google.android.apps.hangouts.telephony.rpc;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import gbz;
import ggc;
import glk;

public class TeleHangoutsService extends Service {
    public IBinder onBind(Intent intent) {
        if ("com.google.android.apps.hangouts.telephony.ITeleHangoutsService".equals(intent.getAction())) {
            int b = ggc.a((Context) this).b();
            if (b != -1) {
                return new gbz(this, b);
            }
            glk.c("Babel_telephony", "No account; not establishing binding.", new Object[0]);
            return null;
        }
        glk.e("Babel_telephony", "TeleHangoutService.onBind, unknown action; not binding", new Object[0]);
        return null;
    }
}
