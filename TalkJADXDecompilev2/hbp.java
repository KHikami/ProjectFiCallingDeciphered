package defpackage;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

public final class hbp extends Service {
    static String a = "action";
    static String d = "CMD";
    private static String g = "google.com/iid";
    private static String h = "gcm.googleapis.com/refresh";
    MessengerCompat b;
    BroadcastReceiver c;
    int e;
    int f;

    private void a() {
        synchronized (this) {
            this.e--;
            if (this.e == 0) {
                stopSelf(this.f);
            }
            if (Log.isLoggable("InstanceID", 3)) {
                int i = this.e;
                new StringBuilder(28).append("Stop ").append(i).append(" ").append(this.f);
            }
        }
    }

    private void a(int i) {
        synchronized (this) {
            this.e++;
            if (i > this.f) {
                this.f = i;
            }
        }
    }

    static void a(Context context, hbw hbw) {
        hbw.b();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra(d, "RST");
        intent.setPackage(context.getPackageName());
        context.startService(intent);
    }

    private void a(Intent intent) {
        hbo c;
        String stringExtra = intent.getStringExtra("subtype");
        if (stringExtra == null) {
            c = hbo.c(this);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("subtype", stringExtra);
            c = hbo.a(this, bundle);
        }
        String stringExtra2 = intent.getStringExtra(d);
        String str;
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                new StringBuilder(((String.valueOf(stringExtra).length() + 18) + String.valueOf(stringExtra2).length()) + String.valueOf(valueOf).length()).append("Service command ").append(stringExtra).append(" ").append(stringExtra2).append(" ").append(valueOf);
            }
            if (intent.getStringExtra("unregistered") != null) {
                hbw hbw = hbo.c;
                if (stringExtra == null) {
                    str = "";
                } else {
                    str = stringExtra;
                }
                hbw.d(str);
                hbo.d.a(intent);
                return;
            } else if (h.equals(intent.getStringExtra("from"))) {
                hbo.c.d(stringExtra);
                return;
            } else if ("RST".equals(stringExtra2)) {
                c.a();
                return;
            } else if ("RST_FULL".equals(stringExtra2)) {
                if (!hbo.c.a()) {
                    hbo.c.b();
                    return;
                }
                return;
            } else if ("SYNC".equals(stringExtra2)) {
                hbo.c.d(stringExtra);
                return;
            } else {
                "PING".equals(stringExtra2);
                return;
            }
        }
        if (Log.isLoggable("InstanceID", 3)) {
            str = "Register result in service ";
            stringExtra = String.valueOf(stringExtra);
            if (stringExtra.length() != 0) {
                str.concat(stringExtra);
            } else {
                stringExtra = new String(str);
            }
        }
        hbo.d.a(intent);
    }

    public IBinder onBind(Intent intent) {
        return (intent == null || !"com.google.android.gms.iid.InstanceID".equals(intent.getAction())) ? null : this.b.a();
    }

    public void onCreate() {
        IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentFilter.addCategory(getPackageName());
        registerReceiver(this.c, intentFilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    public void onDestroy() {
        unregisterReceiver(this.c);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        a(i2);
        if (intent == null) {
            a();
            return 2;
        }
        try {
            if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
                if (VERSION.SDK_INT <= 18) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("GSF");
                    if (intent2 != null) {
                        startService(intent2);
                        return 1;
                    }
                }
                a(intent);
            }
            a();
            if (intent.getStringExtra("from") != null) {
                iw.a(intent);
            }
            return 2;
        } finally {
            a();
        }
    }
}
