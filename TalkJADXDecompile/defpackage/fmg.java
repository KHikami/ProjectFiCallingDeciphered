package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fmg */
final class fmg implements fmf {
    private static final AtomicInteger a;

    fmg() {
    }

    static {
        a = new AtomicInteger(1);
    }

    public fme a() {
        return new fme(a.getAndIncrement());
    }

    public fme a(int i) {
        return new fme(-1);
    }
}
