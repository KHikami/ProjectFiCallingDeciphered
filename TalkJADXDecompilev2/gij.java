package defpackage;

import android.content.Context;
import android.os.Bundle;

final class gij implements gid, gie, kay, kcd, kcg, kcn, kcq {
    final Context a;
    final kbu b;
    final gif c;
    final gic d = new gic();

    public gij(Context context, kbu kbu) {
        this.a = context;
        this.b = kbu;
        this.c = (gif) jyn.a(context, gif.class);
        if (kbu != null) {
            kbu.a((kcq) this);
        }
    }

    public <T extends ayo> void a(T t, gib gib) {
        this.c.a((ayo) t, gib);
    }

    public <T extends ayo> void a(T t, gia<T> gia_T) {
        this.c.a((ayo) t, (gia) gia_T);
    }

    public <T extends ayo> void a(T t, Exception exception, gib gib) {
        this.c.a((ayo) t, exception, gib);
    }

    public <T extends ayo> gie a(Class<T> cls, gia<T> gia_T, gib gib) {
        ba.a(this.b);
        ba.a((Object) gib);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(cls.getName());
        new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append("register ").append(valueOf).append("; ").append(valueOf2);
        this.c.a(this.d, gia_T, cls, gib);
        c(cls, gia_T, gib);
        return this;
    }

    private <T extends ayo> void c(Class<T> cls, gia<T> gia_T, gib gib) {
        ba.a((Object) gib);
        for (ghz ghz : jyn.c(this.a, ghz.class)) {
            if (ghz.a().equals(cls)) {
                ghz.a(gia_T, gib);
            }
        }
    }

    public <T extends ayo> gic b(Class<T> cls, gia<T> gia_T, gib gib) {
        ba.a((Object) gib);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(cls.getName());
        new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(valueOf2).length()).append("registerGlobal ").append(valueOf).append("; ").append(valueOf2);
        gic gic = new gic();
        this.c.a(gic, gia_T, cls, gib);
        c(cls, gia_T, gib);
        return gic;
    }

    public void a(gic gic) {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(gic);
        new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("unregisterGlobal ").append(valueOf).append("; ").append(valueOf2);
        this.c.a(gic);
    }

    public void a(Bundle bundle) {
        String valueOf = String.valueOf(this.d);
        new StringBuilder(String.valueOf(valueOf).length() + 9).append("onCreate ").append(valueOf);
    }

    public void o_() {
        String valueOf = String.valueOf(this.d);
        new StringBuilder(String.valueOf(valueOf).length() + 10).append("onDestroy ").append(valueOf);
        this.c.a(this.d);
    }

    public void b(Bundle bundle) {
    }
}
