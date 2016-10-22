import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.apps.hangouts.telephony.TeleActivityRecognitionService;
import com.google.android.gms.common.ConnectionResult;

final class gfe implements guk, gul {
    gfg a;
    private final Context b;
    private final BroadcastReceiver c;
    private final gfh d;
    private final gui e;

    gfe(Context context) {
        this.c = new gff(this);
        this.b = context;
        if (gtt.a(context) == 0) {
            this.e = new guj(context).a(hiz.b).a((guk) this).a((gul) this).b();
            this.d = new gfh(this);
            return;
        }
        glk.d("Babel_telephony", "TeleUserActivityMonitor.TeleUserActivityMonitor: Wifi call activity recognition API can not be started. Google Play service is not available.", new Object[0]);
        this.e = null;
        this.d = null;
    }

    private PendingIntent b() {
        return PendingIntent.getService(this.b, 0, new Intent(this.b, TeleActivityRecognitionService.class), 134217728);
    }

    public static String b(int i) {
        switch (i) {
            case wi.w /*0*/:
                return "IN_VEHICLE";
            case wi.j /*1*/:
                return "ON_BICYCLE";
            case wi.l /*2*/:
                return "ON_FOOT";
            case wi.z /*3*/:
                return "STILL";
            case wi.p /*5*/:
                return "TILTING";
            case wi.q /*7*/:
                return "WALKING";
            case wi.m /*8*/:
                return "RUNNING";
            default:
                return "UNKNOWN";
        }
    }

    public void a(gfg gfg) {
        glk.c("Babel_telephony", "TeleUserActivityMonitor.register", new Object[0]);
        this.a = gfg;
        this.e.b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.hangouts.user_activity_action");
        this.b.registerReceiver(this.c, intentFilter);
    }

    public void a_(Bundle bundle) {
        glk.c("Babel_telephony", "TeleUserActivityMonitor.onConnected, connection to activity recognition API established.", new Object[0]);
        hiz.c.a(this.e, 0, b());
    }

    public void a(int i) {
        glk.c("Babel_telephony", "TeleUserActivityMonitor.onConnectionSuspended, suspended activity recognition API connection.", new Object[0]);
    }

    public void a(ConnectionResult connectionResult) {
        glk.c("Babel_telephony", "TeleUserActivityMonitor.onConnectionFailed, connection to activity recognition API failed.", new Object[0]);
    }

    public void a() {
        this.a = null;
        if (this.e.e()) {
            hiz.c.a(this.e, b());
        }
        this.e.d();
        this.b.unregisterReceiver(this.c);
    }
}
