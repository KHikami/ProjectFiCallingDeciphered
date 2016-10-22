package defpackage;

import android.content.Context;

/* renamed from: cqf */
final class cqf implements cqc {
    private final int a;

    public cqf(Context context) {
        this.a = gwb.a(context, "babel_debug_notification_latency_ms", 30000);
    }

    public boolean a(cpw cpw) {
        return cpw.j() > ((long) this.a);
    }

    public String b(cpw cpw) {
        if (!a(cpw)) {
            return null;
        }
        return "Notification latency exceeds " + this.a + "ms";
    }
}
