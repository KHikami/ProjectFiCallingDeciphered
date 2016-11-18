package p000;

import android.text.TextUtils;

public abstract class jui implements jvb {
    private static final kda f13568a = new kda("debug.plus.apiary_token", "");
    private static final kda f13569b = new kda("debug.plus.backend.url", "");
    private static final kad f13570c = new kad("debug.plus.tracing_enabled");
    private static final kda f13571d = new kda("debug.plus.tracing_token", "");
    private static final kda f13572e = new kda("debug.plus.tracing_path", "");
    private static final kda f13573f = new kda("debug.plus.tracing_level", "");
    private static final kda f13574g = new kda("debug.plus.experiment_override", "");

    public String mo2052a() {
        return f13568a.m25576a();
    }

    public boolean mo2053b() {
        return false;
    }

    public String mo2054c() {
        return f13571d.m25576a();
    }

    public String mo2055d() {
        String a = f13572e.m25576a();
        if (a != null) {
            a = a.trim();
        }
        if (TextUtils.isEmpty(a)) {
            return ".*";
        }
        return a;
    }

    public String mo2056e() {
        return f13573f.m25576a();
    }

    public String mo2057f() {
        return f13574g.m25576a();
    }
}
