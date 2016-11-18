package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

public final class gic {
    private static final AtomicInteger a = new AtomicInteger(0);
    private final int b = a.incrementAndGet();

    public boolean a(gic gic) {
        return gic.b == this.b;
    }

    public String toString() {
        return "Id: " + this.b;
    }
}
