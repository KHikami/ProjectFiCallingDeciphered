package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.apps.hangouts.telephony.TeleActivityRecognitionService;
import com.google.android.gms.common.ConnectionResult;

final class gfe implements guk, gul {
    gfg f15131a;
    private final Context f15132b;
    private final BroadcastReceiver f15133c = new gff(this);
    private final gfh f15134d;
    private final gui f15135e;

    gfe(Context context) {
        this.f15132b = context;
        if (gtt.m18579a(context) == 0) {
            this.f15135e = new guj(context).m18639a(hiz.f17034b).m18641a((guk) this).m18642a((gul) this).m18645b();
            this.f15134d = new gfh(this);
            return;
        }
        glk.m17981d("Babel_telephony", "TeleUserActivityMonitor.TeleUserActivityMonitor: Wifi call activity recognition API can not be started. Google Play service is not available.", new Object[0]);
        this.f15135e = null;
        this.f15134d = null;
    }

    private PendingIntent m17495b() {
        return PendingIntent.getService(this.f15132b, 0, new Intent(this.f15132b, TeleActivityRecognitionService.class), 134217728);
    }

    public static String m17496b(int i) {
        switch (i) {
            case 0:
                return "IN_VEHICLE";
            case 1:
                return "ON_BICYCLE";
            case 2:
                return "ON_FOOT";
            case 3:
                return "STILL";
            case 5:
                return "TILTING";
            case 7:
                return "WALKING";
            case 8:
                return "RUNNING";
            default:
                return "UNKNOWN";
        }
    }

    public void m17500a(gfg gfg) {
        glk.m17979c("Babel_telephony", "TeleUserActivityMonitor.register", new Object[0]);
        this.f15131a = gfg;
        this.f15135e.mo2518b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.hangouts.user_activity_action");
        this.f15132b.registerReceiver(this.f15133c, intentFilter);
    }

    public void a_(Bundle bundle) {
        glk.m17979c("Babel_telephony", "TeleUserActivityMonitor.onConnected, connection to activity recognition API established.", new Object[0]);
        hiz.f17035c.m19896a(this.f15135e, 0, m17495b());
    }

    public void mo1150a(int i) {
        glk.m17979c("Babel_telephony", "TeleUserActivityMonitor.onConnectionSuspended, suspended activity recognition API connection.", new Object[0]);
    }

    public void mo1151a(ConnectionResult connectionResult) {
        glk.m17979c("Babel_telephony", "TeleUserActivityMonitor.onConnectionFailed, connection to activity recognition API failed.", new Object[0]);
    }

    public void m17497a() {
        this.f15131a = null;
        if (this.f15135e.mo2524e()) {
            hiz.f17035c.m19897a(this.f15135e, m17495b());
        }
        this.f15135e.mo2523d();
        this.f15132b.unregisterReceiver(this.f15133c);
    }
}
