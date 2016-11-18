package p000;

import java.util.HashSet;
import java.util.Set;

public final class iio {
    public static final iio f17742a = new iio();
    private Set<iip> f17743b = new HashSet();
    private final Object f17744c = new Object();

    public void m21894a(iip iip) {
        synchronized (this.f17744c) {
            this.f17743b.add(iip);
        }
    }

    public void m21892a() {
        synchronized (this.f17744c) {
            for (iip h : this.f17743b) {
                h.mo2283h();
            }
        }
    }

    public void m21893a(int i) {
        synchronized (this.f17744c) {
            for (iip b : this.f17743b) {
                b.mo2282b(i);
            }
        }
    }
}
