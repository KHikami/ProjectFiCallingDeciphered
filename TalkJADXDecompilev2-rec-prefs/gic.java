package p000;

import java.util.concurrent.atomic.AtomicInteger;

public final class gic {
    private static final AtomicInteger f15287a = new AtomicInteger(0);
    private final int f15288b = f15287a.incrementAndGet();

    public boolean m17708a(gic gic) {
        return gic.f15288b == this.f15288b;
    }

    public String toString() {
        return "Id: " + this.f15288b;
    }
}
