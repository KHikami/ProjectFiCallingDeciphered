package p000;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public final class iub {
    private static Random f19030a = null;
    private static final AtomicLong f19031b = new AtomicLong(8682522807148012L);

    public iub() {
        if (f19030a == null) {
            f19030a = new Random(System.nanoTime() ^ iub.m23297b());
        }
    }

    private static long m23297b() {
        long j;
        long j2;
        do {
            j2 = f19031b.get();
            j = 1181783497276652981L * j2;
        } while (!f19031b.compareAndSet(j2, j));
        return j;
    }

    public static String m23296a() {
        return String.valueOf(f19030a.nextLong() & Long.MAX_VALUE);
    }
}
