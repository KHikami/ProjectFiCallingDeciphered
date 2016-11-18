package p000;

import android.content.Context;

final class cqd implements cqc {
    private final int f8829a;

    public cqd(Context context) {
        this.f8829a = gwb.m1492a(context, "babel_debug_in_app_msg_receive_latency_ms", 5000);
    }

    public boolean mo1379a(cpw cpw) {
        return cpw.mo726f() >= this.f8829a;
    }

    public String mo1380b(cpw cpw) {
        if (!mo1379a(cpw)) {
            return null;
        }
        return "In app message latency exceeds " + this.f8829a + "ms";
    }
}
