package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: iio */
public final class iio {
    public static final iio a;
    private Set<iip> b;
    private final Object c;

    public iio() {
        this.b = new HashSet();
        this.c = new Object();
    }

    static {
        a = new iio();
    }

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
