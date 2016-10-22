package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.List;

/* renamed from: juj */
public final class juj implements jum {
    private final Context a;
    private jux[] b;

    public juj(Context context) {
        this.a = context;
    }

    public void a(juo juo) {
        String str;
        if (this.b == null) {
            a();
        }
        for (jux jux : this.b) {
            Context context = juo.g;
            juo = jux.a();
        }
        juo.j = juo.h.f();
        if (Log.isLoggable("HttpOperation", 3)) {
            str = "Starting op: ";
            String valueOf = String.valueOf(juo.k());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (juo.h.e()) {
            juo.n = 2;
        }
        if (juo.j != null) {
            juo.j.a(juo.j(), juo.l());
        }
        juo.o();
        juo.p();
        if (juo.j != null) {
            juo.j.a(juo.p);
            juo.p.i();
            juo.j.d();
            juo.r();
            if (juo.h.f() == null) {
                juo.j.a("HttpOperation", "");
            }
        }
        if (juo.n() && Log.isLoggable("HttpOperation", 4)) {
            str = String.valueOf(juo.j());
            int i = juo.k;
            String valueOf2 = String.valueOf(juo.m);
            new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(valueOf2).length()).append("[").append(str).append("] failed due to error: ").append(i).append(" ").append(valueOf2);
        }
    }

    private synchronized void a() {
        List c = jyn.c(this.a, jux.class);
        this.b = (jux[]) c.toArray(new jux[c.size()]);
    }
}
