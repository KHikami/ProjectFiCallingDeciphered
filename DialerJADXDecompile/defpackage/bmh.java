package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: bmh */
public class bmh extends BroadcastReceiver {
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
        boolean a = bpq.a(context, bmh.class, true);
        c = Boolean.valueOf(a);
        return a;
    }

    public void onReceive(Context context, Intent intent) {
        bot a = bnp.a(context).a();
        Object stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        a.a("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            a.e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        boolean a2 = bmi.a(context);
        if (!a2) {
            a.e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (btq.a) {
            a.f("Received unexpected installation campaign on package side");
            return;
        }
        Object obj = bmi.class;
        buf.A(obj);
        Intent intent2 = new Intent(context, obj);
        intent2.putExtra("referrer", stringExtra);
        synchronized (a) {
            context.startService(intent2);
            if (a2) {
                try {
                    if (b == null) {
                        csm csm = new csm(context, 1, "Analytics campaign WakeLock");
                        b = csm;
                        csm.a(false);
                    }
                    b.a(1000);
                } catch (SecurityException e) {
                    a.e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
                return;
            }
        }
    }
}
