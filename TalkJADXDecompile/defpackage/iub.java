package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: iub */
public final class iub {
    private static Random a;
    private static final AtomicLong b;

    static {
        a = null;
        b = new AtomicLong(8682522807148012L);
    }

    public iub() {
        if (a == null) {
            a = new Random(System.nanoTime() ^ iub.b());
        }
    }

    private static long b() {
        long j;
        long j2;
        do {
            j2 = b.get();
            j = 1181783497276652981L * j2;
        } while (!b.compareAndSet(j2, j));
        return j;
    }

    public static String a() {
        return String.valueOf(a.nextLong() & Long.MAX_VALUE);
    }
}
