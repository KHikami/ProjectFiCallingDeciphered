package p000;

import android.content.Context;
import android.os.Bundle;

final class gij implements gid, gie, kay, kcd, kcg, kcn, kcq {
    final Context f15302a;
    final kbu f15303b;
    final gif f15304c;
    final gic f15305d = new gic();

    public gij(Context context, kbu kbu) {
        this.f15302a = context;
        this.f15303b = kbu;
        this.f15304c = (gif) jyn.m25426a(context, gif.class);
        if (kbu != null) {
            kbu.m25514a((kcq) this);
        }
    }

    public <T extends ayo> void mo2276a(T t, gib gib) {
        this.f15304c.m17717a((ayo) t, gib);
    }

    public <T extends ayo> void mo2275a(T t, gia<T> gia_T) {
        this.f15304c.m17716a((ayo) t, (gia) gia_T);
    }

    public <T extends ayo> void mo2277a(T t, Exception exception, gib gib) {
        this.f15304c.m17718a((ayo) t, exception, gib);
    }

    public <T extends ayo> gie mo2274a(Class<T> cls, gia<T> gia_T, gib gib) {
        ba.m4536a(this.f15303b);
        ba.m4536a((Object) gib);
        String valueOf = String.valueOf(this.f15305d);
        String valueOf2 = String.valueOf(cls.getName());
        new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append("register ").append(valueOf).append("; ").append(valueOf2);
        this.f15304c.m17720a(this.f15305d, gia_T, cls, gib);
        m17721c(cls, gia_T, gib);
        return this;
    }

    private <T extends ayo> void m17721c(Class<T> cls, gia<T> gia_T, gib gib) {
        ba.m4536a((Object) gib);
        for (ghz ghz : jyn.m25438c(this.f15302a, ghz.class)) {
            if (ghz.mo2026a().equals(cls)) {
                ghz.mo2028a(gia_T, gib);
            }
        }
    }

    public <T extends ayo> gic mo2279b(Class<T> cls, gia<T> gia_T, gib gib) {
        ba.m4536a((Object) gib);
        String valueOf = String.valueOf(this.f15305d);
        String valueOf2 = String.valueOf(cls.getName());
        new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(valueOf2).length()).append("registerGlobal ").append(valueOf).append("; ").append(valueOf2);
        gic gic = new gic();
        this.f15304c.m17720a(gic, gia_T, cls, gib);
        m17721c(cls, gia_T, gib);
        return gic;
    }

    public void mo2278a(gic gic) {
        String valueOf = String.valueOf(this.f15305d);
        String valueOf2 = String.valueOf(gic);
        new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("unregisterGlobal ").append(valueOf).append("; ").append(valueOf2);
        this.f15304c.m17719a(gic);
    }

    public void mo643a(Bundle bundle) {
        String valueOf = String.valueOf(this.f15305d);
        new StringBuilder(String.valueOf(valueOf).length() + 9).append("onCreate ").append(valueOf);
    }

    public void o_() {
        String valueOf = String.valueOf(this.f15305d);
        new StringBuilder(String.valueOf(valueOf).length() + 10).append("onDestroy ").append(valueOf);
        this.f15304c.m17719a(this.f15305d);
    }

    public void mo645b(Bundle bundle) {
    }
}
