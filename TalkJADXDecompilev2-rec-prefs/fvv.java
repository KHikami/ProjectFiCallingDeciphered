package p000;

import android.content.Context;

public class fvv {
    private final jcf f14122a;
    private final biw f14123b;

    fvv(Context context) {
        this.f14122a = (jcf) jyn.m25426a(context, jcf.class);
        this.f14123b = (biw) jyn.m25426a(context, biw.class);
    }

    public boolean m16337a(int i) {
        if (this.f14123b.mo564a("babel_device_presence", false)) {
            return this.f14122a.mo3456a(i).mo3439a("share_device_presence_preferences_key", false);
        }
        return false;
    }

    public boolean m16339b(int i) {
        return this.f14122a.mo3456a(i).mo3439a("last_seen_bool_key", false);
    }

    public void m16336a(int i, boolean z) {
        this.f14122a.mo3464b(i).m23881b("last_seen_bool_key", z).m23891d();
    }

    public boolean m16340c(int i) {
        return this.f14122a.mo3456a(i).mo3439a("rich_status_device_reporting_key", false);
    }

    public void m16338b(int i, boolean z) {
        this.f14122a.mo3464b(i).m23881b("rich_status_device_reporting_key", z).m23891d();
    }
}
