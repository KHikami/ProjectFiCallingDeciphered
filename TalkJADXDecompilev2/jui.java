package defpackage;

import android.text.TextUtils;

public abstract class jui implements jvb {
    private static final kda a = new kda("debug.plus.apiary_token", "");
    private static final kda b = new kda("debug.plus.backend.url", "");
    private static final kad c = new kad("debug.plus.tracing_enabled");
    private static final kda d = new kda("debug.plus.tracing_token", "");
    private static final kda e = new kda("debug.plus.tracing_path", "");
    private static final kda f = new kda("debug.plus.tracing_level", "");
    private static final kda g = new kda("debug.plus.experiment_override", "");

    public String a() {
        return a.a();
    }

    public boolean b() {
        return false;
    }

    public String c() {
        return d.a();
    }

    public String d() {
        String a = e.a();
        if (a != null) {
            a = a.trim();
        }
        if (TextUtils.isEmpty(a)) {
            return ".*";
        }
        return a;
    }

    public String e() {
        return f.a();
    }

    public String f() {
        return g.a();
    }
}
