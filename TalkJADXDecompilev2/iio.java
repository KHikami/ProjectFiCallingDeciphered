package defpackage;

import java.util.HashSet;
import java.util.Set;

public final class iio {
    public static final iio a = new iio();
    private Set<iip> b = new HashSet();
    private final Object c = new Object();

    public void a(iip iip) {
        synchronized (this.c) {
            this.b.add(iip);
        }
    }

    public void a() {
        synchronized (this.c) {
            for (iip h : this.b) {
                h.h();
            }
        }
    }

    public void a(int i) {
        synchronized (this.c) {
            for (iip b : this.b) {
                b.b(i);
            }
        }
    }
}
