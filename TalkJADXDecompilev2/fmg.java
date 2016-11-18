package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

final class fmg implements fmf {
    private static final AtomicInteger a = new AtomicInteger(1);

    fmg() {
    }

    public fme a() {
        return new fme(a.getAndIncrement());
    }

    public fme a(int i) {
        return new fme(-1);
    }
}
