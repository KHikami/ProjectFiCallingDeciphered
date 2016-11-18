package p000;

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
    static String f16528a = "action";
    static String f16529d = "CMD";
    private static String f16530g = "google.com/iid";
    private static String f16531h = "gcm.googleapis.com/refresh";
    MessengerCompat f16532b;
    BroadcastReceiver f16533c;
    int f16534e;
    int f16535f;

    private void m19153a() {
        synchronized (this) {
            this.f16534e--;
            if (this.f16534e == 0) {
                stopSelf(this.f16535f);
            }
            if (Log.isLoggable("InstanceID", 3)) {
                int i = this.f16534e;
                new StringBuilder(28).append("Stop ").append(i).append(" ").append(this.f16535f);
            }
        }
    }

    private void m19154a(int i) {
        synchronized (this) {
            this.f16534e++;
            if (i > this.f16535f) {
                this.f16535f = i;
            }
        }
    }

    static void m19155a(Context context, hbw hbw) {
        hbw.m19186b();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra(f16529d, "RST");
        intent.setPackage(context.getPackageName());
        context.startService(intent);
    }

    private void m19156a(Intent intent) {
        hbo c;
        String stringExtra = intent.getStringExtra("subtype");
        if (stringExtra == null) {
            c = hbo.m19149c(this);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("subtype", stringExtra);
            c = hbo.m19144a(this, bundle);
        }
        String stringExtra2 = intent.getStringExtra(f16529d);
        String str;
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                new StringBuilder(((String.valueOf(stringExtra).length() + 18) + String.valueOf(stringExtra2).length()) + String.valueOf(valueOf).length()).append("Service command ").append(stringExtra).append(" ").append(stringExtra2).append(" ").append(valueOf);
            }
            if (intent.getStringExtra("unregistered") != null) {
                hbw hbw = hbo.f16521c;
                if (stringExtra == null) {
                    str = "";
                } else {
                    str = stringExtra;
                }
                hbw.m19188d(str);
                hbo.f16522d.m19171a(intent);
                return;
            } else if (f16531h.equals(intent.getStringExtra("from"))) {
                hbo.f16521c.m19188d(stringExtra);
                return;
            } else if ("RST".equals(stringExtra2)) {
                c.m19151a();
                return;
            } else if ("RST_FULL".equals(stringExtra2)) {
                if (!hbo.f16521c.m19184a()) {
                    hbo.f16521c.m19186b();
                    return;
                }
                return;
            } else if ("SYNC".equals(stringExtra2)) {
                hbo.f16521c.m19188d(stringExtra);
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
        hbo.f16522d.m19171a(intent);
    }

    public IBinder onBind(Intent intent) {
        return (intent == null || !"com.google.android.gms.iid.InstanceID".equals(intent.getAction())) ? null : this.f16532b.m9762a();
    }

    public void onCreate() {
        IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentFilter.addCategory(getPackageName());
        registerReceiver(this.f16533c, intentFilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    public void onDestroy() {
        unregisterReceiver(this.f16533c);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m19154a(i2);
        if (intent == null) {
            m19153a();
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
                m19156a(intent);
            }
            m19153a();
            if (intent.getStringExtra("from") != null) {
                iw.m8984a(intent);
            }
            return 2;
        } finally {
            m19153a();
        }
    }
}
