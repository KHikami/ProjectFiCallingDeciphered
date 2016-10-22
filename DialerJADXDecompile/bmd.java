import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

public final class bmd extends Service {
    private static Boolean b;
    final Handler a;

    public bmd() {
        this.a = new Handler();
    }

    public static boolean a(Context context) {
        buf.A((Object) context);
        if (b != null) {
            return b.booleanValue();
        }
        boolean a = bpq.a(context, bmd.class);
        b = Boolean.valueOf(a);
        return a;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        bot a = bnp.a((Context) this).a();
        if (btq.a) {
            a.b("Device AnalyticsService is starting up");
        } else {
            a.b("Local AnalyticsService is starting up");
        }
    }

    public final void onDestroy() {
        bot a = bnp.a((Context) this).a();
        if (btq.a) {
            a.b("Device AnalyticsService is shutting down");
        } else {
            a.b("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            synchronized (bmc.a) {
                csm csm = bmc.b;
                if (csm != null && csm.a.isHeld()) {
                    csm.a();
                }
            }
        } catch (SecurityException e) {
        }
        bnp a = bnp.a((Context) this);
        bot a2 = a.a();
        String action = intent.getAction();
        if (btq.a) {
            a2.a("Device AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        } else {
            a2.a("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            a.c().a(new bme(this, i2, a, a2));
        }
        return 2;
    }
}
