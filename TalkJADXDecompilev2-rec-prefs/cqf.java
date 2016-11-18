package p000;

import android.content.Context;

final class cqf implements cqc {
    private final int f8830a;

    public cqf(Context context) {
        this.f8830a = gwb.m1492a(context, "babel_debug_notification_latency_ms", 30000);
    }

    public boolean mo1379a(cpw cpw) {
        return cpw.mo730j() > ((long) this.f8830a);
    }

    public String mo1380b(cpw cpw) {
        if (!mo1379a(cpw)) {
            return null;
        }
        return "Notification latency exceeds " + this.f8830a + "ms";
    }
}
