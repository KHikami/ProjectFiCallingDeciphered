package p000;

import java.util.concurrent.atomic.AtomicInteger;

final class fmg implements fmf {
    private static final AtomicInteger f13462a = new AtomicInteger(1);

    fmg() {
    }

    public fme mo2035a() {
        return new fme(f13462a.getAndIncrement());
    }

    public fme mo2036a(int i) {
        return new fme(-1);
    }
}
