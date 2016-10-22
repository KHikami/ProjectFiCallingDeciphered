package com.android.incallui.spam;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import aup;
import buf;
import rl;
import rq;

/* compiled from: PG */
public class SpamNotificationService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
        } else {
            String stringExtra = intent.getStringExtra("service_phone_number");
            int intExtra = intent.getIntExtra("service_notification_id", 1);
            String g = buf.g((Context) this);
            ((NotificationManager) getSystemService("notification")).cancel(stringExtra, intExtra);
            String action = intent.getAction();
            int i3 = -1;
            switch (action.hashCode()) {
                case -1292075633:
                    if (action.equals("com.android.incallui.spam.ACTION_MARK_NUMBER_AS_NOT_SPAM")) {
                        i3 = 1;
                        break;
                    }
                    break;
                case -474617725:
                    if (action.equals("com.android.incallui.spam.ACTION_MARK_NUMBER_AS_SPAM")) {
                        i3 = 0;
                        break;
                    }
                    break;
            }
            switch (i3) {
                case rl.c /*0*/:
                    a(intent, 1026);
                    buf.J(this).a(stringExtra, g, 1, 2);
                    new aup(this).a(null, stringExtra, g);
                    break;
                case rq.b /*1*/:
                    a(intent, 1027);
                    buf.J(this).b(stringExtra, g, 1, 2);
                    break;
            }
            stopSelf();
        }
        return 2;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    private final void a(Intent intent, int i) {
        buf.H(this).a(i, intent.getStringExtra("service_call_id"), intent.getLongExtra("service_call_start_time_millis", 0));
    }
}
