package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: boo */
public final class boo extends bpb {
    boolean a;
    boolean b;
    AlarmManager c;

    protected boo(bnp bnp) {
        super(bnp);
        this.c = (AlarmManager) g().getSystemService("alarm");
    }

    protected final void a() {
        try {
            this.c.cancel(c());
            if (bom.e() > 0) {
                ActivityInfo receiverInfo = g().getPackageManager().getReceiverInfo(new ComponentName(g(), bmc.class), 2);
                if (receiverInfo != null && receiverInfo.enabled) {
                    b("Receiver registered. Using alarm for local dispatch.");
                    this.a = true;
                }
            }
        } catch (NameNotFoundException e) {
        }
    }

    public final void b() {
        o();
        this.b = false;
        this.c.cancel(c());
    }

    final PendingIntent c() {
        Intent intent = new Intent(g(), bmc.class);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(g(), 0, intent, 0);
    }
}
