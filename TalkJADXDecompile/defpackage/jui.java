package defpackage;

import android.text.TextUtils;

/* renamed from: jui */
public abstract class jui implements jvb {
    private static final kda a;
    private static final kda b;
    private static final kad c;
    private static final kda d;
    private static final kda e;
    private static final kda f;
    private static final kda g;

    static {
        a = new kda("debug.plus.apiary_token", "");
        b = new kda("debug.plus.backend.url", "");
        c = new kad("debug.plus.tracing_enabled");
        d = new kda("debug.plus.tracing_token", "");
        e = new kda("debug.plus.tracing_path", "");
        f = new kda("debug.plus.tracing_level", "");
        g = new kda("debug.plus.experiment_override", "");
    }

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
