import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class bmc extends BroadcastReceiver {
    static Object a;
    static csm b;
    private static Boolean c;

    static {
        a = new Object();
    }

    public static boolean a(Context context) {
        buf.A((Object) context);
        if (c != null) {
            return c.booleanValue();
        }
        boolean a = bpq.a(context, bmc.class, false);
        c = Boolean.valueOf(a);
        return a;
    }

    public final void onReceive(Context context, Intent intent) {
        bot a = bnp.a(context).a();
        String action = intent.getAction();
        if (btq.a) {
            a.a("Device AnalyticsReceiver got", action);
        } else {
            a.a("Local AnalyticsReceiver got", action);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean a2 = bmd.a(context);
            Intent intent2 = new Intent(context, bmd.class);
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (a) {
                context.startService(intent2);
                if (a2) {
                    try {
                        if (b == null) {
                            csm csm = new csm(context, 1, "Analytics WakeLock");
                            b = csm;
                            csm.a(false);
                        }
                        b.a(1000);
                    } catch (SecurityException e) {
                        a.e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                    return;
                }
            }
        }
    }
}
