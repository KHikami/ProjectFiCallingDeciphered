package com.google.android.apps.hangouts.telephony.rpc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ggt;
import glk;

public class TeleWifiCallingSettingsService extends Service {
    private ggt a;

    public void onCreate() {
        super.onCreate();
        this.a = new ggt(this);
    }

    public IBinder onBind(Intent intent) {
        if ("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService".equals(intent.getAction())) {
            return this.a;
        }
        glk.e("Babel_telephony", "Unknown binding action; ignoring", new Object[0]);
        return null;
    }
}
